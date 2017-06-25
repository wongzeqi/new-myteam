package priv.wzq.spider.model.news;

import java.util.ArrayList;
import java.util.List;

public class CommonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommoncontentIsNull() {
            addCriterion("commoncontent is null");
            return (Criteria) this;
        }

        public Criteria andCommoncontentIsNotNull() {
            addCriterion("commoncontent is not null");
            return (Criteria) this;
        }

        public Criteria andCommoncontentEqualTo(String value) {
            addCriterion("commoncontent =", value, "commoncontent");
            return (Criteria) this;
        }

        public Criteria andCommoncontentNotEqualTo(String value) {
            addCriterion("commoncontent <>", value, "commoncontent");
            return (Criteria) this;
        }

        public Criteria andCommoncontentGreaterThan(String value) {
            addCriterion("commoncontent >", value, "commoncontent");
            return (Criteria) this;
        }

        public Criteria andCommoncontentGreaterThanOrEqualTo(String value) {
            addCriterion("commoncontent >=", value, "commoncontent");
            return (Criteria) this;
        }

        public Criteria andCommoncontentLessThan(String value) {
            addCriterion("commoncontent <", value, "commoncontent");
            return (Criteria) this;
        }

        public Criteria andCommoncontentLessThanOrEqualTo(String value) {
            addCriterion("commoncontent <=", value, "commoncontent");
            return (Criteria) this;
        }

        public Criteria andCommoncontentLike(String value) {
            addCriterion("commoncontent like", value, "commoncontent");
            return (Criteria) this;
        }

        public Criteria andCommoncontentNotLike(String value) {
            addCriterion("commoncontent not like", value, "commoncontent");
            return (Criteria) this;
        }

        public Criteria andCommoncontentIn(List<String> values) {
            addCriterion("commoncontent in", values, "commoncontent");
            return (Criteria) this;
        }

        public Criteria andCommoncontentNotIn(List<String> values) {
            addCriterion("commoncontent not in", values, "commoncontent");
            return (Criteria) this;
        }

        public Criteria andCommoncontentBetween(String value1, String value2) {
            addCriterion("commoncontent between", value1, value2, "commoncontent");
            return (Criteria) this;
        }

        public Criteria andCommoncontentNotBetween(String value1, String value2) {
            addCriterion("commoncontent not between", value1, value2, "commoncontent");
            return (Criteria) this;
        }

        public Criteria andCommontimeIsNull() {
            addCriterion("commontime is null");
            return (Criteria) this;
        }

        public Criteria andCommontimeIsNotNull() {
            addCriterion("commontime is not null");
            return (Criteria) this;
        }

        public Criteria andCommontimeEqualTo(String value) {
            addCriterion("commontime =", value, "commontime");
            return (Criteria) this;
        }

        public Criteria andCommontimeNotEqualTo(String value) {
            addCriterion("commontime <>", value, "commontime");
            return (Criteria) this;
        }

        public Criteria andCommontimeGreaterThan(String value) {
            addCriterion("commontime >", value, "commontime");
            return (Criteria) this;
        }

        public Criteria andCommontimeGreaterThanOrEqualTo(String value) {
            addCriterion("commontime >=", value, "commontime");
            return (Criteria) this;
        }

        public Criteria andCommontimeLessThan(String value) {
            addCriterion("commontime <", value, "commontime");
            return (Criteria) this;
        }

        public Criteria andCommontimeLessThanOrEqualTo(String value) {
            addCriterion("commontime <=", value, "commontime");
            return (Criteria) this;
        }

        public Criteria andCommontimeLike(String value) {
            addCriterion("commontime like", value, "commontime");
            return (Criteria) this;
        }

        public Criteria andCommontimeNotLike(String value) {
            addCriterion("commontime not like", value, "commontime");
            return (Criteria) this;
        }

        public Criteria andCommontimeIn(List<String> values) {
            addCriterion("commontime in", values, "commontime");
            return (Criteria) this;
        }

        public Criteria andCommontimeNotIn(List<String> values) {
            addCriterion("commontime not in", values, "commontime");
            return (Criteria) this;
        }

        public Criteria andCommontimeBetween(String value1, String value2) {
            addCriterion("commontime between", value1, value2, "commontime");
            return (Criteria) this;
        }

        public Criteria andCommontimeNotBetween(String value1, String value2) {
            addCriterion("commontime not between", value1, value2, "commontime");
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