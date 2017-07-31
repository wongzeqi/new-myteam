package com.nun.wjq.project.utils;

public class Page {
	private Integer pageCount=1;//当前页
	private Integer tatalPage;//总页数
	private Integer itemCount=2;//条目数
	private Integer totalItemCount;//所以数据条目
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getTatalPage() {
		return tatalPage;
	}
	public void setTatalPage(Integer tatalPage) {
		this.tatalPage = tatalPage;
	}
	public Integer getItemCount() {
		return itemCount;
	}
	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}
	public Integer getTotalItemCount() {
		return totalItemCount;
	}
	public void setTotalItemCount(Integer totalItemCount) {
		this.totalItemCount = totalItemCount;
	}
	
	
}
