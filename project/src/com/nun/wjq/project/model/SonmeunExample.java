package com.nun.wjq.project.model;

import java.util.ArrayList;
import java.util.List;

public class SonmeunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SonmeunExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andSmeunnameIsNull() {
            addCriterion("smeunname is null");
            return (Criteria) this;
        }

        public Criteria andSmeunnameIsNotNull() {
            addCriterion("smeunname is not null");
            return (Criteria) this;
        }

        public Criteria andSmeunnameEqualTo(String value) {
            addCriterion("smeunname =", value, "smeunname");
            return (Criteria) this;
        }

        public Criteria andSmeunnameNotEqualTo(String value) {
            addCriterion("smeunname <>", value, "smeunname");
            return (Criteria) this;
        }

        public Criteria andSmeunnameGreaterThan(String value) {
            addCriterion("smeunname >", value, "smeunname");
            return (Criteria) this;
        }

        public Criteria andSmeunnameGreaterThanOrEqualTo(String value) {
            addCriterion("smeunname >=", value, "smeunname");
            return (Criteria) this;
        }

        public Criteria andSmeunnameLessThan(String value) {
            addCriterion("smeunname <", value, "smeunname");
            return (Criteria) this;
        }

        public Criteria andSmeunnameLessThanOrEqualTo(String value) {
            addCriterion("smeunname <=", value, "smeunname");
            return (Criteria) this;
        }

        public Criteria andSmeunnameLike(String value) {
            addCriterion("smeunname like", value, "smeunname");
            return (Criteria) this;
        }

        public Criteria andSmeunnameNotLike(String value) {
            addCriterion("smeunname not like", value, "smeunname");
            return (Criteria) this;
        }

        public Criteria andSmeunnameIn(List<String> values) {
            addCriterion("smeunname in", values, "smeunname");
            return (Criteria) this;
        }

        public Criteria andSmeunnameNotIn(List<String> values) {
            addCriterion("smeunname not in", values, "smeunname");
            return (Criteria) this;
        }

        public Criteria andSmeunnameBetween(String value1, String value2) {
            addCriterion("smeunname between", value1, value2, "smeunname");
            return (Criteria) this;
        }

        public Criteria andSmeunnameNotBetween(String value1, String value2) {
            addCriterion("smeunname not between", value1, value2, "smeunname");
            return (Criteria) this;
        }

        public Criteria andMeunurlIsNull() {
            addCriterion("meunurl is null");
            return (Criteria) this;
        }

        public Criteria andMeunurlIsNotNull() {
            addCriterion("meunurl is not null");
            return (Criteria) this;
        }

        public Criteria andMeunurlEqualTo(String value) {
            addCriterion("meunurl =", value, "meunurl");
            return (Criteria) this;
        }

        public Criteria andMeunurlNotEqualTo(String value) {
            addCriterion("meunurl <>", value, "meunurl");
            return (Criteria) this;
        }

        public Criteria andMeunurlGreaterThan(String value) {
            addCriterion("meunurl >", value, "meunurl");
            return (Criteria) this;
        }

        public Criteria andMeunurlGreaterThanOrEqualTo(String value) {
            addCriterion("meunurl >=", value, "meunurl");
            return (Criteria) this;
        }

        public Criteria andMeunurlLessThan(String value) {
            addCriterion("meunurl <", value, "meunurl");
            return (Criteria) this;
        }

        public Criteria andMeunurlLessThanOrEqualTo(String value) {
            addCriterion("meunurl <=", value, "meunurl");
            return (Criteria) this;
        }

        public Criteria andMeunurlLike(String value) {
            addCriterion("meunurl like", value, "meunurl");
            return (Criteria) this;
        }

        public Criteria andMeunurlNotLike(String value) {
            addCriterion("meunurl not like", value, "meunurl");
            return (Criteria) this;
        }

        public Criteria andMeunurlIn(List<String> values) {
            addCriterion("meunurl in", values, "meunurl");
            return (Criteria) this;
        }

        public Criteria andMeunurlNotIn(List<String> values) {
            addCriterion("meunurl not in", values, "meunurl");
            return (Criteria) this;
        }

        public Criteria andMeunurlBetween(String value1, String value2) {
            addCriterion("meunurl between", value1, value2, "meunurl");
            return (Criteria) this;
        }

        public Criteria andMeunurlNotBetween(String value1, String value2) {
            addCriterion("meunurl not between", value1, value2, "meunurl");
            return (Criteria) this;
        }

        public Criteria andSorderIsNull() {
            addCriterion("sorder is null");
            return (Criteria) this;
        }

        public Criteria andSorderIsNotNull() {
            addCriterion("sorder is not null");
            return (Criteria) this;
        }

        public Criteria andSorderEqualTo(Integer value) {
            addCriterion("sorder =", value, "sorder");
            return (Criteria) this;
        }

        public Criteria andSorderNotEqualTo(Integer value) {
            addCriterion("sorder <>", value, "sorder");
            return (Criteria) this;
        }

        public Criteria andSorderGreaterThan(Integer value) {
            addCriterion("sorder >", value, "sorder");
            return (Criteria) this;
        }

        public Criteria andSorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sorder >=", value, "sorder");
            return (Criteria) this;
        }

        public Criteria andSorderLessThan(Integer value) {
            addCriterion("sorder <", value, "sorder");
            return (Criteria) this;
        }

        public Criteria andSorderLessThanOrEqualTo(Integer value) {
            addCriterion("sorder <=", value, "sorder");
            return (Criteria) this;
        }

        public Criteria andSorderIn(List<Integer> values) {
            addCriterion("sorder in", values, "sorder");
            return (Criteria) this;
        }

        public Criteria andSorderNotIn(List<Integer> values) {
            addCriterion("sorder not in", values, "sorder");
            return (Criteria) this;
        }

        public Criteria andSorderBetween(Integer value1, Integer value2) {
            addCriterion("sorder between", value1, value2, "sorder");
            return (Criteria) this;
        }

        public Criteria andSorderNotBetween(Integer value1, Integer value2) {
            addCriterion("sorder not between", value1, value2, "sorder");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Integer value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Integer value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Integer value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Integer value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Integer> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Integer> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Integer value1, Integer value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("role not between", value1, value2, "role");
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