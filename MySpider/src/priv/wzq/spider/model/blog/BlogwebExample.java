package priv.wzq.spider.model.blog;

import java.util.ArrayList;
import java.util.List;

public class BlogwebExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogwebExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andWebIdIsNull() {
            addCriterion("web_id is null");
            return (Criteria) this;
        }

        public Criteria andWebIdIsNotNull() {
            addCriterion("web_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebIdEqualTo(Integer value) {
            addCriterion("web_id =", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdNotEqualTo(Integer value) {
            addCriterion("web_id <>", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdGreaterThan(Integer value) {
            addCriterion("web_id >", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("web_id >=", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdLessThan(Integer value) {
            addCriterion("web_id <", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdLessThanOrEqualTo(Integer value) {
            addCriterion("web_id <=", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdIn(List<Integer> values) {
            addCriterion("web_id in", values, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdNotIn(List<Integer> values) {
            addCriterion("web_id not in", values, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdBetween(Integer value1, Integer value2) {
            addCriterion("web_id between", value1, value2, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdNotBetween(Integer value1, Integer value2) {
            addCriterion("web_id not between", value1, value2, "webId");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorIsNull() {
            addCriterion("blog_title_selector is null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorIsNotNull() {
            addCriterion("blog_title_selector is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorEqualTo(String value) {
            addCriterion("blog_title_selector =", value, "blogTitleSelector");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorNotEqualTo(String value) {
            addCriterion("blog_title_selector <>", value, "blogTitleSelector");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorGreaterThan(String value) {
            addCriterion("blog_title_selector >", value, "blogTitleSelector");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorGreaterThanOrEqualTo(String value) {
            addCriterion("blog_title_selector >=", value, "blogTitleSelector");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorLessThan(String value) {
            addCriterion("blog_title_selector <", value, "blogTitleSelector");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorLessThanOrEqualTo(String value) {
            addCriterion("blog_title_selector <=", value, "blogTitleSelector");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorLike(String value) {
            addCriterion("blog_title_selector like", value, "blogTitleSelector");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorNotLike(String value) {
            addCriterion("blog_title_selector not like", value, "blogTitleSelector");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorIn(List<String> values) {
            addCriterion("blog_title_selector in", values, "blogTitleSelector");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorNotIn(List<String> values) {
            addCriterion("blog_title_selector not in", values, "blogTitleSelector");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorBetween(String value1, String value2) {
            addCriterion("blog_title_selector between", value1, value2, "blogTitleSelector");
            return (Criteria) this;
        }

        public Criteria andBlogTitleSelectorNotBetween(String value1, String value2) {
            addCriterion("blog_title_selector not between", value1, value2, "blogTitleSelector");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorIsNull() {
            addCriterion("blog_href_selector is null");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorIsNotNull() {
            addCriterion("blog_href_selector is not null");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorEqualTo(String value) {
            addCriterion("blog_href_selector =", value, "blogHrefSelector");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorNotEqualTo(String value) {
            addCriterion("blog_href_selector <>", value, "blogHrefSelector");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorGreaterThan(String value) {
            addCriterion("blog_href_selector >", value, "blogHrefSelector");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorGreaterThanOrEqualTo(String value) {
            addCriterion("blog_href_selector >=", value, "blogHrefSelector");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorLessThan(String value) {
            addCriterion("blog_href_selector <", value, "blogHrefSelector");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorLessThanOrEqualTo(String value) {
            addCriterion("blog_href_selector <=", value, "blogHrefSelector");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorLike(String value) {
            addCriterion("blog_href_selector like", value, "blogHrefSelector");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorNotLike(String value) {
            addCriterion("blog_href_selector not like", value, "blogHrefSelector");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorIn(List<String> values) {
            addCriterion("blog_href_selector in", values, "blogHrefSelector");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorNotIn(List<String> values) {
            addCriterion("blog_href_selector not in", values, "blogHrefSelector");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorBetween(String value1, String value2) {
            addCriterion("blog_href_selector between", value1, value2, "blogHrefSelector");
            return (Criteria) this;
        }

        public Criteria andBlogHrefSelectorNotBetween(String value1, String value2) {
            addCriterion("blog_href_selector not between", value1, value2, "blogHrefSelector");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorIsNull() {
            addCriterion("blog_sort_selector is null");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorIsNotNull() {
            addCriterion("blog_sort_selector is not null");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorEqualTo(String value) {
            addCriterion("blog_sort_selector =", value, "blogSortSelector");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorNotEqualTo(String value) {
            addCriterion("blog_sort_selector <>", value, "blogSortSelector");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorGreaterThan(String value) {
            addCriterion("blog_sort_selector >", value, "blogSortSelector");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorGreaterThanOrEqualTo(String value) {
            addCriterion("blog_sort_selector >=", value, "blogSortSelector");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorLessThan(String value) {
            addCriterion("blog_sort_selector <", value, "blogSortSelector");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorLessThanOrEqualTo(String value) {
            addCriterion("blog_sort_selector <=", value, "blogSortSelector");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorLike(String value) {
            addCriterion("blog_sort_selector like", value, "blogSortSelector");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorNotLike(String value) {
            addCriterion("blog_sort_selector not like", value, "blogSortSelector");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorIn(List<String> values) {
            addCriterion("blog_sort_selector in", values, "blogSortSelector");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorNotIn(List<String> values) {
            addCriterion("blog_sort_selector not in", values, "blogSortSelector");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorBetween(String value1, String value2) {
            addCriterion("blog_sort_selector between", value1, value2, "blogSortSelector");
            return (Criteria) this;
        }

        public Criteria andBlogSortSelectorNotBetween(String value1, String value2) {
            addCriterion("blog_sort_selector not between", value1, value2, "blogSortSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorIsNull() {
            addCriterion("blog_discription_selector is null");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorIsNotNull() {
            addCriterion("blog_discription_selector is not null");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorEqualTo(String value) {
            addCriterion("blog_discription_selector =", value, "blogDiscriptionSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorNotEqualTo(String value) {
            addCriterion("blog_discription_selector <>", value, "blogDiscriptionSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorGreaterThan(String value) {
            addCriterion("blog_discription_selector >", value, "blogDiscriptionSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorGreaterThanOrEqualTo(String value) {
            addCriterion("blog_discription_selector >=", value, "blogDiscriptionSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorLessThan(String value) {
            addCriterion("blog_discription_selector <", value, "blogDiscriptionSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorLessThanOrEqualTo(String value) {
            addCriterion("blog_discription_selector <=", value, "blogDiscriptionSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorLike(String value) {
            addCriterion("blog_discription_selector like", value, "blogDiscriptionSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorNotLike(String value) {
            addCriterion("blog_discription_selector not like", value, "blogDiscriptionSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorIn(List<String> values) {
            addCriterion("blog_discription_selector in", values, "blogDiscriptionSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorNotIn(List<String> values) {
            addCriterion("blog_discription_selector not in", values, "blogDiscriptionSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorBetween(String value1, String value2) {
            addCriterion("blog_discription_selector between", value1, value2, "blogDiscriptionSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDiscriptionSelectorNotBetween(String value1, String value2) {
            addCriterion("blog_discription_selector not between", value1, value2, "blogDiscriptionSelector");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameIsNull() {
            addCriterion("blog_webname is null");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameIsNotNull() {
            addCriterion("blog_webname is not null");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameEqualTo(String value) {
            addCriterion("blog_webname =", value, "blogWebname");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameNotEqualTo(String value) {
            addCriterion("blog_webname <>", value, "blogWebname");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameGreaterThan(String value) {
            addCriterion("blog_webname >", value, "blogWebname");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameGreaterThanOrEqualTo(String value) {
            addCriterion("blog_webname >=", value, "blogWebname");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameLessThan(String value) {
            addCriterion("blog_webname <", value, "blogWebname");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameLessThanOrEqualTo(String value) {
            addCriterion("blog_webname <=", value, "blogWebname");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameLike(String value) {
            addCriterion("blog_webname like", value, "blogWebname");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameNotLike(String value) {
            addCriterion("blog_webname not like", value, "blogWebname");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameIn(List<String> values) {
            addCriterion("blog_webname in", values, "blogWebname");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameNotIn(List<String> values) {
            addCriterion("blog_webname not in", values, "blogWebname");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameBetween(String value1, String value2) {
            addCriterion("blog_webname between", value1, value2, "blogWebname");
            return (Criteria) this;
        }

        public Criteria andBlogWebnameNotBetween(String value1, String value2) {
            addCriterion("blog_webname not between", value1, value2, "blogWebname");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlIsNull() {
            addCriterion("blog_list_url is null");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlIsNotNull() {
            addCriterion("blog_list_url is not null");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlEqualTo(String value) {
            addCriterion("blog_list_url =", value, "blogListUrl");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlNotEqualTo(String value) {
            addCriterion("blog_list_url <>", value, "blogListUrl");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlGreaterThan(String value) {
            addCriterion("blog_list_url >", value, "blogListUrl");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlGreaterThanOrEqualTo(String value) {
            addCriterion("blog_list_url >=", value, "blogListUrl");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlLessThan(String value) {
            addCriterion("blog_list_url <", value, "blogListUrl");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlLessThanOrEqualTo(String value) {
            addCriterion("blog_list_url <=", value, "blogListUrl");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlLike(String value) {
            addCriterion("blog_list_url like", value, "blogListUrl");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlNotLike(String value) {
            addCriterion("blog_list_url not like", value, "blogListUrl");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlIn(List<String> values) {
            addCriterion("blog_list_url in", values, "blogListUrl");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlNotIn(List<String> values) {
            addCriterion("blog_list_url not in", values, "blogListUrl");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlBetween(String value1, String value2) {
            addCriterion("blog_list_url between", value1, value2, "blogListUrl");
            return (Criteria) this;
        }

        public Criteria andBlogListUrlNotBetween(String value1, String value2) {
            addCriterion("blog_list_url not between", value1, value2, "blogListUrl");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlIsNull() {
            addCriterion("blog_base_url is null");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlIsNotNull() {
            addCriterion("blog_base_url is not null");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlEqualTo(String value) {
            addCriterion("blog_base_url =", value, "blogBaseUrl");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlNotEqualTo(String value) {
            addCriterion("blog_base_url <>", value, "blogBaseUrl");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlGreaterThan(String value) {
            addCriterion("blog_base_url >", value, "blogBaseUrl");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("blog_base_url >=", value, "blogBaseUrl");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlLessThan(String value) {
            addCriterion("blog_base_url <", value, "blogBaseUrl");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlLessThanOrEqualTo(String value) {
            addCriterion("blog_base_url <=", value, "blogBaseUrl");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlLike(String value) {
            addCriterion("blog_base_url like", value, "blogBaseUrl");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlNotLike(String value) {
            addCriterion("blog_base_url not like", value, "blogBaseUrl");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlIn(List<String> values) {
            addCriterion("blog_base_url in", values, "blogBaseUrl");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlNotIn(List<String> values) {
            addCriterion("blog_base_url not in", values, "blogBaseUrl");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlBetween(String value1, String value2) {
            addCriterion("blog_base_url between", value1, value2, "blogBaseUrl");
            return (Criteria) this;
        }

        public Criteria andBlogBaseUrlNotBetween(String value1, String value2) {
            addCriterion("blog_base_url not between", value1, value2, "blogBaseUrl");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorIsNull() {
            addCriterion("blog_date_selector is null");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorIsNotNull() {
            addCriterion("blog_date_selector is not null");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorEqualTo(String value) {
            addCriterion("blog_date_selector =", value, "blogDateSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorNotEqualTo(String value) {
            addCriterion("blog_date_selector <>", value, "blogDateSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorGreaterThan(String value) {
            addCriterion("blog_date_selector >", value, "blogDateSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorGreaterThanOrEqualTo(String value) {
            addCriterion("blog_date_selector >=", value, "blogDateSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorLessThan(String value) {
            addCriterion("blog_date_selector <", value, "blogDateSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorLessThanOrEqualTo(String value) {
            addCriterion("blog_date_selector <=", value, "blogDateSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorLike(String value) {
            addCriterion("blog_date_selector like", value, "blogDateSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorNotLike(String value) {
            addCriterion("blog_date_selector not like", value, "blogDateSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorIn(List<String> values) {
            addCriterion("blog_date_selector in", values, "blogDateSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorNotIn(List<String> values) {
            addCriterion("blog_date_selector not in", values, "blogDateSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorBetween(String value1, String value2) {
            addCriterion("blog_date_selector between", value1, value2, "blogDateSelector");
            return (Criteria) this;
        }

        public Criteria andBlogDateSelectorNotBetween(String value1, String value2) {
            addCriterion("blog_date_selector not between", value1, value2, "blogDateSelector");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorIsNull() {
            addCriterion("blog_view_selector is null");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorIsNotNull() {
            addCriterion("blog_view_selector is not null");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorEqualTo(String value) {
            addCriterion("blog_view_selector =", value, "blogViewSelector");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorNotEqualTo(String value) {
            addCriterion("blog_view_selector <>", value, "blogViewSelector");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorGreaterThan(String value) {
            addCriterion("blog_view_selector >", value, "blogViewSelector");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorGreaterThanOrEqualTo(String value) {
            addCriterion("blog_view_selector >=", value, "blogViewSelector");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorLessThan(String value) {
            addCriterion("blog_view_selector <", value, "blogViewSelector");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorLessThanOrEqualTo(String value) {
            addCriterion("blog_view_selector <=", value, "blogViewSelector");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorLike(String value) {
            addCriterion("blog_view_selector like", value, "blogViewSelector");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorNotLike(String value) {
            addCriterion("blog_view_selector not like", value, "blogViewSelector");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorIn(List<String> values) {
            addCriterion("blog_view_selector in", values, "blogViewSelector");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorNotIn(List<String> values) {
            addCriterion("blog_view_selector not in", values, "blogViewSelector");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorBetween(String value1, String value2) {
            addCriterion("blog_view_selector between", value1, value2, "blogViewSelector");
            return (Criteria) this;
        }

        public Criteria andBlogViewSelectorNotBetween(String value1, String value2) {
            addCriterion("blog_view_selector not between", value1, value2, "blogViewSelector");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorIsNull() {
            addCriterion("blog_content_selector is null");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorIsNotNull() {
            addCriterion("blog_content_selector is not null");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorEqualTo(String value) {
            addCriterion("blog_content_selector =", value, "blogContentSelector");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorNotEqualTo(String value) {
            addCriterion("blog_content_selector <>", value, "blogContentSelector");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorGreaterThan(String value) {
            addCriterion("blog_content_selector >", value, "blogContentSelector");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorGreaterThanOrEqualTo(String value) {
            addCriterion("blog_content_selector >=", value, "blogContentSelector");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorLessThan(String value) {
            addCriterion("blog_content_selector <", value, "blogContentSelector");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorLessThanOrEqualTo(String value) {
            addCriterion("blog_content_selector <=", value, "blogContentSelector");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorLike(String value) {
            addCriterion("blog_content_selector like", value, "blogContentSelector");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorNotLike(String value) {
            addCriterion("blog_content_selector not like", value, "blogContentSelector");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorIn(List<String> values) {
            addCriterion("blog_content_selector in", values, "blogContentSelector");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorNotIn(List<String> values) {
            addCriterion("blog_content_selector not in", values, "blogContentSelector");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorBetween(String value1, String value2) {
            addCriterion("blog_content_selector between", value1, value2, "blogContentSelector");
            return (Criteria) this;
        }

        public Criteria andBlogContentSelectorNotBetween(String value1, String value2) {
            addCriterion("blog_content_selector not between", value1, value2, "blogContentSelector");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}