package priv.wzq.wechat.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import priv.wzq.ssm.po.ExOpenid;
import priv.wzq.ssm.po.Member;
import priv.wzq.ssm.po.Openid;
import priv.wzq.ssm.service.MemberService;
import priv.wzq.ssm.service.OpenidService;
import priv.wzq.ssm.service.QjItemService;
import priv.wzq.wechat.message.resp.TextMessage;
import priv.wzq.wechat.utils.MessageUtil;


public class CoreMemberService {
	/**
	 * 处理getMessage命令
	 * @param memberService
	 * @param textMessage
	 * @throws Exception 
	 */
	public static String doGetMessage(MemberService memberService,TextMessage textMessage,String content) throws Exception{
		String param = getParameter(content);
		if(param!=null){
			List<Member> members = memberService.getInfoByNameAndSchoolNumber(param);
			if(members.size()!=0){
				
				String sfz = members.get(0).getIdcard();
				String ssfz = sfz.substring(6, 14);
				
				String info = "姓名："+members.get(0).getName()+"\n"
						+"学号："+members.get(0).getSchoolnumber()+"\n"
						+"学院："+members.get(0).getAcademy()+"\n"
						+"专业："+members.get(0).getMajor()+"\n"
						+"班级："+members.get(0).getNation()+"\n"
						+"性别："+members.get(0).getSex()+"\n"
						+"qq："+members.get(0).getQq()+"\n"
						+"号码："+members.get(0).getPhone()+"\n"
						+"身份证号："+"xxxxxx"+ssfz+"xxxx";
				
				textMessage.setContent(info);
				
			}
			else{
				textMessage.setContent("没有查询到指定的用户信息！");
			}
		}else{
			//如果没有参数默认查询自己的信息
			Member m = memberService.getInfoByOpenid(textMessage.getToUserName());
			if(m==null){
				//如果没有绑定无法查询信息
				textMessage.setContent("您还未绑定学号，请先绑定学号！\n"
						+ "绑定格式如：绑定+20152154");
			}else{
				String sfz = m.getIdcard();
				String ssfz = sfz.substring(6, 14);
				String info = "姓名："+m.getName()+"\n"
						+"学号："+m.getSchoolnumber()+"\n"
						+"学院："+m.getAcademy()+"\n"
						+"专业："+m.getMajor()+"\n"
						+"班级："+m.getNation()+"\n"
						+"性别："+m.getSex()+"\n"
						+"qq："+m.getQq()+"\n"
						+"号码："+m.getPhone()+"\n"
						+"身份证号："+"xxxxxx"+ssfz+"xxxx";
				
				textMessage.setContent(info);
			}
		}
		return  MessageUtil.textMessageToXml(textMessage);
	}
	
	
	/**
	 * 处理查询人数的命令
	 * @param memberService
	 * @param textMessage
	 * @param content
	 * @return 
	 * @throws Exception 
	 */
	public static String doGetNumber(MemberService memberService,
			TextMessage textMessage, String content) {
		String param = getParameter(content);
		if(param!=null){
			//有参数
			if(param!="男"||param!="女"){
				textMessage.setContent("命令参数有误！");
			}
			int sum = memberService.getCountBySex(param);
			textMessage.setContent("团队"+param+"生:"+sum+"人");
		}else{
			//没有参数默认查看团队人数
			try {
				textMessage.setContent("团队人数："+memberService.getMemberCount()+"人");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return MessageUtil.textMessageToXml(textMessage);
	}
	
	
	
	
	
	/**
	 * 绑定用户的学号
	 * @param textMessage
	 * @param content
	 * @param memberService
	 * @return
	 */
	public static String doBinding(TextMessage textMessage,String content,MemberService memberService,OpenidService openidService){
		String param = getParameter(content);
		Member member = memberService.getInfoBySchoolNumber(param);
		//判断这个人是否报名
		if(member!=null){
			String schoolNumber = openidService.getSchoolNumberByOpenid(textMessage.getToUserName());
			//如果学号为空说明没有绑定
			if(schoolNumber==null||schoolNumber.equals("")){
				Member m = new Member();
				m.setOpenid(textMessage.getToUserName());
				m.setSchoolnumber(param);
				memberService.setOpenId(m);
				Openid openid = new Openid();
				openid.setSchoolnumber(param);
				openid.setOpenId(textMessage.getToUserName());
				openidService.setSchoolNumber(openid);
				textMessage.setContent("绑定成功！");
			}else{
				textMessage.setContent("你已经绑定，不需要重复绑定！");
			}
		}else{
			textMessage.setContent("您是游客，不需要绑定，或者管理员还在审核。");
		}
		return MessageUtil.textMessageToXml(textMessage);
	}
	
	/**
	 * 
	 * @param content
	 * @return
	 */
	public static String getParameter(String content){
		String cmd [] = content.split("-");
		if(cmd.length==2){
			return cmd[1].trim();
		}else{
			return null;
		}
	}
	
	
	/**
	 * 获取请假次数
	 * @param qjItemService
	 * @param content
	 * @param textMessage
	 * @return
	 */

	public static String doGetQjTimes(QjItemService qjItemService, String content, TextMessage textMessage) {
		String param = getParameter(content);
		int times = 0;
		ExOpenid openid = new ExOpenid();
		if(param==null){
			openid.setOpenid(textMessage.getToUserName());
			times = qjItemService.getQjTimes(openid);
		}else if(isNumeric(param)){//学号查询
			openid.setSchoolnumber(param);
			times = qjItemService.getQjTimes(openid);
		}else{
			openid.setQjtype(param);
			openid.setOpenid(textMessage.getToUserName());
			times = qjItemService.getQjTimes(openid);
		}
		textMessage.setContent("次数："+times+"次");
		return MessageUtil.textMessageToXml(textMessage);
	}
	/**
	 * 管理员审核通过这个学生的报名加入团队
	 * @param memberService
	 * @param openidService
	 * @param textMessage
	 * @param content 
	 * @return
	 */
	public static String doPassStudent(MemberService memberService,
			OpenidService openidService, TextMessage textMessage, String content) {
			String param = getParameter(content);//获得这个人的学号
			if(memberService.getInfoBySchoolNumber(param)!=null){
				Openid o = new Openid();
				o.setSchoolnumber(param);
				openidService.setRoleBySchoolNumber(o);
				return "成功通过这个同学！";
			}else{
				return "这个人还没有报名，您的学号输入有问题！";
			}
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	private static boolean isNumeric(String str){ 
	   Pattern pattern = Pattern.compile("[0-9]+"); 
	   Matcher isNum = pattern.matcher(str);
	   if( !isNum.matches() ){
	       return false; 
	   } 
	   return true;
	}
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isNumeric("20152154"));    
	}


	
	
}
