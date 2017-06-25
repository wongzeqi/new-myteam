package priv.wzq.wechat.message.resp;

import java.util.List;

/**
 * 响应中的图文消息
 * @author pengsong
 * @2016.01.19
 */
public class NewsMessage extends BaseMessage{
	//图文消息的个数，限制为10条以内
	private int ArticleCount;
	//条条图文消息信息，默认第一个item为大图
	private List<Article> Articles;
	public int getArticleCount() {
		return ArticleCount;
	}
	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}
	public List<Article> getArticle() {
		return Articles;
	}
	public void setArticles(List<Article> articles) {
		Articles = articles;
	}
	public NewsMessage(List<Article> list,BaseMessage baseMessage) {
		this.Articles = list;
		super.setCreateTime(baseMessage.getCreateTime());
		super.setFromUserName(baseMessage.getFromUserName());
		super.setMsgType(baseMessage.getMsgType());
		super.setToUserName(baseMessage.getToUserName());
		super.setFuncFlag(baseMessage.getFuncFlag());
	}
	public NewsMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
