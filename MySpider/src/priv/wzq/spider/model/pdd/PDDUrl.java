package priv.wzq.spider.model.pdd;

public class PDDUrl {
	//盘多多的搜索参数
	private String urlParameter;
	//判断一个url是否是正确的  
	private String url;
	public String getUrlParameter() {
		return urlParameter;
	}

	public void setUrlParameter(String urlParameter) {
		this.urlParameter = urlParameter;
	}
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	//判断这个url是否合法
	public boolean isLegal(){
		// ^\[a-zA-z\]+://(\\w+(-\\w+)*)(\\.(\\w+(-\\w+)*))*(\\?\\S*)?$
		return false;
	}
}
