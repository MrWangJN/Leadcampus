package com.f22pkj31.bean;

import java.util.ArrayList;
import java.util.List;

public class LeadcampusSchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeadcampusSchoolExample() {
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

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNull() {
            addCriterion("school_name is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("school_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("school_name =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("school_name <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("school_name >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("school_name >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("school_name <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("school_name <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("school_name like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("school_name not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("school_name in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("school_name not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("school_name between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("school_name not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinIsNull() {
            addCriterion("school_pinyin is null");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinIsNotNull() {
            addCriterion("school_pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinEqualTo(String value) {
            addCriterion("school_pinyin =", value, "schoolPinyin");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinNotEqualTo(String value) {
            addCriterion("school_pinyin <>", value, "schoolPinyin");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinGreaterThan(String value) {
            addCriterion("school_pinyin >", value, "schoolPinyin");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("school_pinyin >=", value, "schoolPinyin");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinLessThan(String value) {
            addCriterion("school_pinyin <", value, "schoolPinyin");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinLessThanOrEqualTo(String value) {
            addCriterion("school_pinyin <=", value, "schoolPinyin");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinLike(String value) {
            addCriterion("school_pinyin like", value, "schoolPinyin");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinNotLike(String value) {
            addCriterion("school_pinyin not like", value, "schoolPinyin");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinIn(List<String> values) {
            addCriterion("school_pinyin in", values, "schoolPinyin");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinNotIn(List<String> values) {
            addCriterion("school_pinyin not in", values, "schoolPinyin");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinBetween(String value1, String value2) {
            addCriterion("school_pinyin between", value1, value2, "schoolPinyin");
            return (Criteria) this;
        }

        public Criteria andSchoolPinyinNotBetween(String value1, String value2) {
            addCriterion("school_pinyin not between", value1, value2, "schoolPinyin");
            return (Criteria) this;
        }

        public Criteria andIsserviceIsNull() {
            addCriterion("isservice is null");
            return (Criteria) this;
        }

        public Criteria andIsserviceIsNotNull() {
            addCriterion("isservice is not null");
            return (Criteria) this;
        }

        public Criteria andIsserviceEqualTo(Integer value) {
            addCriterion("isservice =", value, "isservice");
            return (Criteria) this;
        }

        public Criteria andIsserviceNotEqualTo(Integer value) {
            addCriterion("isservice <>", value, "isservice");
            return (Criteria) this;
        }

        public Criteria andIsserviceGreaterThan(Integer value) {
            addCriterion("isservice >", value, "isservice");
            return (Criteria) this;
        }

        public Criteria andIsserviceGreaterThanOrEqualTo(Integer value) {
            addCriterion("isservice >=", value, "isservice");
            return (Criteria) this;
        }

        public Criteria andIsserviceLessThan(Integer value) {
            addCriterion("isservice <", value, "isservice");
            return (Criteria) this;
        }

        public Criteria andIsserviceLessThanOrEqualTo(Integer value) {
            addCriterion("isservice <=", value, "isservice");
            return (Criteria) this;
        }

        public Criteria andIsserviceIn(List<Integer> values) {
            addCriterion("isservice in", values, "isservice");
            return (Criteria) this;
        }

        public Criteria andIsserviceNotIn(List<Integer> values) {
            addCriterion("isservice not in", values, "isservice");
            return (Criteria) this;
        }

        public Criteria andIsserviceBetween(Integer value1, Integer value2) {
            addCriterion("isservice between", value1, value2, "isservice");
            return (Criteria) this;
        }

        public Criteria andIsserviceNotBetween(Integer value1, Integer value2) {
            addCriterion("isservice not between", value1, value2, "isservice");
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