package com.nun.wjq.project.model;

import java.util.ArrayList;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTheyearIsNull() {
            addCriterion("theyear is null");
            return (Criteria) this;
        }

        public Criteria andTheyearIsNotNull() {
            addCriterion("theyear is not null");
            return (Criteria) this;
        }

        public Criteria andTheyearEqualTo(Integer value) {
            addCriterion("theyear =", value, "theyear");
            return (Criteria) this;
        }

        public Criteria andTheyearNotEqualTo(Integer value) {
            addCriterion("theyear <>", value, "theyear");
            return (Criteria) this;
        }

        public Criteria andTheyearGreaterThan(Integer value) {
            addCriterion("theyear >", value, "theyear");
            return (Criteria) this;
        }

        public Criteria andTheyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("theyear >=", value, "theyear");
            return (Criteria) this;
        }

        public Criteria andTheyearLessThan(Integer value) {
            addCriterion("theyear <", value, "theyear");
            return (Criteria) this;
        }

        public Criteria andTheyearLessThanOrEqualTo(Integer value) {
            addCriterion("theyear <=", value, "theyear");
            return (Criteria) this;
        }

        public Criteria andTheyearIn(List<Integer> values) {
            addCriterion("theyear in", values, "theyear");
            return (Criteria) this;
        }

        public Criteria andTheyearNotIn(List<Integer> values) {
            addCriterion("theyear not in", values, "theyear");
            return (Criteria) this;
        }

        public Criteria andTheyearBetween(Integer value1, Integer value2) {
            addCriterion("theyear between", value1, value2, "theyear");
            return (Criteria) this;
        }

        public Criteria andTheyearNotBetween(Integer value1, Integer value2) {
            addCriterion("theyear not between", value1, value2, "theyear");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNull() {
            addCriterion("ptype is null");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNotNull() {
            addCriterion("ptype is not null");
            return (Criteria) this;
        }

        public Criteria andPtypeEqualTo(String value) {
            addCriterion("ptype =", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotEqualTo(String value) {
            addCriterion("ptype <>", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThan(String value) {
            addCriterion("ptype >", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ptype >=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThan(String value) {
            addCriterion("ptype <", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThanOrEqualTo(String value) {
            addCriterion("ptype <=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLike(String value) {
            addCriterion("ptype like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotLike(String value) {
            addCriterion("ptype not like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeIn(List<String> values) {
            addCriterion("ptype in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotIn(List<String> values) {
            addCriterion("ptype not in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeBetween(String value1, String value2) {
            addCriterion("ptype between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotBetween(String value1, String value2) {
            addCriterion("ptype not between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andPrankIsNull() {
            addCriterion("prank is null");
            return (Criteria) this;
        }

        public Criteria andPrankIsNotNull() {
            addCriterion("prank is not null");
            return (Criteria) this;
        }

        public Criteria andPrankEqualTo(String value) {
            addCriterion("prank =", value, "prank");
            return (Criteria) this;
        }

        public Criteria andPrankNotEqualTo(String value) {
            addCriterion("prank <>", value, "prank");
            return (Criteria) this;
        }

        public Criteria andPrankGreaterThan(String value) {
            addCriterion("prank >", value, "prank");
            return (Criteria) this;
        }

        public Criteria andPrankGreaterThanOrEqualTo(String value) {
            addCriterion("prank >=", value, "prank");
            return (Criteria) this;
        }

        public Criteria andPrankLessThan(String value) {
            addCriterion("prank <", value, "prank");
            return (Criteria) this;
        }

        public Criteria andPrankLessThanOrEqualTo(String value) {
            addCriterion("prank <=", value, "prank");
            return (Criteria) this;
        }

        public Criteria andPrankLike(String value) {
            addCriterion("prank like", value, "prank");
            return (Criteria) this;
        }

        public Criteria andPrankNotLike(String value) {
            addCriterion("prank not like", value, "prank");
            return (Criteria) this;
        }

        public Criteria andPrankIn(List<String> values) {
            addCriterion("prank in", values, "prank");
            return (Criteria) this;
        }

        public Criteria andPrankNotIn(List<String> values) {
            addCriterion("prank not in", values, "prank");
            return (Criteria) this;
        }

        public Criteria andPrankBetween(String value1, String value2) {
            addCriterion("prank between", value1, value2, "prank");
            return (Criteria) this;
        }

        public Criteria andPrankNotBetween(String value1, String value2) {
            addCriterion("prank not between", value1, value2, "prank");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("begintime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("begintime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(String value) {
            addCriterion("begintime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(String value) {
            addCriterion("begintime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(String value) {
            addCriterion("begintime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("begintime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(String value) {
            addCriterion("begintime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(String value) {
            addCriterion("begintime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLike(String value) {
            addCriterion("begintime like", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotLike(String value) {
            addCriterion("begintime not like", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<String> values) {
            addCriterion("begintime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<String> values) {
            addCriterion("begintime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(String value1, String value2) {
            addCriterion("begintime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(String value1, String value2) {
            addCriterion("begintime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("endtime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("endtime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andTechnologyIsNull() {
            addCriterion("technology is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyIsNotNull() {
            addCriterion("technology is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyEqualTo(String value) {
            addCriterion("technology =", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotEqualTo(String value) {
            addCriterion("technology <>", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyGreaterThan(String value) {
            addCriterion("technology >", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyGreaterThanOrEqualTo(String value) {
            addCriterion("technology >=", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLessThan(String value) {
            addCriterion("technology <", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLessThanOrEqualTo(String value) {
            addCriterion("technology <=", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLike(String value) {
            addCriterion("technology like", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotLike(String value) {
            addCriterion("technology not like", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyIn(List<String> values) {
            addCriterion("technology in", values, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotIn(List<String> values) {
            addCriterion("technology not in", values, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyBetween(String value1, String value2) {
            addCriterion("technology between", value1, value2, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotBetween(String value1, String value2) {
            addCriterion("technology not between", value1, value2, "technology");
            return (Criteria) this;
        }

        public Criteria andOfficecostIsNull() {
            addCriterion("officecost is null");
            return (Criteria) this;
        }

        public Criteria andOfficecostIsNotNull() {
            addCriterion("officecost is not null");
            return (Criteria) this;
        }

        public Criteria andOfficecostEqualTo(Double value) {
            addCriterion("officecost =", value, "officecost");
            return (Criteria) this;
        }

        public Criteria andOfficecostNotEqualTo(Double value) {
            addCriterion("officecost <>", value, "officecost");
            return (Criteria) this;
        }

        public Criteria andOfficecostGreaterThan(Double value) {
            addCriterion("officecost >", value, "officecost");
            return (Criteria) this;
        }

        public Criteria andOfficecostGreaterThanOrEqualTo(Double value) {
            addCriterion("officecost >=", value, "officecost");
            return (Criteria) this;
        }

        public Criteria andOfficecostLessThan(Double value) {
            addCriterion("officecost <", value, "officecost");
            return (Criteria) this;
        }

        public Criteria andOfficecostLessThanOrEqualTo(Double value) {
            addCriterion("officecost <=", value, "officecost");
            return (Criteria) this;
        }

        public Criteria andOfficecostIn(List<Double> values) {
            addCriterion("officecost in", values, "officecost");
            return (Criteria) this;
        }

        public Criteria andOfficecostNotIn(List<Double> values) {
            addCriterion("officecost not in", values, "officecost");
            return (Criteria) this;
        }

        public Criteria andOfficecostBetween(Double value1, Double value2) {
            addCriterion("officecost between", value1, value2, "officecost");
            return (Criteria) this;
        }

        public Criteria andOfficecostNotBetween(Double value1, Double value2) {
            addCriterion("officecost not between", value1, value2, "officecost");
            return (Criteria) this;
        }

        public Criteria andOfficemarkIsNull() {
            addCriterion("officemark is null");
            return (Criteria) this;
        }

        public Criteria andOfficemarkIsNotNull() {
            addCriterion("officemark is not null");
            return (Criteria) this;
        }

        public Criteria andOfficemarkEqualTo(String value) {
            addCriterion("officemark =", value, "officemark");
            return (Criteria) this;
        }

        public Criteria andOfficemarkNotEqualTo(String value) {
            addCriterion("officemark <>", value, "officemark");
            return (Criteria) this;
        }

        public Criteria andOfficemarkGreaterThan(String value) {
            addCriterion("officemark >", value, "officemark");
            return (Criteria) this;
        }

        public Criteria andOfficemarkGreaterThanOrEqualTo(String value) {
            addCriterion("officemark >=", value, "officemark");
            return (Criteria) this;
        }

        public Criteria andOfficemarkLessThan(String value) {
            addCriterion("officemark <", value, "officemark");
            return (Criteria) this;
        }

        public Criteria andOfficemarkLessThanOrEqualTo(String value) {
            addCriterion("officemark <=", value, "officemark");
            return (Criteria) this;
        }

        public Criteria andOfficemarkLike(String value) {
            addCriterion("officemark like", value, "officemark");
            return (Criteria) this;
        }

        public Criteria andOfficemarkNotLike(String value) {
            addCriterion("officemark not like", value, "officemark");
            return (Criteria) this;
        }

        public Criteria andOfficemarkIn(List<String> values) {
            addCriterion("officemark in", values, "officemark");
            return (Criteria) this;
        }

        public Criteria andOfficemarkNotIn(List<String> values) {
            addCriterion("officemark not in", values, "officemark");
            return (Criteria) this;
        }

        public Criteria andOfficemarkBetween(String value1, String value2) {
            addCriterion("officemark between", value1, value2, "officemark");
            return (Criteria) this;
        }

        public Criteria andOfficemarkNotBetween(String value1, String value2) {
            addCriterion("officemark not between", value1, value2, "officemark");
            return (Criteria) this;
        }

        public Criteria andMaterialcostIsNull() {
            addCriterion("materialcost is null");
            return (Criteria) this;
        }

        public Criteria andMaterialcostIsNotNull() {
            addCriterion("materialcost is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialcostEqualTo(Double value) {
            addCriterion("materialcost =", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNotEqualTo(Double value) {
            addCriterion("materialcost <>", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostGreaterThan(Double value) {
            addCriterion("materialcost >", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostGreaterThanOrEqualTo(Double value) {
            addCriterion("materialcost >=", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostLessThan(Double value) {
            addCriterion("materialcost <", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostLessThanOrEqualTo(Double value) {
            addCriterion("materialcost <=", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostIn(List<Double> values) {
            addCriterion("materialcost in", values, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNotIn(List<Double> values) {
            addCriterion("materialcost not in", values, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostBetween(Double value1, Double value2) {
            addCriterion("materialcost between", value1, value2, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNotBetween(Double value1, Double value2) {
            addCriterion("materialcost not between", value1, value2, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkIsNull() {
            addCriterion("materialmark is null");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkIsNotNull() {
            addCriterion("materialmark is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkEqualTo(String value) {
            addCriterion("materialmark =", value, "materialmark");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkNotEqualTo(String value) {
            addCriterion("materialmark <>", value, "materialmark");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkGreaterThan(String value) {
            addCriterion("materialmark >", value, "materialmark");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkGreaterThanOrEqualTo(String value) {
            addCriterion("materialmark >=", value, "materialmark");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkLessThan(String value) {
            addCriterion("materialmark <", value, "materialmark");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkLessThanOrEqualTo(String value) {
            addCriterion("materialmark <=", value, "materialmark");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkLike(String value) {
            addCriterion("materialmark like", value, "materialmark");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkNotLike(String value) {
            addCriterion("materialmark not like", value, "materialmark");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkIn(List<String> values) {
            addCriterion("materialmark in", values, "materialmark");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkNotIn(List<String> values) {
            addCriterion("materialmark not in", values, "materialmark");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkBetween(String value1, String value2) {
            addCriterion("materialmark between", value1, value2, "materialmark");
            return (Criteria) this;
        }

        public Criteria andMaterialmarkNotBetween(String value1, String value2) {
            addCriterion("materialmark not between", value1, value2, "materialmark");
            return (Criteria) this;
        }

        public Criteria andBookcostIsNull() {
            addCriterion("bookcost is null");
            return (Criteria) this;
        }

        public Criteria andBookcostIsNotNull() {
            addCriterion("bookcost is not null");
            return (Criteria) this;
        }

        public Criteria andBookcostEqualTo(Double value) {
            addCriterion("bookcost =", value, "bookcost");
            return (Criteria) this;
        }

        public Criteria andBookcostNotEqualTo(Double value) {
            addCriterion("bookcost <>", value, "bookcost");
            return (Criteria) this;
        }

        public Criteria andBookcostGreaterThan(Double value) {
            addCriterion("bookcost >", value, "bookcost");
            return (Criteria) this;
        }

        public Criteria andBookcostGreaterThanOrEqualTo(Double value) {
            addCriterion("bookcost >=", value, "bookcost");
            return (Criteria) this;
        }

        public Criteria andBookcostLessThan(Double value) {
            addCriterion("bookcost <", value, "bookcost");
            return (Criteria) this;
        }

        public Criteria andBookcostLessThanOrEqualTo(Double value) {
            addCriterion("bookcost <=", value, "bookcost");
            return (Criteria) this;
        }

        public Criteria andBookcostIn(List<Double> values) {
            addCriterion("bookcost in", values, "bookcost");
            return (Criteria) this;
        }

        public Criteria andBookcostNotIn(List<Double> values) {
            addCriterion("bookcost not in", values, "bookcost");
            return (Criteria) this;
        }

        public Criteria andBookcostBetween(Double value1, Double value2) {
            addCriterion("bookcost between", value1, value2, "bookcost");
            return (Criteria) this;
        }

        public Criteria andBookcostNotBetween(Double value1, Double value2) {
            addCriterion("bookcost not between", value1, value2, "bookcost");
            return (Criteria) this;
        }

        public Criteria andBookmarkIsNull() {
            addCriterion("bookmark is null");
            return (Criteria) this;
        }

        public Criteria andBookmarkIsNotNull() {
            addCriterion("bookmark is not null");
            return (Criteria) this;
        }

        public Criteria andBookmarkEqualTo(String value) {
            addCriterion("bookmark =", value, "bookmark");
            return (Criteria) this;
        }

        public Criteria andBookmarkNotEqualTo(String value) {
            addCriterion("bookmark <>", value, "bookmark");
            return (Criteria) this;
        }

        public Criteria andBookmarkGreaterThan(String value) {
            addCriterion("bookmark >", value, "bookmark");
            return (Criteria) this;
        }

        public Criteria andBookmarkGreaterThanOrEqualTo(String value) {
            addCriterion("bookmark >=", value, "bookmark");
            return (Criteria) this;
        }

        public Criteria andBookmarkLessThan(String value) {
            addCriterion("bookmark <", value, "bookmark");
            return (Criteria) this;
        }

        public Criteria andBookmarkLessThanOrEqualTo(String value) {
            addCriterion("bookmark <=", value, "bookmark");
            return (Criteria) this;
        }

        public Criteria andBookmarkLike(String value) {
            addCriterion("bookmark like", value, "bookmark");
            return (Criteria) this;
        }

        public Criteria andBookmarkNotLike(String value) {
            addCriterion("bookmark not like", value, "bookmark");
            return (Criteria) this;
        }

        public Criteria andBookmarkIn(List<String> values) {
            addCriterion("bookmark in", values, "bookmark");
            return (Criteria) this;
        }

        public Criteria andBookmarkNotIn(List<String> values) {
            addCriterion("bookmark not in", values, "bookmark");
            return (Criteria) this;
        }

        public Criteria andBookmarkBetween(String value1, String value2) {
            addCriterion("bookmark between", value1, value2, "bookmark");
            return (Criteria) this;
        }

        public Criteria andBookmarkNotBetween(String value1, String value2) {
            addCriterion("bookmark not between", value1, value2, "bookmark");
            return (Criteria) this;
        }

        public Criteria andPostcostIsNull() {
            addCriterion("postcost is null");
            return (Criteria) this;
        }

        public Criteria andPostcostIsNotNull() {
            addCriterion("postcost is not null");
            return (Criteria) this;
        }

        public Criteria andPostcostEqualTo(Double value) {
            addCriterion("postcost =", value, "postcost");
            return (Criteria) this;
        }

        public Criteria andPostcostNotEqualTo(Double value) {
            addCriterion("postcost <>", value, "postcost");
            return (Criteria) this;
        }

        public Criteria andPostcostGreaterThan(Double value) {
            addCriterion("postcost >", value, "postcost");
            return (Criteria) this;
        }

        public Criteria andPostcostGreaterThanOrEqualTo(Double value) {
            addCriterion("postcost >=", value, "postcost");
            return (Criteria) this;
        }

        public Criteria andPostcostLessThan(Double value) {
            addCriterion("postcost <", value, "postcost");
            return (Criteria) this;
        }

        public Criteria andPostcostLessThanOrEqualTo(Double value) {
            addCriterion("postcost <=", value, "postcost");
            return (Criteria) this;
        }

        public Criteria andPostcostIn(List<Double> values) {
            addCriterion("postcost in", values, "postcost");
            return (Criteria) this;
        }

        public Criteria andPostcostNotIn(List<Double> values) {
            addCriterion("postcost not in", values, "postcost");
            return (Criteria) this;
        }

        public Criteria andPostcostBetween(Double value1, Double value2) {
            addCriterion("postcost between", value1, value2, "postcost");
            return (Criteria) this;
        }

        public Criteria andPostcostNotBetween(Double value1, Double value2) {
            addCriterion("postcost not between", value1, value2, "postcost");
            return (Criteria) this;
        }

        public Criteria andPostmarkIsNull() {
            addCriterion("postmark is null");
            return (Criteria) this;
        }

        public Criteria andPostmarkIsNotNull() {
            addCriterion("postmark is not null");
            return (Criteria) this;
        }

        public Criteria andPostmarkEqualTo(String value) {
            addCriterion("postmark =", value, "postmark");
            return (Criteria) this;
        }

        public Criteria andPostmarkNotEqualTo(String value) {
            addCriterion("postmark <>", value, "postmark");
            return (Criteria) this;
        }

        public Criteria andPostmarkGreaterThan(String value) {
            addCriterion("postmark >", value, "postmark");
            return (Criteria) this;
        }

        public Criteria andPostmarkGreaterThanOrEqualTo(String value) {
            addCriterion("postmark >=", value, "postmark");
            return (Criteria) this;
        }

        public Criteria andPostmarkLessThan(String value) {
            addCriterion("postmark <", value, "postmark");
            return (Criteria) this;
        }

        public Criteria andPostmarkLessThanOrEqualTo(String value) {
            addCriterion("postmark <=", value, "postmark");
            return (Criteria) this;
        }

        public Criteria andPostmarkLike(String value) {
            addCriterion("postmark like", value, "postmark");
            return (Criteria) this;
        }

        public Criteria andPostmarkNotLike(String value) {
            addCriterion("postmark not like", value, "postmark");
            return (Criteria) this;
        }

        public Criteria andPostmarkIn(List<String> values) {
            addCriterion("postmark in", values, "postmark");
            return (Criteria) this;
        }

        public Criteria andPostmarkNotIn(List<String> values) {
            addCriterion("postmark not in", values, "postmark");
            return (Criteria) this;
        }

        public Criteria andPostmarkBetween(String value1, String value2) {
            addCriterion("postmark between", value1, value2, "postmark");
            return (Criteria) this;
        }

        public Criteria andPostmarkNotBetween(String value1, String value2) {
            addCriterion("postmark not between", value1, value2, "postmark");
            return (Criteria) this;
        }

        public Criteria andPhonecostIsNull() {
            addCriterion("phonecost is null");
            return (Criteria) this;
        }

        public Criteria andPhonecostIsNotNull() {
            addCriterion("phonecost is not null");
            return (Criteria) this;
        }

        public Criteria andPhonecostEqualTo(Double value) {
            addCriterion("phonecost =", value, "phonecost");
            return (Criteria) this;
        }

        public Criteria andPhonecostNotEqualTo(Double value) {
            addCriterion("phonecost <>", value, "phonecost");
            return (Criteria) this;
        }

        public Criteria andPhonecostGreaterThan(Double value) {
            addCriterion("phonecost >", value, "phonecost");
            return (Criteria) this;
        }

        public Criteria andPhonecostGreaterThanOrEqualTo(Double value) {
            addCriterion("phonecost >=", value, "phonecost");
            return (Criteria) this;
        }

        public Criteria andPhonecostLessThan(Double value) {
            addCriterion("phonecost <", value, "phonecost");
            return (Criteria) this;
        }

        public Criteria andPhonecostLessThanOrEqualTo(Double value) {
            addCriterion("phonecost <=", value, "phonecost");
            return (Criteria) this;
        }

        public Criteria andPhonecostIn(List<Double> values) {
            addCriterion("phonecost in", values, "phonecost");
            return (Criteria) this;
        }

        public Criteria andPhonecostNotIn(List<Double> values) {
            addCriterion("phonecost not in", values, "phonecost");
            return (Criteria) this;
        }

        public Criteria andPhonecostBetween(Double value1, Double value2) {
            addCriterion("phonecost between", value1, value2, "phonecost");
            return (Criteria) this;
        }

        public Criteria andPhonecostNotBetween(Double value1, Double value2) {
            addCriterion("phonecost not between", value1, value2, "phonecost");
            return (Criteria) this;
        }

        public Criteria andPhonemarkIsNull() {
            addCriterion("phonemark is null");
            return (Criteria) this;
        }

        public Criteria andPhonemarkIsNotNull() {
            addCriterion("phonemark is not null");
            return (Criteria) this;
        }

        public Criteria andPhonemarkEqualTo(String value) {
            addCriterion("phonemark =", value, "phonemark");
            return (Criteria) this;
        }

        public Criteria andPhonemarkNotEqualTo(String value) {
            addCriterion("phonemark <>", value, "phonemark");
            return (Criteria) this;
        }

        public Criteria andPhonemarkGreaterThan(String value) {
            addCriterion("phonemark >", value, "phonemark");
            return (Criteria) this;
        }

        public Criteria andPhonemarkGreaterThanOrEqualTo(String value) {
            addCriterion("phonemark >=", value, "phonemark");
            return (Criteria) this;
        }

        public Criteria andPhonemarkLessThan(String value) {
            addCriterion("phonemark <", value, "phonemark");
            return (Criteria) this;
        }

        public Criteria andPhonemarkLessThanOrEqualTo(String value) {
            addCriterion("phonemark <=", value, "phonemark");
            return (Criteria) this;
        }

        public Criteria andPhonemarkLike(String value) {
            addCriterion("phonemark like", value, "phonemark");
            return (Criteria) this;
        }

        public Criteria andPhonemarkNotLike(String value) {
            addCriterion("phonemark not like", value, "phonemark");
            return (Criteria) this;
        }

        public Criteria andPhonemarkIn(List<String> values) {
            addCriterion("phonemark in", values, "phonemark");
            return (Criteria) this;
        }

        public Criteria andPhonemarkNotIn(List<String> values) {
            addCriterion("phonemark not in", values, "phonemark");
            return (Criteria) this;
        }

        public Criteria andPhonemarkBetween(String value1, String value2) {
            addCriterion("phonemark between", value1, value2, "phonemark");
            return (Criteria) this;
        }

        public Criteria andPhonemarkNotBetween(String value1, String value2) {
            addCriterion("phonemark not between", value1, value2, "phonemark");
            return (Criteria) this;
        }

        public Criteria andTransportationcostIsNull() {
            addCriterion("transportationcost is null");
            return (Criteria) this;
        }

        public Criteria andTransportationcostIsNotNull() {
            addCriterion("transportationcost is not null");
            return (Criteria) this;
        }

        public Criteria andTransportationcostEqualTo(Double value) {
            addCriterion("transportationcost =", value, "transportationcost");
            return (Criteria) this;
        }

        public Criteria andTransportationcostNotEqualTo(Double value) {
            addCriterion("transportationcost <>", value, "transportationcost");
            return (Criteria) this;
        }

        public Criteria andTransportationcostGreaterThan(Double value) {
            addCriterion("transportationcost >", value, "transportationcost");
            return (Criteria) this;
        }

        public Criteria andTransportationcostGreaterThanOrEqualTo(Double value) {
            addCriterion("transportationcost >=", value, "transportationcost");
            return (Criteria) this;
        }

        public Criteria andTransportationcostLessThan(Double value) {
            addCriterion("transportationcost <", value, "transportationcost");
            return (Criteria) this;
        }

        public Criteria andTransportationcostLessThanOrEqualTo(Double value) {
            addCriterion("transportationcost <=", value, "transportationcost");
            return (Criteria) this;
        }

        public Criteria andTransportationcostIn(List<Double> values) {
            addCriterion("transportationcost in", values, "transportationcost");
            return (Criteria) this;
        }

        public Criteria andTransportationcostNotIn(List<Double> values) {
            addCriterion("transportationcost not in", values, "transportationcost");
            return (Criteria) this;
        }

        public Criteria andTransportationcostBetween(Double value1, Double value2) {
            addCriterion("transportationcost between", value1, value2, "transportationcost");
            return (Criteria) this;
        }

        public Criteria andTransportationcostNotBetween(Double value1, Double value2) {
            addCriterion("transportationcost not between", value1, value2, "transportationcost");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkIsNull() {
            addCriterion("transportationmark is null");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkIsNotNull() {
            addCriterion("transportationmark is not null");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkEqualTo(String value) {
            addCriterion("transportationmark =", value, "transportationmark");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkNotEqualTo(String value) {
            addCriterion("transportationmark <>", value, "transportationmark");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkGreaterThan(String value) {
            addCriterion("transportationmark >", value, "transportationmark");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkGreaterThanOrEqualTo(String value) {
            addCriterion("transportationmark >=", value, "transportationmark");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkLessThan(String value) {
            addCriterion("transportationmark <", value, "transportationmark");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkLessThanOrEqualTo(String value) {
            addCriterion("transportationmark <=", value, "transportationmark");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkLike(String value) {
            addCriterion("transportationmark like", value, "transportationmark");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkNotLike(String value) {
            addCriterion("transportationmark not like", value, "transportationmark");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkIn(List<String> values) {
            addCriterion("transportationmark in", values, "transportationmark");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkNotIn(List<String> values) {
            addCriterion("transportationmark not in", values, "transportationmark");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkBetween(String value1, String value2) {
            addCriterion("transportationmark between", value1, value2, "transportationmark");
            return (Criteria) this;
        }

        public Criteria andTransportationmarkNotBetween(String value1, String value2) {
            addCriterion("transportationmark not between", value1, value2, "transportationmark");
            return (Criteria) this;
        }

        public Criteria andMaintaincostIsNull() {
            addCriterion("maintaincost is null");
            return (Criteria) this;
        }

        public Criteria andMaintaincostIsNotNull() {
            addCriterion("maintaincost is not null");
            return (Criteria) this;
        }

        public Criteria andMaintaincostEqualTo(Double value) {
            addCriterion("maintaincost =", value, "maintaincost");
            return (Criteria) this;
        }

        public Criteria andMaintaincostNotEqualTo(Double value) {
            addCriterion("maintaincost <>", value, "maintaincost");
            return (Criteria) this;
        }

        public Criteria andMaintaincostGreaterThan(Double value) {
            addCriterion("maintaincost >", value, "maintaincost");
            return (Criteria) this;
        }

        public Criteria andMaintaincostGreaterThanOrEqualTo(Double value) {
            addCriterion("maintaincost >=", value, "maintaincost");
            return (Criteria) this;
        }

        public Criteria andMaintaincostLessThan(Double value) {
            addCriterion("maintaincost <", value, "maintaincost");
            return (Criteria) this;
        }

        public Criteria andMaintaincostLessThanOrEqualTo(Double value) {
            addCriterion("maintaincost <=", value, "maintaincost");
            return (Criteria) this;
        }

        public Criteria andMaintaincostIn(List<Double> values) {
            addCriterion("maintaincost in", values, "maintaincost");
            return (Criteria) this;
        }

        public Criteria andMaintaincostNotIn(List<Double> values) {
            addCriterion("maintaincost not in", values, "maintaincost");
            return (Criteria) this;
        }

        public Criteria andMaintaincostBetween(Double value1, Double value2) {
            addCriterion("maintaincost between", value1, value2, "maintaincost");
            return (Criteria) this;
        }

        public Criteria andMaintaincostNotBetween(Double value1, Double value2) {
            addCriterion("maintaincost not between", value1, value2, "maintaincost");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkIsNull() {
            addCriterion("maintainmark is null");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkIsNotNull() {
            addCriterion("maintainmark is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkEqualTo(String value) {
            addCriterion("maintainmark =", value, "maintainmark");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkNotEqualTo(String value) {
            addCriterion("maintainmark <>", value, "maintainmark");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkGreaterThan(String value) {
            addCriterion("maintainmark >", value, "maintainmark");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkGreaterThanOrEqualTo(String value) {
            addCriterion("maintainmark >=", value, "maintainmark");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkLessThan(String value) {
            addCriterion("maintainmark <", value, "maintainmark");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkLessThanOrEqualTo(String value) {
            addCriterion("maintainmark <=", value, "maintainmark");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkLike(String value) {
            addCriterion("maintainmark like", value, "maintainmark");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkNotLike(String value) {
            addCriterion("maintainmark not like", value, "maintainmark");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkIn(List<String> values) {
            addCriterion("maintainmark in", values, "maintainmark");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkNotIn(List<String> values) {
            addCriterion("maintainmark not in", values, "maintainmark");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkBetween(String value1, String value2) {
            addCriterion("maintainmark between", value1, value2, "maintainmark");
            return (Criteria) this;
        }

        public Criteria andMaintainmarkNotBetween(String value1, String value2) {
            addCriterion("maintainmark not between", value1, value2, "maintainmark");
            return (Criteria) this;
        }

        public Criteria andPrintcostIsNull() {
            addCriterion("printcost is null");
            return (Criteria) this;
        }

        public Criteria andPrintcostIsNotNull() {
            addCriterion("printcost is not null");
            return (Criteria) this;
        }

        public Criteria andPrintcostEqualTo(Double value) {
            addCriterion("printcost =", value, "printcost");
            return (Criteria) this;
        }

        public Criteria andPrintcostNotEqualTo(Double value) {
            addCriterion("printcost <>", value, "printcost");
            return (Criteria) this;
        }

        public Criteria andPrintcostGreaterThan(Double value) {
            addCriterion("printcost >", value, "printcost");
            return (Criteria) this;
        }

        public Criteria andPrintcostGreaterThanOrEqualTo(Double value) {
            addCriterion("printcost >=", value, "printcost");
            return (Criteria) this;
        }

        public Criteria andPrintcostLessThan(Double value) {
            addCriterion("printcost <", value, "printcost");
            return (Criteria) this;
        }

        public Criteria andPrintcostLessThanOrEqualTo(Double value) {
            addCriterion("printcost <=", value, "printcost");
            return (Criteria) this;
        }

        public Criteria andPrintcostIn(List<Double> values) {
            addCriterion("printcost in", values, "printcost");
            return (Criteria) this;
        }

        public Criteria andPrintcostNotIn(List<Double> values) {
            addCriterion("printcost not in", values, "printcost");
            return (Criteria) this;
        }

        public Criteria andPrintcostBetween(Double value1, Double value2) {
            addCriterion("printcost between", value1, value2, "printcost");
            return (Criteria) this;
        }

        public Criteria andPrintcostNotBetween(Double value1, Double value2) {
            addCriterion("printcost not between", value1, value2, "printcost");
            return (Criteria) this;
        }

        public Criteria andPrintmarkIsNull() {
            addCriterion("printmark is null");
            return (Criteria) this;
        }

        public Criteria andPrintmarkIsNotNull() {
            addCriterion("printmark is not null");
            return (Criteria) this;
        }

        public Criteria andPrintmarkEqualTo(String value) {
            addCriterion("printmark =", value, "printmark");
            return (Criteria) this;
        }

        public Criteria andPrintmarkNotEqualTo(String value) {
            addCriterion("printmark <>", value, "printmark");
            return (Criteria) this;
        }

        public Criteria andPrintmarkGreaterThan(String value) {
            addCriterion("printmark >", value, "printmark");
            return (Criteria) this;
        }

        public Criteria andPrintmarkGreaterThanOrEqualTo(String value) {
            addCriterion("printmark >=", value, "printmark");
            return (Criteria) this;
        }

        public Criteria andPrintmarkLessThan(String value) {
            addCriterion("printmark <", value, "printmark");
            return (Criteria) this;
        }

        public Criteria andPrintmarkLessThanOrEqualTo(String value) {
            addCriterion("printmark <=", value, "printmark");
            return (Criteria) this;
        }

        public Criteria andPrintmarkLike(String value) {
            addCriterion("printmark like", value, "printmark");
            return (Criteria) this;
        }

        public Criteria andPrintmarkNotLike(String value) {
            addCriterion("printmark not like", value, "printmark");
            return (Criteria) this;
        }

        public Criteria andPrintmarkIn(List<String> values) {
            addCriterion("printmark in", values, "printmark");
            return (Criteria) this;
        }

        public Criteria andPrintmarkNotIn(List<String> values) {
            addCriterion("printmark not in", values, "printmark");
            return (Criteria) this;
        }

        public Criteria andPrintmarkBetween(String value1, String value2) {
            addCriterion("printmark between", value1, value2, "printmark");
            return (Criteria) this;
        }

        public Criteria andPrintmarkNotBetween(String value1, String value2) {
            addCriterion("printmark not between", value1, value2, "printmark");
            return (Criteria) this;
        }

        public Criteria andIsteamIsNull() {
            addCriterion("isteam is null");
            return (Criteria) this;
        }

        public Criteria andIsteamIsNotNull() {
            addCriterion("isteam is not null");
            return (Criteria) this;
        }

        public Criteria andIsteamEqualTo(Integer value) {
            addCriterion("isteam =", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamNotEqualTo(Integer value) {
            addCriterion("isteam <>", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamGreaterThan(Integer value) {
            addCriterion("isteam >", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamGreaterThanOrEqualTo(Integer value) {
            addCriterion("isteam >=", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamLessThan(Integer value) {
            addCriterion("isteam <", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamLessThanOrEqualTo(Integer value) {
            addCriterion("isteam <=", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamIn(List<Integer> values) {
            addCriterion("isteam in", values, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamNotIn(List<Integer> values) {
            addCriterion("isteam not in", values, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamBetween(Integer value1, Integer value2) {
            addCriterion("isteam between", value1, value2, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamNotBetween(Integer value1, Integer value2) {
            addCriterion("isteam not between", value1, value2, "isteam");
            return (Criteria) this;
        }

        public Criteria andStu6IsNull() {
            addCriterion("stu6 is null");
            return (Criteria) this;
        }

        public Criteria andStu6IsNotNull() {
            addCriterion("stu6 is not null");
            return (Criteria) this;
        }

        public Criteria andStu6EqualTo(String value) {
            addCriterion("stu6 =", value, "stu6");
            return (Criteria) this;
        }

        public Criteria andStu6NotEqualTo(String value) {
            addCriterion("stu6 <>", value, "stu6");
            return (Criteria) this;
        }

        public Criteria andStu6GreaterThan(String value) {
            addCriterion("stu6 >", value, "stu6");
            return (Criteria) this;
        }

        public Criteria andStu6GreaterThanOrEqualTo(String value) {
            addCriterion("stu6 >=", value, "stu6");
            return (Criteria) this;
        }

        public Criteria andStu6LessThan(String value) {
            addCriterion("stu6 <", value, "stu6");
            return (Criteria) this;
        }

        public Criteria andStu6LessThanOrEqualTo(String value) {
            addCriterion("stu6 <=", value, "stu6");
            return (Criteria) this;
        }

        public Criteria andStu6Like(String value) {
            addCriterion("stu6 like", value, "stu6");
            return (Criteria) this;
        }

        public Criteria andStu6NotLike(String value) {
            addCriterion("stu6 not like", value, "stu6");
            return (Criteria) this;
        }

        public Criteria andStu6In(List<String> values) {
            addCriterion("stu6 in", values, "stu6");
            return (Criteria) this;
        }

        public Criteria andStu6NotIn(List<String> values) {
            addCriterion("stu6 not in", values, "stu6");
            return (Criteria) this;
        }

        public Criteria andStu6Between(String value1, String value2) {
            addCriterion("stu6 between", value1, value2, "stu6");
            return (Criteria) this;
        }

        public Criteria andStu6NotBetween(String value1, String value2) {
            addCriterion("stu6 not between", value1, value2, "stu6");
            return (Criteria) this;
        }

        public Criteria andStu5IsNull() {
            addCriterion("stu5 is null");
            return (Criteria) this;
        }

        public Criteria andStu5IsNotNull() {
            addCriterion("stu5 is not null");
            return (Criteria) this;
        }

        public Criteria andStu5EqualTo(String value) {
            addCriterion("stu5 =", value, "stu5");
            return (Criteria) this;
        }

        public Criteria andStu5NotEqualTo(String value) {
            addCriterion("stu5 <>", value, "stu5");
            return (Criteria) this;
        }

        public Criteria andStu5GreaterThan(String value) {
            addCriterion("stu5 >", value, "stu5");
            return (Criteria) this;
        }

        public Criteria andStu5GreaterThanOrEqualTo(String value) {
            addCriterion("stu5 >=", value, "stu5");
            return (Criteria) this;
        }

        public Criteria andStu5LessThan(String value) {
            addCriterion("stu5 <", value, "stu5");
            return (Criteria) this;
        }

        public Criteria andStu5LessThanOrEqualTo(String value) {
            addCriterion("stu5 <=", value, "stu5");
            return (Criteria) this;
        }

        public Criteria andStu5Like(String value) {
            addCriterion("stu5 like", value, "stu5");
            return (Criteria) this;
        }

        public Criteria andStu5NotLike(String value) {
            addCriterion("stu5 not like", value, "stu5");
            return (Criteria) this;
        }

        public Criteria andStu5In(List<String> values) {
            addCriterion("stu5 in", values, "stu5");
            return (Criteria) this;
        }

        public Criteria andStu5NotIn(List<String> values) {
            addCriterion("stu5 not in", values, "stu5");
            return (Criteria) this;
        }

        public Criteria andStu5Between(String value1, String value2) {
            addCriterion("stu5 between", value1, value2, "stu5");
            return (Criteria) this;
        }

        public Criteria andStu5NotBetween(String value1, String value2) {
            addCriterion("stu5 not between", value1, value2, "stu5");
            return (Criteria) this;
        }

        public Criteria andStu4IsNull() {
            addCriterion("stu4 is null");
            return (Criteria) this;
        }

        public Criteria andStu4IsNotNull() {
            addCriterion("stu4 is not null");
            return (Criteria) this;
        }

        public Criteria andStu4EqualTo(String value) {
            addCriterion("stu4 =", value, "stu4");
            return (Criteria) this;
        }

        public Criteria andStu4NotEqualTo(String value) {
            addCriterion("stu4 <>", value, "stu4");
            return (Criteria) this;
        }

        public Criteria andStu4GreaterThan(String value) {
            addCriterion("stu4 >", value, "stu4");
            return (Criteria) this;
        }

        public Criteria andStu4GreaterThanOrEqualTo(String value) {
            addCriterion("stu4 >=", value, "stu4");
            return (Criteria) this;
        }

        public Criteria andStu4LessThan(String value) {
            addCriterion("stu4 <", value, "stu4");
            return (Criteria) this;
        }

        public Criteria andStu4LessThanOrEqualTo(String value) {
            addCriterion("stu4 <=", value, "stu4");
            return (Criteria) this;
        }

        public Criteria andStu4Like(String value) {
            addCriterion("stu4 like", value, "stu4");
            return (Criteria) this;
        }

        public Criteria andStu4NotLike(String value) {
            addCriterion("stu4 not like", value, "stu4");
            return (Criteria) this;
        }

        public Criteria andStu4In(List<String> values) {
            addCriterion("stu4 in", values, "stu4");
            return (Criteria) this;
        }

        public Criteria andStu4NotIn(List<String> values) {
            addCriterion("stu4 not in", values, "stu4");
            return (Criteria) this;
        }

        public Criteria andStu4Between(String value1, String value2) {
            addCriterion("stu4 between", value1, value2, "stu4");
            return (Criteria) this;
        }

        public Criteria andStu4NotBetween(String value1, String value2) {
            addCriterion("stu4 not between", value1, value2, "stu4");
            return (Criteria) this;
        }

        public Criteria andStu3IsNull() {
            addCriterion("stu3 is null");
            return (Criteria) this;
        }

        public Criteria andStu3IsNotNull() {
            addCriterion("stu3 is not null");
            return (Criteria) this;
        }

        public Criteria andStu3EqualTo(String value) {
            addCriterion("stu3 =", value, "stu3");
            return (Criteria) this;
        }

        public Criteria andStu3NotEqualTo(String value) {
            addCriterion("stu3 <>", value, "stu3");
            return (Criteria) this;
        }

        public Criteria andStu3GreaterThan(String value) {
            addCriterion("stu3 >", value, "stu3");
            return (Criteria) this;
        }

        public Criteria andStu3GreaterThanOrEqualTo(String value) {
            addCriterion("stu3 >=", value, "stu3");
            return (Criteria) this;
        }

        public Criteria andStu3LessThan(String value) {
            addCriterion("stu3 <", value, "stu3");
            return (Criteria) this;
        }

        public Criteria andStu3LessThanOrEqualTo(String value) {
            addCriterion("stu3 <=", value, "stu3");
            return (Criteria) this;
        }

        public Criteria andStu3Like(String value) {
            addCriterion("stu3 like", value, "stu3");
            return (Criteria) this;
        }

        public Criteria andStu3NotLike(String value) {
            addCriterion("stu3 not like", value, "stu3");
            return (Criteria) this;
        }

        public Criteria andStu3In(List<String> values) {
            addCriterion("stu3 in", values, "stu3");
            return (Criteria) this;
        }

        public Criteria andStu3NotIn(List<String> values) {
            addCriterion("stu3 not in", values, "stu3");
            return (Criteria) this;
        }

        public Criteria andStu3Between(String value1, String value2) {
            addCriterion("stu3 between", value1, value2, "stu3");
            return (Criteria) this;
        }

        public Criteria andStu3NotBetween(String value1, String value2) {
            addCriterion("stu3 not between", value1, value2, "stu3");
            return (Criteria) this;
        }

        public Criteria andStu2IsNull() {
            addCriterion("stu2 is null");
            return (Criteria) this;
        }

        public Criteria andStu2IsNotNull() {
            addCriterion("stu2 is not null");
            return (Criteria) this;
        }

        public Criteria andStu2EqualTo(String value) {
            addCriterion("stu2 =", value, "stu2");
            return (Criteria) this;
        }

        public Criteria andStu2NotEqualTo(String value) {
            addCriterion("stu2 <>", value, "stu2");
            return (Criteria) this;
        }

        public Criteria andStu2GreaterThan(String value) {
            addCriterion("stu2 >", value, "stu2");
            return (Criteria) this;
        }

        public Criteria andStu2GreaterThanOrEqualTo(String value) {
            addCriterion("stu2 >=", value, "stu2");
            return (Criteria) this;
        }

        public Criteria andStu2LessThan(String value) {
            addCriterion("stu2 <", value, "stu2");
            return (Criteria) this;
        }

        public Criteria andStu2LessThanOrEqualTo(String value) {
            addCriterion("stu2 <=", value, "stu2");
            return (Criteria) this;
        }

        public Criteria andStu2Like(String value) {
            addCriterion("stu2 like", value, "stu2");
            return (Criteria) this;
        }

        public Criteria andStu2NotLike(String value) {
            addCriterion("stu2 not like", value, "stu2");
            return (Criteria) this;
        }

        public Criteria andStu2In(List<String> values) {
            addCriterion("stu2 in", values, "stu2");
            return (Criteria) this;
        }

        public Criteria andStu2NotIn(List<String> values) {
            addCriterion("stu2 not in", values, "stu2");
            return (Criteria) this;
        }

        public Criteria andStu2Between(String value1, String value2) {
            addCriterion("stu2 between", value1, value2, "stu2");
            return (Criteria) this;
        }

        public Criteria andStu2NotBetween(String value1, String value2) {
            addCriterion("stu2 not between", value1, value2, "stu2");
            return (Criteria) this;
        }

        public Criteria andStu1IsNull() {
            addCriterion("stu1 is null");
            return (Criteria) this;
        }

        public Criteria andStu1IsNotNull() {
            addCriterion("stu1 is not null");
            return (Criteria) this;
        }

        public Criteria andStu1EqualTo(String value) {
            addCriterion("stu1 =", value, "stu1");
            return (Criteria) this;
        }

        public Criteria andStu1NotEqualTo(String value) {
            addCriterion("stu1 <>", value, "stu1");
            return (Criteria) this;
        }

        public Criteria andStu1GreaterThan(String value) {
            addCriterion("stu1 >", value, "stu1");
            return (Criteria) this;
        }

        public Criteria andStu1GreaterThanOrEqualTo(String value) {
            addCriterion("stu1 >=", value, "stu1");
            return (Criteria) this;
        }

        public Criteria andStu1LessThan(String value) {
            addCriterion("stu1 <", value, "stu1");
            return (Criteria) this;
        }

        public Criteria andStu1LessThanOrEqualTo(String value) {
            addCriterion("stu1 <=", value, "stu1");
            return (Criteria) this;
        }

        public Criteria andStu1Like(String value) {
            addCriterion("stu1 like", value, "stu1");
            return (Criteria) this;
        }

        public Criteria andStu1NotLike(String value) {
            addCriterion("stu1 not like", value, "stu1");
            return (Criteria) this;
        }

        public Criteria andStu1In(List<String> values) {
            addCriterion("stu1 in", values, "stu1");
            return (Criteria) this;
        }

        public Criteria andStu1NotIn(List<String> values) {
            addCriterion("stu1 not in", values, "stu1");
            return (Criteria) this;
        }

        public Criteria andStu1Between(String value1, String value2) {
            addCriterion("stu1 between", value1, value2, "stu1");
            return (Criteria) this;
        }

        public Criteria andStu1NotBetween(String value1, String value2) {
            addCriterion("stu1 not between", value1, value2, "stu1");
            return (Criteria) this;
        }

        public Criteria andTorankIsNull() {
            addCriterion("torank is null");
            return (Criteria) this;
        }

        public Criteria andTorankIsNotNull() {
            addCriterion("torank is not null");
            return (Criteria) this;
        }

        public Criteria andTorankEqualTo(String value) {
            addCriterion("torank =", value, "torank");
            return (Criteria) this;
        }

        public Criteria andTorankNotEqualTo(String value) {
            addCriterion("torank <>", value, "torank");
            return (Criteria) this;
        }

        public Criteria andTorankGreaterThan(String value) {
            addCriterion("torank >", value, "torank");
            return (Criteria) this;
        }

        public Criteria andTorankGreaterThanOrEqualTo(String value) {
            addCriterion("torank >=", value, "torank");
            return (Criteria) this;
        }

        public Criteria andTorankLessThan(String value) {
            addCriterion("torank <", value, "torank");
            return (Criteria) this;
        }

        public Criteria andTorankLessThanOrEqualTo(String value) {
            addCriterion("torank <=", value, "torank");
            return (Criteria) this;
        }

        public Criteria andTorankLike(String value) {
            addCriterion("torank like", value, "torank");
            return (Criteria) this;
        }

        public Criteria andTorankNotLike(String value) {
            addCriterion("torank not like", value, "torank");
            return (Criteria) this;
        }

        public Criteria andTorankIn(List<String> values) {
            addCriterion("torank in", values, "torank");
            return (Criteria) this;
        }

        public Criteria andTorankNotIn(List<String> values) {
            addCriterion("torank not in", values, "torank");
            return (Criteria) this;
        }

        public Criteria andTorankBetween(String value1, String value2) {
            addCriterion("torank between", value1, value2, "torank");
            return (Criteria) this;
        }

        public Criteria andTorankNotBetween(String value1, String value2) {
            addCriterion("torank not between", value1, value2, "torank");
            return (Criteria) this;
        }

        public Criteria andTostatusIsNull() {
            addCriterion("tostatus is null");
            return (Criteria) this;
        }

        public Criteria andTostatusIsNotNull() {
            addCriterion("tostatus is not null");
            return (Criteria) this;
        }

        public Criteria andTostatusEqualTo(Integer value) {
            addCriterion("tostatus =", value, "tostatus");
            return (Criteria) this;
        }

        public Criteria andTostatusNotEqualTo(Integer value) {
            addCriterion("tostatus <>", value, "tostatus");
            return (Criteria) this;
        }

        public Criteria andTostatusGreaterThan(Integer value) {
            addCriterion("tostatus >", value, "tostatus");
            return (Criteria) this;
        }

        public Criteria andTostatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tostatus >=", value, "tostatus");
            return (Criteria) this;
        }

        public Criteria andTostatusLessThan(Integer value) {
            addCriterion("tostatus <", value, "tostatus");
            return (Criteria) this;
        }

        public Criteria andTostatusLessThanOrEqualTo(Integer value) {
            addCriterion("tostatus <=", value, "tostatus");
            return (Criteria) this;
        }

        public Criteria andTostatusIn(List<Integer> values) {
            addCriterion("tostatus in", values, "tostatus");
            return (Criteria) this;
        }

        public Criteria andTostatusNotIn(List<Integer> values) {
            addCriterion("tostatus not in", values, "tostatus");
            return (Criteria) this;
        }

        public Criteria andTostatusBetween(Integer value1, Integer value2) {
            addCriterion("tostatus between", value1, value2, "tostatus");
            return (Criteria) this;
        }

        public Criteria andTostatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tostatus not between", value1, value2, "tostatus");
            return (Criteria) this;
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

        public Criteria andIsissueIsNull() {
            addCriterion("isissue is null");
            return (Criteria) this;
        }

        public Criteria andIsissueIsNotNull() {
            addCriterion("isissue is not null");
            return (Criteria) this;
        }

        public Criteria andIsissueEqualTo(Integer value) {
            addCriterion("isissue =", value, "isissue");
            return (Criteria) this;
        }

        public Criteria andIsissueNotEqualTo(Integer value) {
            addCriterion("isissue <>", value, "isissue");
            return (Criteria) this;
        }

        public Criteria andIsissueGreaterThan(Integer value) {
            addCriterion("isissue >", value, "isissue");
            return (Criteria) this;
        }

        public Criteria andIsissueGreaterThanOrEqualTo(Integer value) {
            addCriterion("isissue >=", value, "isissue");
            return (Criteria) this;
        }

        public Criteria andIsissueLessThan(Integer value) {
            addCriterion("isissue <", value, "isissue");
            return (Criteria) this;
        }

        public Criteria andIsissueLessThanOrEqualTo(Integer value) {
            addCriterion("isissue <=", value, "isissue");
            return (Criteria) this;
        }

        public Criteria andIsissueIn(List<Integer> values) {
            addCriterion("isissue in", values, "isissue");
            return (Criteria) this;
        }

        public Criteria andIsissueNotIn(List<Integer> values) {
            addCriterion("isissue not in", values, "isissue");
            return (Criteria) this;
        }

        public Criteria andIsissueBetween(Integer value1, Integer value2) {
            addCriterion("isissue between", value1, value2, "isissue");
            return (Criteria) this;
        }

        public Criteria andIsissueNotBetween(Integer value1, Integer value2) {
            addCriterion("isissue not between", value1, value2, "isissue");
            return (Criteria) this;
        }

        public Criteria andIschangeIsNull() {
            addCriterion("ischange is null");
            return (Criteria) this;
        }

        public Criteria andIschangeIsNotNull() {
            addCriterion("ischange is not null");
            return (Criteria) this;
        }

        public Criteria andIschangeEqualTo(Integer value) {
            addCriterion("ischange =", value, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeNotEqualTo(Integer value) {
            addCriterion("ischange <>", value, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeGreaterThan(Integer value) {
            addCriterion("ischange >", value, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ischange >=", value, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeLessThan(Integer value) {
            addCriterion("ischange <", value, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeLessThanOrEqualTo(Integer value) {
            addCriterion("ischange <=", value, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeIn(List<Integer> values) {
            addCriterion("ischange in", values, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeNotIn(List<Integer> values) {
            addCriterion("ischange not in", values, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeBetween(Integer value1, Integer value2) {
            addCriterion("ischange between", value1, value2, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeNotBetween(Integer value1, Integer value2) {
            addCriterion("ischange not between", value1, value2, "ischange");
            return (Criteria) this;
        }

        public Criteria andIsremoveIsNull() {
            addCriterion("isremove is null");
            return (Criteria) this;
        }

        public Criteria andIsremoveIsNotNull() {
            addCriterion("isremove is not null");
            return (Criteria) this;
        }

        public Criteria andIsremoveEqualTo(Integer value) {
            addCriterion("isremove =", value, "isremove");
            return (Criteria) this;
        }

        public Criteria andIsremoveNotEqualTo(Integer value) {
            addCriterion("isremove <>", value, "isremove");
            return (Criteria) this;
        }

        public Criteria andIsremoveGreaterThan(Integer value) {
            addCriterion("isremove >", value, "isremove");
            return (Criteria) this;
        }

        public Criteria andIsremoveGreaterThanOrEqualTo(Integer value) {
            addCriterion("isremove >=", value, "isremove");
            return (Criteria) this;
        }

        public Criteria andIsremoveLessThan(Integer value) {
            addCriterion("isremove <", value, "isremove");
            return (Criteria) this;
        }

        public Criteria andIsremoveLessThanOrEqualTo(Integer value) {
            addCriterion("isremove <=", value, "isremove");
            return (Criteria) this;
        }

        public Criteria andIsremoveIn(List<Integer> values) {
            addCriterion("isremove in", values, "isremove");
            return (Criteria) this;
        }

        public Criteria andIsremoveNotIn(List<Integer> values) {
            addCriterion("isremove not in", values, "isremove");
            return (Criteria) this;
        }

        public Criteria andIsremoveBetween(Integer value1, Integer value2) {
            addCriterion("isremove between", value1, value2, "isremove");
            return (Criteria) this;
        }

        public Criteria andIsremoveNotBetween(Integer value1, Integer value2) {
            addCriterion("isremove not between", value1, value2, "isremove");
            return (Criteria) this;
        }

        public Criteria andRemovestatusIsNull() {
            addCriterion("removestatus is null");
            return (Criteria) this;
        }

        public Criteria andRemovestatusIsNotNull() {
            addCriterion("removestatus is not null");
            return (Criteria) this;
        }

        public Criteria andRemovestatusEqualTo(Integer value) {
            addCriterion("removestatus =", value, "removestatus");
            return (Criteria) this;
        }

        public Criteria andRemovestatusNotEqualTo(Integer value) {
            addCriterion("removestatus <>", value, "removestatus");
            return (Criteria) this;
        }

        public Criteria andRemovestatusGreaterThan(Integer value) {
            addCriterion("removestatus >", value, "removestatus");
            return (Criteria) this;
        }

        public Criteria andRemovestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("removestatus >=", value, "removestatus");
            return (Criteria) this;
        }

        public Criteria andRemovestatusLessThan(Integer value) {
            addCriterion("removestatus <", value, "removestatus");
            return (Criteria) this;
        }

        public Criteria andRemovestatusLessThanOrEqualTo(Integer value) {
            addCriterion("removestatus <=", value, "removestatus");
            return (Criteria) this;
        }

        public Criteria andRemovestatusIn(List<Integer> values) {
            addCriterion("removestatus in", values, "removestatus");
            return (Criteria) this;
        }

        public Criteria andRemovestatusNotIn(List<Integer> values) {
            addCriterion("removestatus not in", values, "removestatus");
            return (Criteria) this;
        }

        public Criteria andRemovestatusBetween(Integer value1, Integer value2) {
            addCriterion("removestatus between", value1, value2, "removestatus");
            return (Criteria) this;
        }

        public Criteria andRemovestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("removestatus not between", value1, value2, "removestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusIsNull() {
            addCriterion("changestatus is null");
            return (Criteria) this;
        }

        public Criteria andChangestatusIsNotNull() {
            addCriterion("changestatus is not null");
            return (Criteria) this;
        }

        public Criteria andChangestatusEqualTo(Integer value) {
            addCriterion("changestatus =", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusNotEqualTo(Integer value) {
            addCriterion("changestatus <>", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusGreaterThan(Integer value) {
            addCriterion("changestatus >", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("changestatus >=", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusLessThan(Integer value) {
            addCriterion("changestatus <", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusLessThanOrEqualTo(Integer value) {
            addCriterion("changestatus <=", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusIn(List<Integer> values) {
            addCriterion("changestatus in", values, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusNotIn(List<Integer> values) {
            addCriterion("changestatus not in", values, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusBetween(Integer value1, Integer value2) {
            addCriterion("changestatus between", value1, value2, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("changestatus not between", value1, value2, "changestatus");
            return (Criteria) this;
        }

        public Criteria andFirsttermIsNull() {
            addCriterion("firstterm is null");
            return (Criteria) this;
        }

        public Criteria andFirsttermIsNotNull() {
            addCriterion("firstterm is not null");
            return (Criteria) this;
        }

        public Criteria andFirsttermEqualTo(String value) {
            addCriterion("firstterm =", value, "firstterm");
            return (Criteria) this;
        }

        public Criteria andFirsttermNotEqualTo(String value) {
            addCriterion("firstterm <>", value, "firstterm");
            return (Criteria) this;
        }

        public Criteria andFirsttermGreaterThan(String value) {
            addCriterion("firstterm >", value, "firstterm");
            return (Criteria) this;
        }

        public Criteria andFirsttermGreaterThanOrEqualTo(String value) {
            addCriterion("firstterm >=", value, "firstterm");
            return (Criteria) this;
        }

        public Criteria andFirsttermLessThan(String value) {
            addCriterion("firstterm <", value, "firstterm");
            return (Criteria) this;
        }

        public Criteria andFirsttermLessThanOrEqualTo(String value) {
            addCriterion("firstterm <=", value, "firstterm");
            return (Criteria) this;
        }

        public Criteria andFirsttermLike(String value) {
            addCriterion("firstterm like", value, "firstterm");
            return (Criteria) this;
        }

        public Criteria andFirsttermNotLike(String value) {
            addCriterion("firstterm not like", value, "firstterm");
            return (Criteria) this;
        }

        public Criteria andFirsttermIn(List<String> values) {
            addCriterion("firstterm in", values, "firstterm");
            return (Criteria) this;
        }

        public Criteria andFirsttermNotIn(List<String> values) {
            addCriterion("firstterm not in", values, "firstterm");
            return (Criteria) this;
        }

        public Criteria andFirsttermBetween(String value1, String value2) {
            addCriterion("firstterm between", value1, value2, "firstterm");
            return (Criteria) this;
        }

        public Criteria andFirsttermNotBetween(String value1, String value2) {
            addCriterion("firstterm not between", value1, value2, "firstterm");
            return (Criteria) this;
        }

        public Criteria andSecondtermIsNull() {
            addCriterion("secondterm is null");
            return (Criteria) this;
        }

        public Criteria andSecondtermIsNotNull() {
            addCriterion("secondterm is not null");
            return (Criteria) this;
        }

        public Criteria andSecondtermEqualTo(String value) {
            addCriterion("secondterm =", value, "secondterm");
            return (Criteria) this;
        }

        public Criteria andSecondtermNotEqualTo(String value) {
            addCriterion("secondterm <>", value, "secondterm");
            return (Criteria) this;
        }

        public Criteria andSecondtermGreaterThan(String value) {
            addCriterion("secondterm >", value, "secondterm");
            return (Criteria) this;
        }

        public Criteria andSecondtermGreaterThanOrEqualTo(String value) {
            addCriterion("secondterm >=", value, "secondterm");
            return (Criteria) this;
        }

        public Criteria andSecondtermLessThan(String value) {
            addCriterion("secondterm <", value, "secondterm");
            return (Criteria) this;
        }

        public Criteria andSecondtermLessThanOrEqualTo(String value) {
            addCriterion("secondterm <=", value, "secondterm");
            return (Criteria) this;
        }

        public Criteria andSecondtermLike(String value) {
            addCriterion("secondterm like", value, "secondterm");
            return (Criteria) this;
        }

        public Criteria andSecondtermNotLike(String value) {
            addCriterion("secondterm not like", value, "secondterm");
            return (Criteria) this;
        }

        public Criteria andSecondtermIn(List<String> values) {
            addCriterion("secondterm in", values, "secondterm");
            return (Criteria) this;
        }

        public Criteria andSecondtermNotIn(List<String> values) {
            addCriterion("secondterm not in", values, "secondterm");
            return (Criteria) this;
        }

        public Criteria andSecondtermBetween(String value1, String value2) {
            addCriterion("secondterm between", value1, value2, "secondterm");
            return (Criteria) this;
        }

        public Criteria andSecondtermNotBetween(String value1, String value2) {
            addCriterion("secondterm not between", value1, value2, "secondterm");
            return (Criteria) this;
        }

        public Criteria andEndtermIsNull() {
            addCriterion("endterm is null");
            return (Criteria) this;
        }

        public Criteria andEndtermIsNotNull() {
            addCriterion("endterm is not null");
            return (Criteria) this;
        }

        public Criteria andEndtermEqualTo(String value) {
            addCriterion("endterm =", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermNotEqualTo(String value) {
            addCriterion("endterm <>", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermGreaterThan(String value) {
            addCriterion("endterm >", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermGreaterThanOrEqualTo(String value) {
            addCriterion("endterm >=", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermLessThan(String value) {
            addCriterion("endterm <", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermLessThanOrEqualTo(String value) {
            addCriterion("endterm <=", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermLike(String value) {
            addCriterion("endterm like", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermNotLike(String value) {
            addCriterion("endterm not like", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermIn(List<String> values) {
            addCriterion("endterm in", values, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermNotIn(List<String> values) {
            addCriterion("endterm not in", values, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermBetween(String value1, String value2) {
            addCriterion("endterm between", value1, value2, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermNotBetween(String value1, String value2) {
            addCriterion("endterm not between", value1, value2, "endterm");
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