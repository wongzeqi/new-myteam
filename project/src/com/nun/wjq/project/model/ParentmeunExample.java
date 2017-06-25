package com.nun.wjq.project.model;

import java.util.ArrayList;
import java.util.List;

public class ParentmeunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParentmeunExample() {
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

        public Criteria andPmeunnameIsNull() {
            addCriterion("pmeunname is null");
            return (Criteria) this;
        }

        public Criteria andPmeunnameIsNotNull() {
            addCriterion("pmeunname is not null");
            return (Criteria) this;
        }

        public Criteria andPmeunnameEqualTo(String value) {
            addCriterion("pmeunname =", value, "pmeunname");
            return (Criteria) this;
        }

        public Criteria andPmeunnameNotEqualTo(String value) {
            addCriterion("pmeunname <>", value, "pmeunname");
            return (Criteria) this;
        }

        public Criteria andPmeunnameGreaterThan(String value) {
            addCriterion("pmeunname >", value, "pmeunname");
            return (Criteria) this;
        }

        public Criteria andPmeunnameGreaterThanOrEqualTo(String value) {
            addCriterion("pmeunname >=", value, "pmeunname");
            return (Criteria) this;
        }

        public Criteria andPmeunnameLessThan(String value) {
            addCriterion("pmeunname <", value, "pmeunname");
            return (Criteria) this;
        }

        public Criteria andPmeunnameLessThanOrEqualTo(String value) {
            addCriterion("pmeunname <=", value, "pmeunname");
            return (Criteria) this;
        }

        public Criteria andPmeunnameLike(String value) {
            addCriterion("pmeunname like", value, "pmeunname");
            return (Criteria) this;
        }

        public Criteria andPmeunnameNotLike(String value) {
            addCriterion("pmeunname not like", value, "pmeunname");
            return (Criteria) this;
        }

        public Criteria andPmeunnameIn(List<String> values) {
            addCriterion("pmeunname in", values, "pmeunname");
            return (Criteria) this;
        }

        public Criteria andPmeunnameNotIn(List<String> values) {
            addCriterion("pmeunname not in", values, "pmeunname");
            return (Criteria) this;
        }

        public Criteria andPmeunnameBetween(String value1, String value2) {
            addCriterion("pmeunname between", value1, value2, "pmeunname");
            return (Criteria) this;
        }

        public Criteria andPmeunnameNotBetween(String value1, String value2) {
            addCriterion("pmeunname not between", value1, value2, "pmeunname");
            return (Criteria) this;
        }

        public Criteria andPmorderIsNull() {
            addCriterion("pmorder is null");
            return (Criteria) this;
        }

        public Criteria andPmorderIsNotNull() {
            addCriterion("pmorder is not null");
            return (Criteria) this;
        }

        public Criteria andPmorderEqualTo(Integer value) {
            addCriterion("pmorder =", value, "pmorder");
            return (Criteria) this;
        }

        public Criteria andPmorderNotEqualTo(Integer value) {
            addCriterion("pmorder <>", value, "pmorder");
            return (Criteria) this;
        }

        public Criteria andPmorderGreaterThan(Integer value) {
            addCriterion("pmorder >", value, "pmorder");
            return (Criteria) this;
        }

        public Criteria andPmorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("pmorder >=", value, "pmorder");
            return (Criteria) this;
        }

        public Criteria andPmorderLessThan(Integer value) {
            addCriterion("pmorder <", value, "pmorder");
            return (Criteria) this;
        }

        public Criteria andPmorderLessThanOrEqualTo(Integer value) {
            addCriterion("pmorder <=", value, "pmorder");
            return (Criteria) this;
        }

        public Criteria andPmorderIn(List<Integer> values) {
            addCriterion("pmorder in", values, "pmorder");
            return (Criteria) this;
        }

        public Criteria andPmorderNotIn(List<Integer> values) {
            addCriterion("pmorder not in", values, "pmorder");
            return (Criteria) this;
        }

        public Criteria andPmorderBetween(Integer value1, Integer value2) {
            addCriterion("pmorder between", value1, value2, "pmorder");
            return (Criteria) this;
        }

        public Criteria andPmorderNotBetween(Integer value1, Integer value2) {
            addCriterion("pmorder not between", value1, value2, "pmorder");
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