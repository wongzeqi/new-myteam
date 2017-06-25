package priv.wzq.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class ZbitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZbitemExample() {
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

        public Criteria andZjIsNull() {
            addCriterion("zj is null");
            return (Criteria) this;
        }

        public Criteria andZjIsNotNull() {
            addCriterion("zj is not null");
            return (Criteria) this;
        }

        public Criteria andZjEqualTo(Integer value) {
            addCriterion("zj =", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotEqualTo(Integer value) {
            addCriterion("zj <>", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThan(Integer value) {
            addCriterion("zj >", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThanOrEqualTo(Integer value) {
            addCriterion("zj >=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThan(Integer value) {
            addCriterion("zj <", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThanOrEqualTo(Integer value) {
            addCriterion("zj <=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjIn(List<Integer> values) {
            addCriterion("zj in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotIn(List<Integer> values) {
            addCriterion("zj not in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjBetween(Integer value1, Integer value2) {
            addCriterion("zj between", value1, value2, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotBetween(Integer value1, Integer value2) {
            addCriterion("zj not between", value1, value2, "zj");
            return (Criteria) this;
        }

        public Criteria andKsIsNull() {
            addCriterion("ks is null");
            return (Criteria) this;
        }

        public Criteria andKsIsNotNull() {
            addCriterion("ks is not null");
            return (Criteria) this;
        }

        public Criteria andKsEqualTo(Integer value) {
            addCriterion("ks =", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotEqualTo(Integer value) {
            addCriterion("ks <>", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsGreaterThan(Integer value) {
            addCriterion("ks >", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ks >=", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsLessThan(Integer value) {
            addCriterion("ks <", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsLessThanOrEqualTo(Integer value) {
            addCriterion("ks <=", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsIn(List<Integer> values) {
            addCriterion("ks in", values, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotIn(List<Integer> values) {
            addCriterion("ks not in", values, "ks");
            return (Criteria) this;
        }

        public Criteria andKsBetween(Integer value1, Integer value2) {
            addCriterion("ks between", value1, value2, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotBetween(Integer value1, Integer value2) {
            addCriterion("ks not between", value1, value2, "ks");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberIsNull() {
            addCriterion("schoolNumber is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberIsNotNull() {
            addCriterion("schoolNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberEqualTo(String value) {
            addCriterion("schoolNumber =", value, "schoolnumber");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberNotEqualTo(String value) {
            addCriterion("schoolNumber <>", value, "schoolnumber");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberGreaterThan(String value) {
            addCriterion("schoolNumber >", value, "schoolnumber");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberGreaterThanOrEqualTo(String value) {
            addCriterion("schoolNumber >=", value, "schoolnumber");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberLessThan(String value) {
            addCriterion("schoolNumber <", value, "schoolnumber");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberLessThanOrEqualTo(String value) {
            addCriterion("schoolNumber <=", value, "schoolnumber");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberLike(String value) {
            addCriterion("schoolNumber like", value, "schoolnumber");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberNotLike(String value) {
            addCriterion("schoolNumber not like", value, "schoolnumber");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberIn(List<String> values) {
            addCriterion("schoolNumber in", values, "schoolnumber");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberNotIn(List<String> values) {
            addCriterion("schoolNumber not in", values, "schoolnumber");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberBetween(String value1, String value2) {
            addCriterion("schoolNumber between", value1, value2, "schoolnumber");
            return (Criteria) this;
        }

        public Criteria andSchoolnumberNotBetween(String value1, String value2) {
            addCriterion("schoolNumber not between", value1, value2, "schoolnumber");
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