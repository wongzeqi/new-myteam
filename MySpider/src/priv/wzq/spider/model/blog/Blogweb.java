package priv.wzq.spider.model.blog;

public class Blogweb {
    private Integer webId;

    private String blogTitleSelector;

    private String blogHrefSelector;

    private String blogSortSelector;

    private String blogDiscriptionSelector;

    private String blogWebname;

    private String blogListUrl;

    private String blogBaseUrl;

    private String blogDateSelector;

    private String blogViewSelector;

    private String blogContentSelector;

    public Integer getWebId() {
        return webId;
    }

    public void setWebId(Integer webId) {
        this.webId = webId;
    }

    public String getBlogTitleSelector() {
        return blogTitleSelector;
    }

    public void setBlogTitleSelector(String blogTitleSelector) {
        this.blogTitleSelector = blogTitleSelector == null ? null : blogTitleSelector.trim();
    }

    public String getBlogHrefSelector() {
        return blogHrefSelector;
    }

    public void setBlogHrefSelector(String blogHrefSelector) {
        this.blogHrefSelector = blogHrefSelector == null ? null : blogHrefSelector.trim();
    }

    public String getBlogSortSelector() {
        return blogSortSelector;
    }

    public void setBlogSortSelector(String blogSortSelector) {
        this.blogSortSelector = blogSortSelector == null ? null : blogSortSelector.trim();
    }

    public String getBlogDiscriptionSelector() {
        return blogDiscriptionSelector;
    }

    public void setBlogDiscriptionSelector(String blogDiscriptionSelector) {
        this.blogDiscriptionSelector = blogDiscriptionSelector == null ? null : blogDiscriptionSelector.trim();
    }

    public String getBlogWebname() {
        return blogWebname;
    }

    public void setBlogWebname(String blogWebname) {
        this.blogWebname = blogWebname == null ? null : blogWebname.trim();
    }

    public String getBlogListUrl() {
        return blogListUrl;
    }

    public void setBlogListUrl(String blogListUrl) {
        this.blogListUrl = blogListUrl == null ? null : blogListUrl.trim();
    }

    public String getBlogBaseUrl() {
        return blogBaseUrl;
    }

    public void setBlogBaseUrl(String blogBaseUrl) {
        this.blogBaseUrl = blogBaseUrl == null ? null : blogBaseUrl.trim();
    }

    public String getBlogDateSelector() {
        return blogDateSelector;
    }

    public void setBlogDateSelector(String blogDateSelector) {
        this.blogDateSelector = blogDateSelector == null ? null : blogDateSelector.trim();
    }

    public String getBlogViewSelector() {
        return blogViewSelector;
    }

    public void setBlogViewSelector(String blogViewSelector) {
        this.blogViewSelector = blogViewSelector == null ? null : blogViewSelector.trim();
    }

    public String getBlogContentSelector() {
        return blogContentSelector;
    }

    public void setBlogContentSelector(String blogContentSelector) {
        this.blogContentSelector = blogContentSelector == null ? null : blogContentSelector.trim();
    }
}