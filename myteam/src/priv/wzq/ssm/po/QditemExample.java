package priv.wzq.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QditemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QditemExample() {
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

        public Criteria andQdtypeIsNull() {
            addCriterion("qdtype is null");
            return (Criteria) this;
        }

        public Criteria andQdtypeIsNotNull() {
            addCriterion("qdtype is not null");
            return (Criteria) this;
        }

        public Criteria andQdtypeEqualTo(String value) {
            addCriterion("qdtype =", value, "qdtype");
            return (Criteria) this;
        }

        public Criteria andQdtypeNotEqualTo(String value) {
            addCriterion("qdtype <>", value, "qdtype");
            return (Criteria) this;
        }

        public Criteria andQdtypeGreaterThan(String value) {
            addCriterion("qdtype >", value, "qdtype");
            return (Criteria) this;
        }

        public Criteria andQdtypeGreaterThanOrEqualTo(String value) {
            addCriterion("qdtype >=", value, "qdtype");
            return (Criteria) this;
        }

        public Criteria andQdtypeLessThan(String value) {
            addCriterion("qdtype <", value, "qdtype");
            return (Criteria) this;
        }

        public Criteria andQdtypeLessThanOrEqualTo(String value) {
            addCriterion("qdtype <=", value, "qdtype");
            return (Criteria) this;
        }

        public Criteria andQdtypeLike(String value) {
            addCriterion("qdtype like", value, "qdtype");
            return (Criteria) this;
        }

        public Criteria andQdtypeNotLike(String value) {
            addCriterion("qdtype not like", value, "qdtype");
            return (Criteria) this;
        }

        public Criteria andQdtypeIn(List<String> values) {
            addCriterion("qdtype in", values, "qdtype");
            return (Criteria) this;
        }

        public Criteria andQdtypeNotIn(List<String> values) {
            addCriterion("qdtype not in", values, "qdtype");
            return (Criteria) this;
        }

        public Criteria andQdtypeBetween(String value1, String value2) {
            addCriterion("qdtype between", value1, value2, "qdtype");
            return (Criteria) this;
        }

        public Criteria andQdtypeNotBetween(String value1, String value2) {
            addCriterion("qdtype not between", value1, value2, "qdtype");
            return (Criteria) this;
        }

        public Criteria andQdweekIsNull() {
            addCriterion("qdweek is null");
            return (Criteria) this;
        }

        public Criteria andQdweekIsNotNull() {
            addCriterion("qdweek is not null");
            return (Criteria) this;
        }

        public Criteria andQdweekEqualTo(String value) {
            addCriterion("qdweek =", value, "qdweek");
            return (Criteria) this;
        }

        public Criteria andQdweekNotEqualTo(String value) {
            addCriterion("qdweek <>", value, "qdweek");
            return (Criteria) this;
        }

        public Criteria andQdweekGreaterThan(String value) {
            addCriterion("qdweek >", value, "qdweek");
            return (Criteria) this;
        }

        public Criteria andQdweekGreaterThanOrEqualTo(String value) {
            addCriterion("qdweek >=", value, "qdweek");
            return (Criteria) this;
        }

        public Criteria andQdweekLessThan(String value) {
            addCriterion("qdweek <", value, "qdweek");
            return (Criteria) this;
        }

        public Criteria andQdweekLessThanOrEqualTo(String value) {
            addCriterion("qdweek <=", value, "qdweek");
            return (Criteria) this;
        }

        public Criteria andQdweekLike(String value) {
            addCriterion("qdweek like", value, "qdweek");
            return (Criteria) this;
        }

        public Criteria andQdweekNotLike(String value) {
            addCriterion("qdweek not like", value, "qdweek");
            return (Criteria) this;
        }

        public Criteria andQdweekIn(List<String> values) {
            addCriterion("qdweek in", values, "qdweek");
            return (Criteria) this;
        }

        public Criteria andQdweekNotIn(List<String> values) {
            addCriterion("qdweek not in", values, "qdweek");
            return (Criteria) this;
        }

        public Criteria andQdweekBetween(String value1, String value2) {
            addCriterion("qdweek between", value1, value2, "qdweek");
            return (Criteria) this;
        }

        public Criteria andQdweekNotBetween(String value1, String value2) {
            addCriterion("qdweek not between", value1, value2, "qdweek");
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

        public Criteria andJdIsNull() {
            addCriterion("jd is null");
            return (Criteria) this;
        }

        public Criteria andJdIsNotNull() {
            addCriterion("jd is not null");
            return (Criteria) this;
        }

        public Criteria andJdEqualTo(Double value) {
            addCriterion("jd =", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotEqualTo(Double value) {
            addCriterion("jd <>", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdGreaterThan(Double value) {
            addCriterion("jd >", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdGreaterThanOrEqualTo(Double value) {
            addCriterion("jd >=", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLessThan(Double value) {
            addCriterion("jd <", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLessThanOrEqualTo(Double value) {
            addCriterion("jd <=", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdIn(List<Double> values) {
            addCriterion("jd in", values, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotIn(List<Double> values) {
            addCriterion("jd not in", values, "jd");
            return (Criteria) this;
        }

        public Criteria andJdBetween(Double value1, Double value2) {
            addCriterion("jd between", value1, value2, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotBetween(Double value1, Double value2) {
            addCriterion("jd not between", value1, value2, "jd");
            return (Criteria) this;
        }

        public Criteria andWdIsNull() {
            addCriterion("wd is null");
            return (Criteria) this;
        }

        public Criteria andWdIsNotNull() {
            addCriterion("wd is not null");
            return (Criteria) this;
        }

        public Criteria andWdEqualTo(Double value) {
            addCriterion("wd =", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotEqualTo(Double value) {
            addCriterion("wd <>", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThan(Double value) {
            addCriterion("wd >", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThanOrEqualTo(Double value) {
            addCriterion("wd >=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThan(Double value) {
            addCriterion("wd <", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThanOrEqualTo(Double value) {
            addCriterion("wd <=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdIn(List<Double> values) {
            addCriterion("wd in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotIn(List<Double> values) {
            addCriterion("wd not in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdBetween(Double value1, Double value2) {
            addCriterion("wd between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotBetween(Double value1, Double value2) {
            addCriterion("wd not between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andQdtimeIsNull() {
            addCriterion("qdtime is null");
            return (Criteria) this;
        }

        public Criteria andQdtimeIsNotNull() {
            addCriterion("qdtime is not null");
            return (Criteria) this;
        }

        public Criteria andQdtimeEqualTo(Date value) {
            addCriterion("qdtime =", value, "qdtime");
            return (Criteria) this;
        }

        public Criteria andQdtimeNotEqualTo(Date value) {
            addCriterion("qdtime <>", value, "qdtime");
            return (Criteria) this;
        }

        public Criteria andQdtimeGreaterThan(Date value) {
            addCriterion("qdtime >", value, "qdtime");
            return (Criteria) this;
        }

        public Criteria andQdtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("qdtime >=", value, "qdtime");
            return (Criteria) this;
        }

        public Criteria andQdtimeLessThan(Date value) {
            addCriterion("qdtime <", value, "qdtime");
            return (Criteria) this;
        }

        public Criteria andQdtimeLessThanOrEqualTo(Date value) {
            addCriterion("qdtime <=", value, "qdtime");
            return (Criteria) this;
        }

        public Criteria andQdtimeIn(List<Date> values) {
            addCriterion("qdtime in", values, "qdtime");
            return (Criteria) this;
        }

        public Criteria andQdtimeNotIn(List<Date> values) {
            addCriterion("qdtime not in", values, "qdtime");
            return (Criteria) this;
        }

        public Criteria andQdtimeBetween(Date value1, Date value2) {
            addCriterion("qdtime between", value1, value2, "qdtime");
            return (Criteria) this;
        }

        public Criteria andQdtimeNotBetween(Date value1, Date value2) {
            addCriterion("qdtime not between", value1, value2, "qdtime");
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