package priv.wzq.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QjitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QjitemExample() {
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

        public Criteria andQjtypeIsNull() {
            addCriterion("qjtype is null");
            return (Criteria) this;
        }

        public Criteria andQjtypeIsNotNull() {
            addCriterion("qjtype is not null");
            return (Criteria) this;
        }

        public Criteria andQjtypeEqualTo(String value) {
            addCriterion("qjtype =", value, "qjtype");
            return (Criteria) this;
        }

        public Criteria andQjtypeNotEqualTo(String value) {
            addCriterion("qjtype <>", value, "qjtype");
            return (Criteria) this;
        }

        public Criteria andQjtypeGreaterThan(String value) {
            addCriterion("qjtype >", value, "qjtype");
            return (Criteria) this;
        }

        public Criteria andQjtypeGreaterThanOrEqualTo(String value) {
            addCriterion("qjtype >=", value, "qjtype");
            return (Criteria) this;
        }

        public Criteria andQjtypeLessThan(String value) {
            addCriterion("qjtype <", value, "qjtype");
            return (Criteria) this;
        }

        public Criteria andQjtypeLessThanOrEqualTo(String value) {
            addCriterion("qjtype <=", value, "qjtype");
            return (Criteria) this;
        }

        public Criteria andQjtypeLike(String value) {
            addCriterion("qjtype like", value, "qjtype");
            return (Criteria) this;
        }

        public Criteria andQjtypeNotLike(String value) {
            addCriterion("qjtype not like", value, "qjtype");
            return (Criteria) this;
        }

        public Criteria andQjtypeIn(List<String> values) {
            addCriterion("qjtype in", values, "qjtype");
            return (Criteria) this;
        }

        public Criteria andQjtypeNotIn(List<String> values) {
            addCriterion("qjtype not in", values, "qjtype");
            return (Criteria) this;
        }

        public Criteria andQjtypeBetween(String value1, String value2) {
            addCriterion("qjtype between", value1, value2, "qjtype");
            return (Criteria) this;
        }

        public Criteria andQjtypeNotBetween(String value1, String value2) {
            addCriterion("qjtype not between", value1, value2, "qjtype");
            return (Criteria) this;
        }

        public Criteria andQjweekIsNull() {
            addCriterion("qjweek is null");
            return (Criteria) this;
        }

        public Criteria andQjweekIsNotNull() {
            addCriterion("qjweek is not null");
            return (Criteria) this;
        }

        public Criteria andQjweekEqualTo(String value) {
            addCriterion("qjweek =", value, "qjweek");
            return (Criteria) this;
        }

        public Criteria andQjweekNotEqualTo(String value) {
            addCriterion("qjweek <>", value, "qjweek");
            return (Criteria) this;
        }

        public Criteria andQjweekGreaterThan(String value) {
            addCriterion("qjweek >", value, "qjweek");
            return (Criteria) this;
        }

        public Criteria andQjweekGreaterThanOrEqualTo(String value) {
            addCriterion("qjweek >=", value, "qjweek");
            return (Criteria) this;
        }

        public Criteria andQjweekLessThan(String value) {
            addCriterion("qjweek <", value, "qjweek");
            return (Criteria) this;
        }

        public Criteria andQjweekLessThanOrEqualTo(String value) {
            addCriterion("qjweek <=", value, "qjweek");
            return (Criteria) this;
        }

        public Criteria andQjweekLike(String value) {
            addCriterion("qjweek like", value, "qjweek");
            return (Criteria) this;
        }

        public Criteria andQjweekNotLike(String value) {
            addCriterion("qjweek not like", value, "qjweek");
            return (Criteria) this;
        }

        public Criteria andQjweekIn(List<String> values) {
            addCriterion("qjweek in", values, "qjweek");
            return (Criteria) this;
        }

        public Criteria andQjweekNotIn(List<String> values) {
            addCriterion("qjweek not in", values, "qjweek");
            return (Criteria) this;
        }

        public Criteria andQjweekBetween(String value1, String value2) {
            addCriterion("qjweek between", value1, value2, "qjweek");
            return (Criteria) this;
        }

        public Criteria andQjweekNotBetween(String value1, String value2) {
            addCriterion("qjweek not between", value1, value2, "qjweek");
            return (Criteria) this;
        }

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andQjtimeIsNull() {
            addCriterion("qjtime is null");
            return (Criteria) this;
        }

        public Criteria andQjtimeIsNotNull() {
            addCriterion("qjtime is not null");
            return (Criteria) this;
        }

        public Criteria andQjtimeEqualTo(Date value) {
            addCriterion("qjtime =", value, "qjtime");
            return (Criteria) this;
        }

        public Criteria andQjtimeNotEqualTo(Date value) {
            addCriterion("qjtime <>", value, "qjtime");
            return (Criteria) this;
        }

        public Criteria andQjtimeGreaterThan(Date value) {
            addCriterion("qjtime >", value, "qjtime");
            return (Criteria) this;
        }

        public Criteria andQjtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("qjtime >=", value, "qjtime");
            return (Criteria) this;
        }

        public Criteria andQjtimeLessThan(Date value) {
            addCriterion("qjtime <", value, "qjtime");
            return (Criteria) this;
        }

        public Criteria andQjtimeLessThanOrEqualTo(Date value) {
            addCriterion("qjtime <=", value, "qjtime");
            return (Criteria) this;
        }

        public Criteria andQjtimeIn(List<Date> values) {
            addCriterion("qjtime in", values, "qjtime");
            return (Criteria) this;
        }

        public Criteria andQjtimeNotIn(List<Date> values) {
            addCriterion("qjtime not in", values, "qjtime");
            return (Criteria) this;
        }

        public Criteria andQjtimeBetween(Date value1, Date value2) {
            addCriterion("qjtime between", value1, value2, "qjtime");
            return (Criteria) this;
        }

        public Criteria andQjtimeNotBetween(Date value1, Date value2) {
            addCriterion("qjtime not between", value1, value2, "qjtime");
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