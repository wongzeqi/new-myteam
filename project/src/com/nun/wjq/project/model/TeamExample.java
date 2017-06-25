package com.nun.wjq.project.model;

import java.util.ArrayList;
import java.util.List;

public class TeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamExample() {
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

        public Criteria andTmidIsNull() {
            addCriterion("tmid is null");
            return (Criteria) this;
        }

        public Criteria andTmidIsNotNull() {
            addCriterion("tmid is not null");
            return (Criteria) this;
        }

        public Criteria andTmidEqualTo(Integer value) {
            addCriterion("tmid =", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotEqualTo(Integer value) {
            addCriterion("tmid <>", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidGreaterThan(Integer value) {
            addCriterion("tmid >", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tmid >=", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidLessThan(Integer value) {
            addCriterion("tmid <", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidLessThanOrEqualTo(Integer value) {
            addCriterion("tmid <=", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidIn(List<Integer> values) {
            addCriterion("tmid in", values, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotIn(List<Integer> values) {
            addCriterion("tmid not in", values, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidBetween(Integer value1, Integer value2) {
            addCriterion("tmid between", value1, value2, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotBetween(Integer value1, Integer value2) {
            addCriterion("tmid not between", value1, value2, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmnameIsNull() {
            addCriterion("tmname is null");
            return (Criteria) this;
        }

        public Criteria andTmnameIsNotNull() {
            addCriterion("tmname is not null");
            return (Criteria) this;
        }

        public Criteria andTmnameEqualTo(String value) {
            addCriterion("tmname =", value, "tmname");
            return (Criteria) this;
        }

        public Criteria andTmnameNotEqualTo(String value) {
            addCriterion("tmname <>", value, "tmname");
            return (Criteria) this;
        }

        public Criteria andTmnameGreaterThan(String value) {
            addCriterion("tmname >", value, "tmname");
            return (Criteria) this;
        }

        public Criteria andTmnameGreaterThanOrEqualTo(String value) {
            addCriterion("tmname >=", value, "tmname");
            return (Criteria) this;
        }

        public Criteria andTmnameLessThan(String value) {
            addCriterion("tmname <", value, "tmname");
            return (Criteria) this;
        }

        public Criteria andTmnameLessThanOrEqualTo(String value) {
            addCriterion("tmname <=", value, "tmname");
            return (Criteria) this;
        }

        public Criteria andTmnameLike(String value) {
            addCriterion("tmname like", value, "tmname");
            return (Criteria) this;
        }

        public Criteria andTmnameNotLike(String value) {
            addCriterion("tmname not like", value, "tmname");
            return (Criteria) this;
        }

        public Criteria andTmnameIn(List<String> values) {
            addCriterion("tmname in", values, "tmname");
            return (Criteria) this;
        }

        public Criteria andTmnameNotIn(List<String> values) {
            addCriterion("tmname not in", values, "tmname");
            return (Criteria) this;
        }

        public Criteria andTmnameBetween(String value1, String value2) {
            addCriterion("tmname between", value1, value2, "tmname");
            return (Criteria) this;
        }

        public Criteria andTmnameNotBetween(String value1, String value2) {
            addCriterion("tmname not between", value1, value2, "tmname");
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