package priv.wzq.spider.model.news;

public class NewsImage {
	private String imageUrl;//图片链接
	private int nid;//新闻的id
	private int imageOrder;//在整个序号
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public int getImageOrder() {
		return imageOrder;
	}
	public void setImageOrder(int imageOrder) {
		this.imageOrder = imageOrder;
	}
}
