package com.nun.wjq.project.model;

import java.util.ArrayList;
import java.util.List;

public class AcademyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcademyExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAcademynameIsNull() {
            addCriterion("academyname is null");
            return (Criteria) this;
        }

        public Criteria andAcademynameIsNotNull() {
            addCriterion("academyname is not null");
            return (Criteria) this;
        }

        public Criteria andAcademynameEqualTo(String value) {
            addCriterion("academyname =", value, "academyname");
            return (Criteria) this;
        }

        public Criteria andAcademynameNotEqualTo(String value) {
            addCriterion("academyname <>", value, "academyname");
            return (Criteria) this;
        }

        public Criteria andAcademynameGreaterThan(String value) {
            addCriterion("academyname >", value, "academyname");
            return (Criteria) this;
        }

        public Criteria andAcademynameGreaterThanOrEqualTo(String value) {
            addCriterion("academyname >=", value, "academyname");
            return (Criteria) this;
        }

        public Criteria andAcademynameLessThan(String value) {
            addCriterion("academyname <", value, "academyname");
            return (Criteria) this;
        }

        public Criteria andAcademynameLessThanOrEqualTo(String value) {
            addCriterion("academyname <=", value, "academyname");
            return (Criteria) this;
        }

        public Criteria andAcademynameLike(String value) {
            addCriterion("academyname like", value, "academyname");
            return (Criteria) this;
        }

        public Criteria andAcademynameNotLike(String value) {
            addCriterion("academyname not like", value, "academyname");
            return (Criteria) this;
        }

        public Criteria andAcademynameIn(List<String> values) {
            addCriterion("academyname in", values, "academyname");
            return (Criteria) this;
        }

        public Criteria andAcademynameNotIn(List<String> values) {
            addCriterion("academyname not in", values, "academyname");
            return (Criteria) this;
        }

        public Criteria andAcademynameBetween(String value1, String value2) {
            addCriterion("academyname between", value1, value2, "academyname");
            return (Criteria) this;
        }

        public Criteria andAcademynameNotBetween(String value1, String value2) {
            addCriterion("academyname not between", value1, value2, "academyname");
            return (Criteria) this;
        }

        public Criteria andAcademycodeIsNull() {
            addCriterion("academycode is null");
            return (Criteria) this;
        }

        public Criteria andAcademycodeIsNotNull() {
            addCriterion("academycode is not null");
            return (Criteria) this;
        }

        public Criteria andAcademycodeEqualTo(String value) {
            addCriterion("academycode =", value, "academycode");
            return (Criteria) this;
        }

        public Criteria andAcademycodeNotEqualTo(String value) {
            addCriterion("academycode <>", value, "academycode");
            return (Criteria) this;
        }

        public Criteria andAcademycodeGreaterThan(String value) {
            addCriterion("academycode >", value, "academycode");
            return (Criteria) this;
        }

        public Criteria andAcademycodeGreaterThanOrEqualTo(String value) {
            addCriterion("academycode >=", value, "academycode");
            return (Criteria) this;
        }

        public Criteria andAcademycodeLessThan(String value) {
            addCriterion("academycode <", value, "academycode");
            return (Criteria) this;
        }

        public Criteria andAcademycodeLessThanOrEqualTo(String value) {
            addCriterion("academycode <=", value, "academycode");
            return (Criteria) this;
        }

        public Criteria andAcademycodeLike(String value) {
            addCriterion("academycode like", value, "academycode");
            return (Criteria) this;
        }

        public Criteria andAcademycodeNotLike(String value) {
            addCriterion("academycode not like", value, "academycode");
            return (Criteria) this;
        }

        public Criteria andAcademycodeIn(List<String> values) {
            addCriterion("academycode in", values, "academycode");
            return (Criteria) this;
        }

        public Criteria andAcademycodeNotIn(List<String> values) {
            addCriterion("academycode not in", values, "academycode");
            return (Criteria) this;
        }

        public Criteria andAcademycodeBetween(String value1, String value2) {
            addCriterion("academycode between", value1, value2, "academycode");
            return (Criteria) this;
        }

        public Criteria andAcademycodeNotBetween(String value1, String value2) {
            addCriterion("academycode not between", value1, value2, "academycode");
            return (Criteria) this;
        }

        public Criteria andRecommendnumberIsNull() {
            addCriterion("recommendNumber is null");
            return (Criteria) this;
        }

        public Criteria andRecommendnumberIsNotNull() {
            addCriterion("recommendNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendnumberEqualTo(Integer value) {
            addCriterion("recommendNumber =", value, "recommendnumber");
            return (Criteria) this;
        }

        public Criteria andRecommendnumberNotEqualTo(Integer value) {
            addCriterion("recommendNumber <>", value, "recommendnumber");
            return (Criteria) this;
        }

        public Criteria andRecommendnumberGreaterThan(Integer value) {
            addCriterion("recommendNumber >", value, "recommendnumber");
            return (Criteria) this;
        }

        public Criteria andRecommendnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommendNumber >=", value, "recommendnumber");
            return (Criteria) this;
        }

        public Criteria andRecommendnumberLessThan(Integer value) {
            addCriterion("recommendNumber <", value, "recommendnumber");
            return (Criteria) this;
        }

        public Criteria andRecommendnumberLessThanOrEqualTo(Integer value) {
            addCriterion("recommendNumber <=", value, "recommendnumber");
            return (Criteria) this;
        }

        public Criteria andRecommendnumberIn(List<Integer> values) {
            addCriterion("recommendNumber in", values, "recommendnumber");
            return (Criteria) this;
        }

        public Criteria andRecommendnumberNotIn(List<Integer> values) {
            addCriterion("recommendNumber not in", values, "recommendnumber");
            return (Criteria) this;
        }

        public Criteria andRecommendnumberBetween(Integer value1, Integer value2) {
            addCriterion("recommendNumber between", value1, value2, "recommendnumber");
            return (Criteria) this;
        }

        public Criteria andRecommendnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("recommendNumber not between", value1, value2, "recommendnumber");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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