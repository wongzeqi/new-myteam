package priv.wzq.wechat.service;

import java.util.ArrayList;
import java.util.List;

import priv.wzq.wechat.message.resp.Article;
import priv.wzq.wechat.message.resp.NewsMessage;
import priv.wzq.wechat.message.resp.TextMessage;
import priv.wzq.wechat.utils.MessageUtil;

public class CoreNumberService {
	/**
	 * 管理员菜单
	 */
	private static String[] ADMAIN_MENU = {
		"回复【1】我要签到!",
		"回复【2】我要请假！",
		"回复【3】参加比赛！",
		"回复【4】团队简介！",
		"回复【5】查看命令！",
		"回复【6】进入主页!",
		"回复【7】回到主菜单！"
	};
	/**
	 * 普通成员菜单
	 */
	private static String[] MEMBER_MENU = {
		"回复【1】我要签到!",
		"回复【2】我要请假！",
		"回复【3】参加比赛！",
		"回复【4】团队简介！",
		"回复【5】进入主页！",
		"回复【6】查看命令!",
		"回复【7】回到主菜单！"
	};
	
	/**
	 * 游客菜单
	 */
	private static String[] VISITOR_MENU = {
		"回复【1】加入团队！",
		"回复【2】报名比赛！",
		"回复【3】团队简介！",
		"回复【4】回到菜单！"
	};
	
	/**
	 * 管理员所有命令
	 */
	private static String ADMIN_ORDERS [] ={
		"我是sb",
		"我是"
	};
	/**
	 * 成员的所有命令
	 */
	private static String MEMBER_ORDERS[] = {
		
	};
	/**
	 * 加入团队图文消息参数
	 */
	static String JRTD[] ={
		"Java项目开发创新团队",
		"点击报名>>>",
		"http://15d06247.ngrok.io/myteam/aui/image/timg.jpg",
		"http://15d06247.ngrok.io/myteam/jsp/myform.jsp"
	};
	/**
	 * 我要请假
	 */
	static String WYQJ[] = {
		"Java项目开发创新团队",
		"我要请假>>>",
		"http://15d06247.ngrok.io/myteam/aui/image/qingjia.jpg",
		"http://15d06247.ngrok.io/myteam/jsp/qingjia.jsp"
	};
	/**
	 * 我要签到
	 */
	static String WYQD[] = {
		"Java项目开发创新团队",
		"我要请假>>>",
		"http://15d06247.ngrok.io/myteam/aui/image/qiandao.jpg",
		"http://15d06247.ngrok.io/myteam/jsp/qiandao.jsp"
	};
	/**
	 * 团队合影
	 */
	static String TDHY[] = {
		"Java项目开发创新团队--团队成员合影",
		"团队成员合影",
		"http://15d06247.ngrok.io/myteam/aui/image/15.jpg",
		"http://15d06247.ngrok.io/myteam/jsp/photo.jsp"
	};
	static String BMBS[] = {
		"报名比赛",
		"点击报名>>>",
		"http://15d06247.ngrok.io/myteam/aui/image/cjbs.png",
		//注！
		"http://15d06247.ngrok.io/myteam/jsp/photo.jsp"
	};
	static String JRZY[] = {
		"主页",
		"点击进入>>>",
		"http://15d06247.ngrok.io/myteam/aui/image/zy.png",
		//注！
		"http://15d06247.ngrok.io/myteam/jsp/index.jsp"
	};
	
	/**
	 * 处理游客发送的数字现象
	 * @param newsMessage图文消息对象
	 * @param numberOrder数字命令
	 * @return
	 */
	
	
	//+ "回复【1】加入团队！\n" + "回复【2】报名比赛！\n" + "回复【3】团队简介！"+ "回复【4】回到菜单！")游客具有的命令
	public static String doVisitorMessage(NewsMessage newsMessage,TextMessage textMessage,String numberOrder){
		//加入团队
		if(numberOrder.equals("1")){
			newsMessage = packagingNewsMessage(JRTD, newsMessage);
			return MessageUtil.newsMessageToXml(newsMessage);
		}
		if(numberOrder.equals("2")){
			newsMessage = packagingNewsMessage(BMBS, newsMessage);
			return MessageUtil.newsMessageToXml(newsMessage);
		}
		if(numberOrder.equals("3")){
			newsMessage = packagingNewsMessage(TDHY, newsMessage);
			return MessageUtil.newsMessageToXml(newsMessage);
		}
		if(numberOrder.equals("4")){
			textMessage.setContent(arrayToString(VISITOR_MENU));
			return MessageUtil.textMessageToXml(textMessage);
		}
		else{
			textMessage.setContent("系统未提供该命令！\n请回复【4】查看所有命令！");
			return MessageUtil.textMessageToXml(textMessage);
		}
	}
	/**
	 * 处理成员发送的命令
	 * @param newsMessage
	 * @param numberOrder
	 * @param textMessage
	 * @return
	 */
	//+ "回复【1】我要签到！\n" + "回复【2】我要请假！\n"
	//+ "回复【3】参加比赛！\n" + "回复【4】团队简介！\n"
	//+ "回复【5】查看命令！\n" + "回复【6】回到主菜单！")
	public static String doMemberMessage(NewsMessage newsMessage,String numberOrder,TextMessage textMessage,int role){
		if(numberOrder.equals("1")){
			newsMessage = packagingNewsMessage(WYQD, newsMessage);
			return MessageUtil.newsMessageToXml(newsMessage);
		}
		if(numberOrder.equals("2")){
			newsMessage = packagingNewsMessage(WYQJ, newsMessage);
			return MessageUtil.newsMessageToXml(newsMessage);
		}
		if(numberOrder.equals("3")){
			newsMessage = packagingNewsMessage(BMBS, newsMessage);
			return MessageUtil.newsMessageToXml(newsMessage);
		}
		if(numberOrder.equals("4")){
			newsMessage = packagingNewsMessage(TDHY, newsMessage);
			return MessageUtil.newsMessageToXml(newsMessage);
		}
		if(numberOrder.equals("6")){
			//管理员拥有的命令
			if(role>=2){
				textMessage.setContent(arrayToString(ADMIN_ORDERS));
			}else{
			//普通成员具有的命令
				textMessage.setContent(arrayToString(MEMBER_ORDERS));
			}
			
			return MessageUtil.textMessageToXml(textMessage);
		}
		if(numberOrder.equals("5")){
			newsMessage = packagingNewsMessage(JRZY, newsMessage);
			return MessageUtil.newsMessageToXml(newsMessage);
		}
		if(numberOrder.equals("7")){
			if(role>=2){
				textMessage.setContent(arrayToString(ADMAIN_MENU));
			}else{
				textMessage.setContent(arrayToString(MEMBER_MENU));
			}
			return MessageUtil.textMessageToXml(textMessage);
		}
		else{
			textMessage.setContent("系统未提供该命令！\n请回复【7】查看所有菜单选项！");
			return MessageUtil.textMessageToXml(textMessage);
		}
	}
	
	/**
	 * 将命令数组转换成一个字符串并且用\n隔开
	 * @param orders
	 * @return
	 */
	private  static String arrayToString(String [] orders){
		String s = "";
		for(int i=0;i<orders.length;i++){
			if(i<orders.length-1){
				s += orders[i]+"\n";
			}
			else{
				s+=orders[i];
			}
		}
		return s;
	}
	
	
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(arrayToString(ADMAIN_MENU));
	}
	
	/**
	 * 封装NewsMessage对象
	 * @param someString(一些图文消息参数)
	 * @param newsMessage
	 * @return
	 */
	
	private static NewsMessage packagingNewsMessage(String[] someString ,NewsMessage newsMessage){
		List<Article> articleList = new ArrayList<Article>();
		//创建图文消息
		Article article = new Article();
		article.setTitle(someString[0]);
		article.setDescription(someString[1]);
		article.setPicUrl(someString[2]);
		article.setUrl(someString[3]);
		articleList.add(article);
		newsMessage.setArticleCount(articleList.size());
		newsMessage.setArticles(articleList);
		return newsMessage;
	}
	
}
