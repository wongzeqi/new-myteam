package priv.wzq.spider.model.blog;

public class Blog {
    private Integer blogId;

    private String blogContentHref;

    private String blogTitle;

    private String blogDiscription;

    private String blogSort;

    private String blogDate;

    private Integer blogView;

    private Integer webId;

    private String blogContent;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogContentHref() {
        return blogContentHref;
    }

    public void setBlogContentHref(String blogContentHref) {
        this.blogContentHref = blogContentHref == null ? null : blogContentHref.trim();
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBlogDiscription() {
        return blogDiscription;
    }

    public void setBlogDiscription(String blogDiscription) {
        this.blogDiscription = blogDiscription == null ? null : blogDiscription.trim();
    }

    public String getBlogSort() {
        return blogSort;
    }

    public void setBlogSort(String blogSort) {
        this.blogSort = blogSort == null ? null : blogSort.trim();
    }

    public String getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(String blogDate) {
        this.blogDate = blogDate == null ? null : blogDate.trim();
    }

    public Integer getBlogView() {
        return blogView;
    }

    public void setBlogView(Integer blogView) {
        this.blogView = blogView;
    }

    public Integer getWebId() {
        return webId;
    }

    public void setWebId(Integer webId) {
        this.webId = webId;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }
}