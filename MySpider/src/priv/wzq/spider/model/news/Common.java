package priv.wzq.spider.model.news;

public class Common {
    private Integer cid;

    private Integer id;

    private static String commoncontentSelector = ".content .content-main .two-coloum .left-main .comments-container .cmtlist .comment .comment-wrapper .wrapper";
    private String commoncontent;

    private String commontime;
    private static String commontimeSelector = "";

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommoncontent() {
        return commoncontent;
    }

    public void setCommoncontent(String commoncontent) {
        this.commoncontent = commoncontent == null ? null : commoncontent.trim();
    }

    public String getCommontime() {
        return commontime;
    }

    public void setCommontime(String commontime) {
        this.commontime = commontime == null ? null : commontime.trim();
    }

	public static String getCommoncontentSelector() {
		return commoncontentSelector;
	}

	public static void setCommoncontentSelector(String commoncontentSelector) {
		Common.commoncontentSelector = commoncontentSelector;
	}

	public static String getCommontimeSelector() {
		return commontimeSelector;
	}

	public static void setCommontimeSelector(String commontimeSelector) {
		Common.commontimeSelector = commontimeSelector;
	}
}