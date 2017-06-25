package priv.wzq.wechat.service;

import java.util.List;

import priv.wzq.ssm.po.ExOpenid;
import priv.wzq.ssm.po.Openid;
import priv.wzq.ssm.service.OpenidService;
import priv.wzq.wechat.message.resp.TextMessage;
import priv.wzq.wechat.utils.MessageUtil;

public class CoreAdminService {
	/**
	 * 设置最高权限
	 * 
	 * @param openidService
	 * @param fromUserName
	 */
	public static String doSetAdmin(OpenidService openidService,
			String fromUserName, String content, TextMessage textMessage) {
		String param = getParameter(content);
		if (param.trim().equals("wongzeqi")) {
			Openid openid = new Openid();
			openid.setOpenId(fromUserName);
			openid.setRole(3);// 设置最高权限
			openidService.setRoleByOpenid(openid);
			textMessage.setContent("设置成功!");
		} else {
			textMessage.setContent("密钥错误!");
		}
		return MessageUtil.textMessageToXml(textMessage);
	}

	/**
	 * 
	 * @param content
	 * @return
	 */
	public static String getParameter(String content) {
		String cmd[] = content.split("-");
		if (cmd.length == 2) {
			return cmd[1].trim();
		} else {
			return null;
		}
	}

	/**
	 * 授予普通管理员权限
	 * 
	 * @param openidService
	 * @param fromUserName
	 * @param content
	 * @param textMessage
	 */
	public static String doSetOthers(OpenidService openidService,
			String fromUserName, String content, TextMessage textMessage) {
		String param = getParameter(content);
		if (param != null && !param.equals("")) {
			if (openidService.getRoleByOpenid(fromUserName) < 1) {
				textMessage.setContent("参数错误！");
			} else {
				Openid openid = new Openid();
				openid.setRole(2);
				openid.setSchoolnumber(param);
				openidService.setRoleBySchoolNumber(openid);
				textMessage.setContent("设置成功!");
			}
		} else {
			textMessage.setContent("参数错误！");
		}
		return MessageUtil.textMessageToXml(textMessage);
	}

	/**
	 * 授予普通管理员权限
	 * 
	 * @param openidService
	 * @param fromUserName
	 * @param content
	 * @param textMessage
	 */
	public static String doBdOthers(OpenidService openidService,
			String fromUserName, String content, TextMessage textMessage) {
		String param = getParameter(content);
		if (param != null && !param.equals("")) {
			if (openidService.getRoleByOpenid(fromUserName) < 1) {
				textMessage.setContent("参数错误！");
			} else {
				Openid openid = new Openid();
				openid.setRole(1);
				openid.setSchoolnumber(param);
				openidService.setRoleBySchoolNumber(openid);
				textMessage.setContent("设置成功");
			}
		} else {
			textMessage.setContent("参数错误！");
		}
		return MessageUtil.textMessageToXml(textMessage);
	}

	
	/**
	 * 查看所有管理员
	 * @param openidService
	 * @param fromUserName
	 * @param content
	 * @param textMessage
	 * @return
	 */
	public static String doGetAdminInfo(OpenidService openidService,
			String fromUserName, String content, TextMessage textMessage) {
		String msg = "所有管理员：\n";
		List<ExOpenid> exOpenids = openidService.getAdminInfo();
		if (exOpenids.size() >= 1) {
			for (int i = 0; i < exOpenids.size(); i++) {
				msg +=  exOpenids.get(i).getName() + "      "
						+ exOpenids.get(i).getSchoolnumber() + "       "
						+ exOpenids.get(i).getRole() + "\n";
			}
			
			textMessage.setContent(msg);
		}else{
			textMessage.setContent("不存在管理员！");
		}
		return MessageUtil.textMessageToXml(textMessage);
	}
	
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "";
		for(int i = 0 ;i<10 ;i++){
			msg += ""+i;		
		}
		System.out.println(msg);
	}
	
}
