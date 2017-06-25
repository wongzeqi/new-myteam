package priv.wzq.spider.model.news;

public class News {
    private Integer id;

    private static String commonSelector = ".content .content-main .two-coloum .left-main .comments-container .cmtlist .comment .comment-wrapper .wrapper"; 
    
    private String title;
    private static String titleSelector = ".content .content-main .column-list li h4 a";

    private String date;
    private static String dateSelector = ".content .content-main .column-list li .module-interact span";
    
    private String from;
    private static String fromSelector;
    
    
    private String sort;
    private static String sortSelector;
    
    private String discription;
    private static String discriptionSelector;
    

    private String view;
    private static String viewSelector =".content .content-main .column-list li .module-interact a";
    
    private String img;
    private static String imgSelector;
    

    private String newscontent;
    private static String newscontentSelector =".content .content-main .all-txt";
    
    private String newscontenthref;
    private static String newscontenthrefSelector = ".content .content-main .column-list li h4 a";
    
    
    public static String getTitleSelector() {
		return titleSelector;
	}

	public static void setTitleSelector(String titleSelector) {
		News.titleSelector = titleSelector;
	}

	public static String getDateSelector() {
		return dateSelector;
	}

	public static void setDateSelector(String dateSelector) {
		News.dateSelector = dateSelector;
	}

	public static String getFromSelector() {
		return fromSelector;
	}

	public static void setFromSelector(String fromSelector) {
		News.fromSelector = fromSelector;
	}

	public static String getSortSelector() {
		return sortSelector;
	}

	public static void setSortSelector(String sortSelector) {
		News.sortSelector = sortSelector;
	}

	public static String getDiscriptionSelector() {
		return discriptionSelector;
	}

	public static void setDiscriptionSelector(String discriptionSelector) {
		News.discriptionSelector = discriptionSelector;
	}

	public static String getViewSelector() {
		return viewSelector;
	}

	public static void setViewSelector(String viewSelector) {
		News.viewSelector = viewSelector;
	}

	public static String getImgSelector() {
		return imgSelector;
	}

	public static void setImgSelector(String imgSelector) {
		News.imgSelector = imgSelector;
	}

	public static String getNewscontentSelector() {
		return newscontentSelector;
	}

	public static void setNewscontentSelector(String newscontentSelector) {
		News.newscontentSelector = newscontentSelector;
	}

	public static String getNewscontenthrefSelector() {
		return newscontenthrefSelector;
	}

	public static void setNewscontenthrefSelector(String newscontenthrefSelector) {
		News.newscontenthrefSelector = newscontenthrefSelector;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription == null ? null : discription.trim();
    }


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent == null ? null : newscontent.trim();
    }

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public String getNewscontenthref() {
		return newscontenthref;
	}

	public void setNewscontenthref(String newscontenthref) {
		this.newscontenthref = newscontenthref;
	}

	public static String getCommonSelector() {
		return commonSelector;
	}

	public static void setCommonSelector(String commonSelector) {
		News.commonSelector = commonSelector;
	}
}