package com.f22pkj31.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeadcampusRouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeadcampusRouteExample() {
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

        public Criteria andRouteIdIsNull() {
            addCriterion("route_id is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("route_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(Integer value) {
            addCriterion("route_id =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(Integer value) {
            addCriterion("route_id <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(Integer value) {
            addCriterion("route_id >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("route_id >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(Integer value) {
            addCriterion("route_id <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(Integer value) {
            addCriterion("route_id <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<Integer> values) {
            addCriterion("route_id in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<Integer> values) {
            addCriterion("route_id not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(Integer value1, Integer value2) {
            addCriterion("route_id between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("route_id not between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteNameIsNull() {
            addCriterion("route_name is null");
            return (Criteria) this;
        }

        public Criteria andRouteNameIsNotNull() {
            addCriterion("route_name is not null");
            return (Criteria) this;
        }

        public Criteria andRouteNameEqualTo(String value) {
            addCriterion("route_name =", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotEqualTo(String value) {
            addCriterion("route_name <>", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThan(String value) {
            addCriterion("route_name >", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThanOrEqualTo(String value) {
            addCriterion("route_name >=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThan(String value) {
            addCriterion("route_name <", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThanOrEqualTo(String value) {
            addCriterion("route_name <=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLike(String value) {
            addCriterion("route_name like", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotLike(String value) {
            addCriterion("route_name not like", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameIn(List<String> values) {
            addCriterion("route_name in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotIn(List<String> values) {
            addCriterion("route_name not in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameBetween(String value1, String value2) {
            addCriterion("route_name between", value1, value2, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotBetween(String value1, String value2) {
            addCriterion("route_name not between", value1, value2, "routeName");
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

        public Criteria andRouteArrayIsNull() {
            addCriterion("route_array is null");
            return (Criteria) this;
        }

        public Criteria andRouteArrayIsNotNull() {
            addCriterion("route_array is not null");
            return (Criteria) this;
        }

        public Criteria andRouteArrayEqualTo(String value) {
            addCriterion("route_array =", value, "routeArray");
            return (Criteria) this;
        }

        public Criteria andRouteArrayNotEqualTo(String value) {
            addCriterion("route_array <>", value, "routeArray");
            return (Criteria) this;
        }

        public Criteria andRouteArrayGreaterThan(String value) {
            addCriterion("route_array >", value, "routeArray");
            return (Criteria) this;
        }

        public Criteria andRouteArrayGreaterThanOrEqualTo(String value) {
            addCriterion("route_array >=", value, "routeArray");
            return (Criteria) this;
        }

        public Criteria andRouteArrayLessThan(String value) {
            addCriterion("route_array <", value, "routeArray");
            return (Criteria) this;
        }

        public Criteria andRouteArrayLessThanOrEqualTo(String value) {
            addCriterion("route_array <=", value, "routeArray");
            return (Criteria) this;
        }

        public Criteria andRouteArrayLike(String value) {
            addCriterion("route_array like", value, "routeArray");
            return (Criteria) this;
        }

        public Criteria andRouteArrayNotLike(String value) {
            addCriterion("route_array not like", value, "routeArray");
            return (Criteria) this;
        }

        public Criteria andRouteArrayIn(List<String> values) {
            addCriterion("route_array in", values, "routeArray");
            return (Criteria) this;
        }

        public Criteria andRouteArrayNotIn(List<String> values) {
            addCriterion("route_array not in", values, "routeArray");
            return (Criteria) this;
        }

        public Criteria andRouteArrayBetween(String value1, String value2) {
            addCriterion("route_array between", value1, value2, "routeArray");
            return (Criteria) this;
        }

        public Criteria andRouteArrayNotBetween(String value1, String value2) {
            addCriterion("route_array not between", value1, value2, "routeArray");
            return (Criteria) this;
        }

        public Criteria andRouteUploadTimeIsNull() {
            addCriterion("route_upload_time is null");
            return (Criteria) this;
        }

        public Criteria andRouteUploadTimeIsNotNull() {
            addCriterion("route_upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andRouteUploadTimeEqualTo(Date value) {
            addCriterion("route_upload_time =", value, "routeUploadTime");
            return (Criteria) this;
        }

        public Criteria andRouteUploadTimeNotEqualTo(Date value) {
            addCriterion("route_upload_time <>", value, "routeUploadTime");
            return (Criteria) this;
        }

        public Criteria andRouteUploadTimeGreaterThan(Date value) {
            addCriterion("route_upload_time >", value, "routeUploadTime");
            return (Criteria) this;
        }

        public Criteria andRouteUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("route_upload_time >=", value, "routeUploadTime");
            return (Criteria) this;
        }

        public Criteria andRouteUploadTimeLessThan(Date value) {
            addCriterion("route_upload_time <", value, "routeUploadTime");
            return (Criteria) this;
        }

        public Criteria andRouteUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("route_upload_time <=", value, "routeUploadTime");
            return (Criteria) this;
        }

        public Criteria andRouteUploadTimeIn(List<Date> values) {
            addCriterion("route_upload_time in", values, "routeUploadTime");
            return (Criteria) this;
        }

        public Criteria andRouteUploadTimeNotIn(List<Date> values) {
            addCriterion("route_upload_time not in", values, "routeUploadTime");
            return (Criteria) this;
        }

        public Criteria andRouteUploadTimeBetween(Date value1, Date value2) {
            addCriterion("route_upload_time between", value1, value2, "routeUploadTime");
            return (Criteria) this;
        }

        public Criteria andRouteUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("route_upload_time not between", value1, value2, "routeUploadTime");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointIsNull() {
            addCriterion("route_center_point is null");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointIsNotNull() {
            addCriterion("route_center_point is not null");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointEqualTo(String value) {
            addCriterion("route_center_point =", value, "routeCenterPoint");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointNotEqualTo(String value) {
            addCriterion("route_center_point <>", value, "routeCenterPoint");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointGreaterThan(String value) {
            addCriterion("route_center_point >", value, "routeCenterPoint");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointGreaterThanOrEqualTo(String value) {
            addCriterion("route_center_point >=", value, "routeCenterPoint");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointLessThan(String value) {
            addCriterion("route_center_point <", value, "routeCenterPoint");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointLessThanOrEqualTo(String value) {
            addCriterion("route_center_point <=", value, "routeCenterPoint");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointLike(String value) {
            addCriterion("route_center_point like", value, "routeCenterPoint");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointNotLike(String value) {
            addCriterion("route_center_point not like", value, "routeCenterPoint");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointIn(List<String> values) {
            addCriterion("route_center_point in", values, "routeCenterPoint");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointNotIn(List<String> values) {
            addCriterion("route_center_point not in", values, "routeCenterPoint");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointBetween(String value1, String value2) {
            addCriterion("route_center_point between", value1, value2, "routeCenterPoint");
            return (Criteria) this;
        }

        public Criteria andRouteCenterPointNotBetween(String value1, String value2) {
            addCriterion("route_center_point not between", value1, value2, "routeCenterPoint");
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