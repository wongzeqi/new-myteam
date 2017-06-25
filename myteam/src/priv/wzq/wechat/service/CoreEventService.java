package priv.wzq.wechat.service;

import priv.wzq.ssm.po.Openid;
import priv.wzq.ssm.service.MemberService;
import priv.wzq.ssm.service.OpenidService;
import priv.wzq.wechat.message.resp.TextMessage;
import priv.wzq.wechat.utils.MessageUtil;

public class CoreEventService {
	//处理订阅事件
	/**
	 * 订阅事件
	 * @param openidService
	 * @param textMessage
	 * @return
	 */
	public static String doSubscribe(OpenidService openidService,TextMessage textMessage){
		String respMessage = null;
		//一关注提供这些服务
		textMessage.setContent("欢迎关注北方民族大学Java项目开发创新团队！\n"
				+ "回复【1】加入团队！\n" + "回复【2】报名比赛！\n" + "回复【3】团队简介！\n"
						+ "回复【4】回到菜单！");
		// 将文本消息对象转换成xml字符串
		respMessage = MessageUtil.textMessageToXml(textMessage);
		// 添加openid到数据库 (这个是游客信息)
		Openid openid = new Openid();
		openid.setOpenId(textMessage.getToUserName());
		openidService.insertOpenid(openid);
		return respMessage;
	}
	
	
	/**
	 * 取消订阅
	 * @param openidService
	 * @param memberService
	 * @param fromUserName
	 * @throws Exception
	 */
	public static void doUnsubscribe(OpenidService openidService, MemberService memberService,String fromUserName) throws Exception{
		openidService.deleteByOpenid(fromUserName);
		memberService.deleteMemberByOpenid(fromUserName);
		
	}
	
}
