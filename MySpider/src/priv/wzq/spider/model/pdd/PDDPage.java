package priv.wzq.spider.model.pdd;

import priv.wzq.spider.base.model.MyPage;

public class PDDPage extends MyPage<PDDResult>{
	
	private static String pageCountSelector = ".search-page .page-list .pcount";
	private static String totalSelector = ".search-page .page-list .total";
	private static String currentSelector = ".search-page .page-list .current";
	
	private int pageCount;//页数
	private int total;//总的结果
	private int current;//当前页
	private String content;//搜索的内容
	
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public static String getPageCountSelector() {
		return pageCountSelector;
	}
	public static String getTotalSelector() {
		return totalSelector;
	}
	public static String getCurrentSelector() {
		return currentSelector;
	}
	
	
}
