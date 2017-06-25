package priv.wzq.spider.model.pdd;

import priv.wzq.spider.base.IResult;

public class PDDResult implements IResult{
	//css选择器
	private static String titleSeletor = ".search-page .row h3 a";
	private static String hrefSeletor = ".search-page .row h3 a";
	private static String secondHrefSeletor = ".resource-page .col-a .slide2 center a";
	private static String timeSeletor = ".search-page .row  p .small";
	private static String sizeSeletor = ".search-page .row  p .size";
	private static String sortSeletor = ".search-page .row  p:first-child a";
	private static String visitSeletor = ".search-page .row  p .small";
	private static String panSeletor =".search-page .row  p img";
	

	private String title;// 标题
	private String href;// 链接
	private String time;// 时间
	private String size;// 大小
	private String sort;// 分类
	private String visit;// 访问次数（热度）
	private String pan;//是什么盘

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}


	public String getVisit() {
		return visit;
	}

	public void setVisit(String visit) {
		this.visit = visit;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public static String getTitleSeletor() {
		return titleSeletor;
	}

	public static String getHrefSeletor() {
		return hrefSeletor;
	}

	public static String getTimeSeletor() {
		return timeSeletor;
	}

	public static String getSizeSeletor() {
		return sizeSeletor;
	}

	public static String getSortSeletor() {
		return sortSeletor;
	}

	public static String getVisitSeletor() {
		return visitSeletor;
	}

	public PDDResult(String title, String href, String time, String size,
			String sort, String visit, int isBDY) {
		super();
		this.title = title;
		this.href = href;
		this.time = time;
		this.size = size;
		this.sort = sort;
		this.visit = visit;
	}

	public PDDResult() {
	}

	@Override
	public String toString() {
		return "PanDuoDuoResult [title=" + title + ", href=" + href + ", time="
				+ time + ", size=" + size + ", sort=" + sort + ", visit="
				+ visit + "]";
	}

	public static String getPanSeletor() {
		return panSeletor;
	}

	public static String getSecondHrefSeletor() {
		return secondHrefSeletor;
	}


}
