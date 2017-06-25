package com.nun.wjq.project.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTacademyIsNull() {
            addCriterion("tacademy is null");
            return (Criteria) this;
        }

        public Criteria andTacademyIsNotNull() {
            addCriterion("tacademy is not null");
            return (Criteria) this;
        }

        public Criteria andTacademyEqualTo(String value) {
            addCriterion("tacademy =", value, "tacademy");
            return (Criteria) this;
        }

        public Criteria andTacademyNotEqualTo(String value) {
            addCriterion("tacademy <>", value, "tacademy");
            return (Criteria) this;
        }

        public Criteria andTacademyGreaterThan(String value) {
            addCriterion("tacademy >", value, "tacademy");
            return (Criteria) this;
        }

        public Criteria andTacademyGreaterThanOrEqualTo(String value) {
            addCriterion("tacademy >=", value, "tacademy");
            return (Criteria) this;
        }

        public Criteria andTacademyLessThan(String value) {
            addCriterion("tacademy <", value, "tacademy");
            return (Criteria) this;
        }

        public Criteria andTacademyLessThanOrEqualTo(String value) {
            addCriterion("tacademy <=", value, "tacademy");
            return (Criteria) this;
        }

        public Criteria andTacademyLike(String value) {
            addCriterion("tacademy like", value, "tacademy");
            return (Criteria) this;
        }

        public Criteria andTacademyNotLike(String value) {
            addCriterion("tacademy not like", value, "tacademy");
            return (Criteria) this;
        }

        public Criteria andTacademyIn(List<String> values) {
            addCriterion("tacademy in", values, "tacademy");
            return (Criteria) this;
        }

        public Criteria andTacademyNotIn(List<String> values) {
            addCriterion("tacademy not in", values, "tacademy");
            return (Criteria) this;
        }

        public Criteria andTacademyBetween(String value1, String value2) {
            addCriterion("tacademy between", value1, value2, "tacademy");
            return (Criteria) this;
        }

        public Criteria andTacademyNotBetween(String value1, String value2) {
            addCriterion("tacademy not between", value1, value2, "tacademy");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTnumberIsNull() {
            addCriterion("tnumber is null");
            return (Criteria) this;
        }

        public Criteria andTnumberIsNotNull() {
            addCriterion("tnumber is not null");
            return (Criteria) this;
        }

        public Criteria andTnumberEqualTo(String value) {
            addCriterion("tnumber =", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberNotEqualTo(String value) {
            addCriterion("tnumber <>", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberGreaterThan(String value) {
            addCriterion("tnumber >", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberGreaterThanOrEqualTo(String value) {
            addCriterion("tnumber >=", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberLessThan(String value) {
            addCriterion("tnumber <", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberLessThanOrEqualTo(String value) {
            addCriterion("tnumber <=", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberLike(String value) {
            addCriterion("tnumber like", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberNotLike(String value) {
            addCriterion("tnumber not like", value, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberIn(List<String> values) {
            addCriterion("tnumber in", values, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberNotIn(List<String> values) {
            addCriterion("tnumber not in", values, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberBetween(String value1, String value2) {
            addCriterion("tnumber between", value1, value2, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTnumberNotBetween(String value1, String value2) {
            addCriterion("tnumber not between", value1, value2, "tnumber");
            return (Criteria) this;
        }

        public Criteria andTpasswordIsNull() {
            addCriterion("tpassword is null");
            return (Criteria) this;
        }

        public Criteria andTpasswordIsNotNull() {
            addCriterion("tpassword is not null");
            return (Criteria) this;
        }

        public Criteria andTpasswordEqualTo(String value) {
            addCriterion("tpassword =", value, "tpassword");
            return (Criteria) this;
        }

        public Criteria andTpasswordNotEqualTo(String value) {
            addCriterion("tpassword <>", value, "tpassword");
            return (Criteria) this;
        }

        public Criteria andTpasswordGreaterThan(String value) {
            addCriterion("tpassword >", value, "tpassword");
            return (Criteria) this;
        }

        public Criteria andTpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("tpassword >=", value, "tpassword");
            return (Criteria) this;
        }

        public Criteria andTpasswordLessThan(String value) {
            addCriterion("tpassword <", value, "tpassword");
            return (Criteria) this;
        }

        public Criteria andTpasswordLessThanOrEqualTo(String value) {
            addCriterion("tpassword <=", value, "tpassword");
            return (Criteria) this;
        }

        public Criteria andTpasswordLike(String value) {
            addCriterion("tpassword like", value, "tpassword");
            return (Criteria) this;
        }

        public Criteria andTpasswordNotLike(String value) {
            addCriterion("tpassword not like", value, "tpassword");
            return (Criteria) this;
        }

        public Criteria andTpasswordIn(List<String> values) {
            addCriterion("tpassword in", values, "tpassword");
            return (Criteria) this;
        }

        public Criteria andTpasswordNotIn(List<String> values) {
            addCriterion("tpassword not in", values, "tpassword");
            return (Criteria) this;
        }

        public Criteria andTpasswordBetween(String value1, String value2) {
            addCriterion("tpassword between", value1, value2, "tpassword");
            return (Criteria) this;
        }

        public Criteria andTpasswordNotBetween(String value1, String value2) {
            addCriterion("tpassword not between", value1, value2, "tpassword");
            return (Criteria) this;
        }

        public Criteria andTphoneIsNull() {
            addCriterion("tphone is null");
            return (Criteria) this;
        }

        public Criteria andTphoneIsNotNull() {
            addCriterion("tphone is not null");
            return (Criteria) this;
        }

        public Criteria andTphoneEqualTo(String value) {
            addCriterion("tphone =", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotEqualTo(String value) {
            addCriterion("tphone <>", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneGreaterThan(String value) {
            addCriterion("tphone >", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneGreaterThanOrEqualTo(String value) {
            addCriterion("tphone >=", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneLessThan(String value) {
            addCriterion("tphone <", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneLessThanOrEqualTo(String value) {
            addCriterion("tphone <=", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneLike(String value) {
            addCriterion("tphone like", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotLike(String value) {
            addCriterion("tphone not like", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneIn(List<String> values) {
            addCriterion("tphone in", values, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotIn(List<String> values) {
            addCriterion("tphone not in", values, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneBetween(String value1, String value2) {
            addCriterion("tphone between", value1, value2, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotBetween(String value1, String value2) {
            addCriterion("tphone not between", value1, value2, "tphone");
            return (Criteria) this;
        }

        public Criteria andTemailIsNull() {
            addCriterion("temail is null");
            return (Criteria) this;
        }

        public Criteria andTemailIsNotNull() {
            addCriterion("temail is not null");
            return (Criteria) this;
        }

        public Criteria andTemailEqualTo(String value) {
            addCriterion("temail =", value, "temail");
            return (Criteria) this;
        }

        public Criteria andTemailNotEqualTo(String value) {
            addCriterion("temail <>", value, "temail");
            return (Criteria) this;
        }

        public Criteria andTemailGreaterThan(String value) {
            addCriterion("temail >", value, "temail");
            return (Criteria) this;
        }

        public Criteria andTemailGreaterThanOrEqualTo(String value) {
            addCriterion("temail >=", value, "temail");
            return (Criteria) this;
        }

        public Criteria andTemailLessThan(String value) {
            addCriterion("temail <", value, "temail");
            return (Criteria) this;
        }

        public Criteria andTemailLessThanOrEqualTo(String value) {
            addCriterion("temail <=", value, "temail");
            return (Criteria) this;
        }

        public Criteria andTemailLike(String value) {
            addCriterion("temail like", value, "temail");
            return (Criteria) this;
        }

        public Criteria andTemailNotLike(String value) {
            addCriterion("temail not like", value, "temail");
            return (Criteria) this;
        }

        public Criteria andTemailIn(List<String> values) {
            addCriterion("temail in", values, "temail");
            return (Criteria) this;
        }

        public Criteria andTemailNotIn(List<String> values) {
            addCriterion("temail not in", values, "temail");
            return (Criteria) this;
        }

        public Criteria andTemailBetween(String value1, String value2) {
            addCriterion("temail between", value1, value2, "temail");
            return (Criteria) this;
        }

        public Criteria andTemailNotBetween(String value1, String value2) {
            addCriterion("temail not between", value1, value2, "temail");
            return (Criteria) this;
        }

        public Criteria andTageIsNull() {
            addCriterion("tage is null");
            return (Criteria) this;
        }

        public Criteria andTageIsNotNull() {
            addCriterion("tage is not null");
            return (Criteria) this;
        }

        public Criteria andTageEqualTo(Integer value) {
            addCriterion("tage =", value, "tage");
            return (Criteria) this;
        }

        public Criteria andTageNotEqualTo(Integer value) {
            addCriterion("tage <>", value, "tage");
            return (Criteria) this;
        }

        public Criteria andTageGreaterThan(Integer value) {
            addCriterion("tage >", value, "tage");
            return (Criteria) this;
        }

        public Criteria andTageGreaterThanOrEqualTo(Integer value) {
            addCriterion("tage >=", value, "tage");
            return (Criteria) this;
        }

        public Criteria andTageLessThan(Integer value) {
            addCriterion("tage <", value, "tage");
            return (Criteria) this;
        }

        public Criteria andTageLessThanOrEqualTo(Integer value) {
            addCriterion("tage <=", value, "tage");
            return (Criteria) this;
        }

        public Criteria andTageIn(List<Integer> values) {
            addCriterion("tage in", values, "tage");
            return (Criteria) this;
        }

        public Criteria andTageNotIn(List<Integer> values) {
            addCriterion("tage not in", values, "tage");
            return (Criteria) this;
        }

        public Criteria andTageBetween(Integer value1, Integer value2) {
            addCriterion("tage between", value1, value2, "tage");
            return (Criteria) this;
        }

        public Criteria andTageNotBetween(Integer value1, Integer value2) {
            addCriterion("tage not between", value1, value2, "tage");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNull() {
            addCriterion("bankcard is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNotNull() {
            addCriterion("bankcard is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardEqualTo(String value) {
            addCriterion("bankcard =", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotEqualTo(String value) {
            addCriterion("bankcard <>", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThan(String value) {
            addCriterion("bankcard >", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard >=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThan(String value) {
            addCriterion("bankcard <", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThanOrEqualTo(String value) {
            addCriterion("bankcard <=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLike(String value) {
            addCriterion("bankcard like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotLike(String value) {
            addCriterion("bankcard not like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardIn(List<String> values) {
            addCriterion("bankcard in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotIn(List<String> values) {
            addCriterion("bankcard not in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardBetween(String value1, String value2) {
            addCriterion("bankcard between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotBetween(String value1, String value2) {
            addCriterion("bankcard not between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andPtitleIsNull() {
            addCriterion("ptitle is null");
            return (Criteria) this;
        }

        public Criteria andPtitleIsNotNull() {
            addCriterion("ptitle is not null");
            return (Criteria) this;
        }

        public Criteria andPtitleEqualTo(String value) {
            addCriterion("ptitle =", value, "ptitle");
            return (Criteria) this;
        }

        public Criteria andPtitleNotEqualTo(String value) {
            addCriterion("ptitle <>", value, "ptitle");
            return (Criteria) this;
        }

        public Criteria andPtitleGreaterThan(String value) {
            addCriterion("ptitle >", value, "ptitle");
            return (Criteria) this;
        }

        public Criteria andPtitleGreaterThanOrEqualTo(String value) {
            addCriterion("ptitle >=", value, "ptitle");
            return (Criteria) this;
        }

        public Criteria andPtitleLessThan(String value) {
            addCriterion("ptitle <", value, "ptitle");
            return (Criteria) this;
        }

        public Criteria andPtitleLessThanOrEqualTo(String value) {
            addCriterion("ptitle <=", value, "ptitle");
            return (Criteria) this;
        }

        public Criteria andPtitleLike(String value) {
            addCriterion("ptitle like", value, "ptitle");
            return (Criteria) this;
        }

        public Criteria andPtitleNotLike(String value) {
            addCriterion("ptitle not like", value, "ptitle");
            return (Criteria) this;
        }

        public Criteria andPtitleIn(List<String> values) {
            addCriterion("ptitle in", values, "ptitle");
            return (Criteria) this;
        }

        public Criteria andPtitleNotIn(List<String> values) {
            addCriterion("ptitle not in", values, "ptitle");
            return (Criteria) this;
        }

        public Criteria andPtitleBetween(String value1, String value2) {
            addCriterion("ptitle between", value1, value2, "ptitle");
            return (Criteria) this;
        }

        public Criteria andPtitleNotBetween(String value1, String value2) {
            addCriterion("ptitle not between", value1, value2, "ptitle");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
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