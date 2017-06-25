package priv.wzq.utils;

public class Page {
	private int pageCount;//当前页
	private int tatalPage;//总页数
	private int itemCount=10;//条目数
	private int totalItemCount;//所以数据条目
	public int getTotalItemCount() {
		return totalItemCount;
	}
	public void setTotalItemCount(int totalItemCount) {
		this.totalItemCount = totalItemCount;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getTatalPage() {
		return tatalPage;
	}
	public void setTatalPage(int tatalPage) {
		this.tatalPage = tatalPage;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public Page() {
		this.pageCount=1;
	}
	//
}
