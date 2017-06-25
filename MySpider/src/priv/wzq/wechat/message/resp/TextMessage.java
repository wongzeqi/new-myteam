package priv.wzq.wechat.message.resp;


/**
 * 响应文本消息
 * @author pengsong
 * @date 2016.01.19
 */
public class TextMessage extends BaseMessage{
	//回复的消息类容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
	public TextMessage(String content ,BaseMessage baseMessage) {
		this.Content = content;
		super.setCreateTime(baseMessage.getCreateTime());
		super.setFromUserName(baseMessage.getFromUserName());
		super.setMsgType(baseMessage.getMsgType());
		super.setToUserName(baseMessage.getToUserName());
		super.setFuncFlag(baseMessage.getFuncFlag());
	}

	public TextMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
