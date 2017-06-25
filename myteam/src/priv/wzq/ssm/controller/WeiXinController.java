package priv.wzq.ssm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import priv.wzq.ssm.service.MemberService;
import priv.wzq.ssm.service.OpenidService;
import priv.wzq.ssm.service.QdItemService;
import priv.wzq.ssm.service.QjItemService;
import priv.wzq.wechat.message.resp.NewsMessage;
import priv.wzq.wechat.message.resp.TextMessage;
import priv.wzq.wechat.service.CoreAdminService;
import priv.wzq.wechat.service.CoreEventService;
import priv.wzq.wechat.service.CoreMemberService;
import priv.wzq.wechat.service.CoreNumberService;
import priv.wzq.wechat.service.CoreSendEmailService;
import priv.wzq.wechat.utils.MessageUtil;
import priv.wzq.wechat.utils.SignUtil;

@Controller
@RequestMapping("wechat")
public class WeiXinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Autowired
	private   OpenidService openidService;
	@Autowired
	private MemberService memberService;
	@Autowired
	private QjItemService qjItemService;
	@Autowired
	private QdItemService qdItemService;
	
	public OpenidService getOpenidService() {
		return openidService;
	}
	public void setOpenidService(OpenidService openidService) {
		this.openidService = openidService;
	}
	public MemberService getMemberService() {
		return memberService;
	}
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("接口测试开始！！！");
			//微信加密签名
			String signature = request.getParameter("signature");
			//时间戳
			String timestamp = request.getParameter("timestamp");
			//随机数
			String nonce = request.getParameter("nonce");
			//随机字符串
			String echostr = request.getParameter("echostr");
			
			PrintWriter out = response.getWriter();
			//通过校验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
			if(SignUtil.checkSignature(signature,timestamp,nonce)){
				out.print(echostr);
			}
			out.close();
			out = null;
		response.encodeRedirectURL("success.jsp");
			
		
	}
	/**
	 * 处理微信服务器发来的消息
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(method=RequestMethod.POST)
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, UnsupportedEncodingException{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		
		//回复的信息（xml）
		String respMessage = null;
		//用户发送的消息类型
		String msgType = null;
		String toUserName = null;
		String fromUserName=null;
		String content = null;
		Map<String, String> requestMap = null;
		try {
			// xml请求解析
			requestMap = MessageUtil.pareXml(request);
			// 发送方帐号（open_id）
			fromUserName = requestMap.get("FromUserName");
			// 公众帐号
			toUserName = requestMap.get("ToUserName");
			// 消息类型
			 msgType = requestMap.get("MsgType");
			//获取用户发送的信息
			 content= requestMap.get("Content");
			//创建回复的文本对象
			TextMessage textMessage = new TextMessage();
			textMessage.setToUserName(fromUserName);
			textMessage.setFromUserName(toUserName);
			textMessage.setCreateTime(new Date().getTime());
			textMessage.setMsgType(MessageUtil.RESP_MESSSAGE_TYPE_TEXT);
			textMessage.setFuncFlag(0);
			//创建回复的图文对象
			NewsMessage newsMessage = new NewsMessage();
			newsMessage.setToUserName(fromUserName);
			newsMessage.setFromUserName(toUserName);
			newsMessage.setCreateTime(new Date().getTime());
			newsMessage.setMsgType(MessageUtil.RESP_MESSSAGE_TYPE_NEWS);
			newsMessage.setFuncFlag(0);
			if (msgType.equals(MessageUtil.REQ_MESSSAGE_TYPE_EVENT)){//事件推送
				String eventType = requestMap.get("Event");
				if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)){// 订阅
					respMessage = CoreEventService.doSubscribe(openidService,textMessage);
				}else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {// 取消订阅
						CoreEventService.doUnsubscribe(openidService, memberService, fromUserName);
				} 
			}else if (msgType.equals(MessageUtil.REQ_MESSSAGE_TYPE_TEXT))	{//文本消息处理
				//获取用户的权限
				int role = openidService.getRoleByOpenid(fromUserName);
				content = content.trim();
				if(content.contains("绑定")&&role>=0){
					respMessage =  CoreMemberService.doBinding(textMessage, content, memberService, openidService);
				}else if(content.contains("查看信息")&&role>0){
					respMessage = CoreMemberService.doGetMessage(memberService,textMessage,content);
				}else if(content.contains("查看人数")&&role>0){
					respMessage = CoreMemberService.doGetNumber(memberService,textMessage,content);
				}else if(content.contains("发送邮件")&&role>=2){
						respMessage =  CoreSendEmailService.doPostExcel(memberService, textMessage, qjItemService, content,qdItemService);
				}else if(content.contains("通过")&&role>=2){
					respMessage = CoreMemberService.doPassStudent(memberService,openidService,textMessage,content);
				}else if(content.contains("发送请假信息")&&role>=2){
						respMessage =  CoreSendEmailService.doPostExcel(memberService, textMessage, qjItemService, content,qdItemService);
				}else if(content.contains("发送签到信息")&&role>=2){
						respMessage =  CoreSendEmailService.doPostExcel(memberService, textMessage, qjItemService, content,qdItemService);
				}else if(content.contains("查看请假次数")&&role>=1){
					respMessage = CoreMemberService.doGetQjTimes(qjItemService,content,textMessage);
				}else if(content.contains("查看签到次数")&&role>=1){
					respMessage = CoreMemberService.doGetQjTimes(qjItemService,content,textMessage);
				}else if(isNumeric(content)&&Integer.valueOf(content)<=7){
					if(role==0&&Integer.valueOf(content)<=4){
						respMessage = CoreNumberService.doVisitorMessage(newsMessage,textMessage, content);
					}else{
						respMessage = CoreNumberService.doMemberMessage(newsMessage, content, textMessage, role);
					}
				}else if(content.contains("查看值班次数")&&role>=1){
					
				}else if(content.contains("设置最高权限")&&role>=1){
					respMessage = CoreAdminService.doSetAdmin(openidService,fromUserName,content,textMessage);
				}else if(content.contains("授予权限")&&role==3){
					respMessage = CoreAdminService.doSetOthers(openidService,fromUserName,content,textMessage);
				}else if(content.contains("剥夺权限")&&role==3){
					respMessage = CoreAdminService.doBdOthers(openidService,fromUserName,content,textMessage);
				}else if(content.contains("查看管理员")&&role==3){
					respMessage = CoreAdminService.doGetAdminInfo(openidService, fromUserName, content, textMessage);
				}else{
					textMessage.setContent("无法识别的命令？！");
					respMessage = MessageUtil.textMessageToXml(textMessage);
				}
				
				
			}else{
				textMessage.setContent("还不支持这样的消息类型！");
				respMessage = MessageUtil.textMessageToXml(textMessage);
			}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		//响应消息
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.print(respMessage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}
	
	
	private boolean isNumeric(String str){ 
	   Pattern pattern = Pattern.compile("[0-9]*"); 
	   Matcher isNum = pattern.matcher(str);
	   if( !isNum.matches() ){
	       return false; 
	   } 
	   return true;
	}
	
}
