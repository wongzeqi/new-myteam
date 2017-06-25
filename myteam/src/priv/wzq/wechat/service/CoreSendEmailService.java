package priv.wzq.wechat.service;

import java.io.File;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;

import priv.wzq.ssm.po.ExQditems;
import priv.wzq.ssm.po.Member;
import priv.wzq.ssm.po.QjitemsCostom;
import priv.wzq.ssm.service.MemberService;
import priv.wzq.ssm.service.QdItemService;
import priv.wzq.ssm.service.QjItemService;
import priv.wzq.ssm.util.ExcelEntity;
import priv.wzq.ssm.util.ExcelExporter;
import priv.wzq.ssm.util.MailUtil;
import priv.wzq.wechat.message.resp.TextMessage;
import priv.wzq.wechat.utils.MessageUtil;

public class CoreSendEmailService {

	/**
	 * 常量
	 */
	
	//成员信息列名
	static String CYXXCN[]  = {
			"姓名",
			"学号",
			"学院",
			"专业",
			"班级",
			"民族",
			"性别",
			"qq",
			"电话号码",
			"身份证号"
	};
	//成员信息方法名
	static String CYXXMN [] = {
			"getName",
			"getSchoolnumber",
			"getAcademy",
			"getMajor",
			"getClazz",
			"getNation",
			"getSex",
			"getQq",
			"getPhone",
			"getIdcard"
	};
	static String QJXXCN[]  = {
			"姓名",
			"学号",
			"类型",
			"周次",
			"原因",
			"时间"
	};
	static String QJXXMN[] = {
			"getName",
			"getSchoolnumber",
			"getQjtype",
			"getQjweek",
			"getReason",
			"getQjtime"
	};
	static String QDXXCN[]  = {
		"姓名",
		"学号",
		"类型",
		"周次",
		"原因",
		"时间"
};
static String QDXXMN[] = {
		"getName",
		"getSchoolnumber",
		"getQjtype",
		"getQjweek",
		"getReason",
		"getQjtime"
};
	
	
	/**
	 * 
	 * @param memberService
	 * @param textMessage
	 * @param content
	 * @param qdItemService 
	 * @return
	 * @throws Exception 
	 * 发送邮件
	 */
	public static String doPostExcel(MemberService memberService,
			TextMessage textMessage,QjItemService qjItemService, String content, QdItemService qdItemService) throws Exception{
		String param = getParameter(content);
		if(param==null&&content.contains("请假")){
			System.out.println("开始前");
			List<Member> members = memberService.getAllQQAndSchoolNumber();
			System.out.println("循环开始");
			for(int i =0 ;i<members.size();i++){//发送邮件
				String qqMail = members.get(i).getQq()+"@qq.com";
				String sn = members.get(i).getSchoolnumber();
				//查请假信息
				List<QjitemsCostom> qjitemsCostoms = qjItemService.getAllQjitemsBySchoolNumber(sn);
				String fileName = "c:\\QingJiaMessage.xlsx";
				sendEmail(fileName, QJXXCN, QJXXMN, qjitemsCostoms, qqMail);
				System.out.println(i);
			}
			System.out.println("循环结束");
			textMessage.setContent("表格发送成功！");
		}
		else if(param==null&&content.contains("签到")){
			List<Member> members = memberService.getAllQQAndSchoolNumber();
			for(Member m :members){//发送邮件
				String qqMail = m.getQq()+"@qq.com";
				String sn = m.getSchoolnumber();
				//查请假信息
				List<ExQditems> exQditems = qdItemService.getAllQjitemsBySchoolNumber(sn);
				String fileName = "c:\\Java项目开发创新团队成员请假信息一览表.xlsx";
				sendEmail(fileName, QDXXCN, QDXXMN, exQditems, qqMail);
			}
			textMessage.setContent("表格发送成功！");
		}
		else if(param.equals("成员信息")){
			String qqmail = getQQMail(memberService, textMessage.getToUserName());
			//获取所有成员的List
			List<Member> memberList =  memberService.getAllMember();
			String fileName = "c:\\Java项目开发创新团队成员信息一览表.xlsx";
			sendEmail(fileName, CYXXCN, CYXXMN, memberList, qqmail);
			textMessage.setContent("表格发送成功！");
		}
		else if((param.equals("会议")||param.equals("值班")||param.equals("培训"))&&content.contains("请假")){
			String qqmail = getQQMail(memberService, textMessage.getToUserName());
			List<QjitemsCostom> qjitemsCostoms = qjItemService.getAllQjitemsCoustomByType(param);
			String fileName = "c:\\Java项目开发创新团队"+param+"请假.xlsx";
			sendEmail(fileName, QJXXCN, QJXXMN, qjitemsCostoms, qqmail);
			textMessage.setContent("表格发送成功！");
		}else if((param.equals("会议")||param.equals("值班")||param.equals("培训"))&&content.contains("签到")){//发送签到信
			String qqmail = getQQMail(memberService, textMessage.getToUserName());
			List<ExQditems> qditemsCostoms = qdItemService.getAllExQditemsByType(param);
			String fileName = "c:\\Java项目开发创新团队"+param+"请假.xlsx";
			sendEmail(fileName, QJXXCN, QJXXMN, qditemsCostoms, qqmail);
			textMessage.setContent("表格发送成功！");
		}
		else{
			textMessage.setContent("无法识别该命令！");
		}
		return  MessageUtil.textMessageToXml(textMessage);
	}

	/**
	 * 发送邮件（提供给该类的业务方法使用）ZZ
	 * @param fileName
	 * @param columnNames
	 * @param methodNames
	 * @param list
	 * @param qqmail
	 * @throws Exception
	 */
	private static void sendEmail(String fileName,String[] columnNames,String [] methodNames,List<?> list,String qqmail) throws Exception{
		ExcelEntity<?> excelEntity = (ExcelEntity<?>) new ExcelEntity<>(fileName, columnNames, methodNames, list);
		Workbook excel = ExcelExporter.export2Excel(excelEntity);
		File file = ExcelExporter.saveWorkBook2007ToFile(excel, fileName);
		MailUtil.sendAttendedFileMail(qqmail, file,fileName.substring(3));
		System.out.println("发送方法执行----〉");
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
	public static String getParameter(String content,int index){
		String cmd [] = content.split("-");
		if(cmd.length==3&&index<=3&&index>=0){
			return cmd[index].trim();
		}else{
			return null;
		}
	}
	public static int getLength (String content){
		return content.split("-").length;
	}
	
	/**
	 *
	 */
	
	public static String getQQMail(MemberService memberService,String openid){
		Member m = memberService.getInfoByOpenid(openid);
		String qqmail = m.getQq()+"@qq.com";
		return qqmail;
	}
	
}
