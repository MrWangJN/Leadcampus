package com.f22pkj31.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeadcampusRunningRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeadcampusRunningRecordExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNull() {
            addCriterion("studentId is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Integer value) {
            addCriterion("studentId =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Integer value) {
            addCriterion("studentId <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Integer value) {
            addCriterion("studentId >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentId >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Integer value) {
            addCriterion("studentId <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Integer value) {
            addCriterion("studentId <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Integer> values) {
            addCriterion("studentId in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Integer> values) {
            addCriterion("studentId not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Integer value1, Integer value2) {
            addCriterion("studentId between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentId not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andLocationArrayIsNull() {
            addCriterion("location_array is null");
            return (Criteria) this;
        }

        public Criteria andLocationArrayIsNotNull() {
            addCriterion("location_array is not null");
            return (Criteria) this;
        }

        public Criteria andLocationArrayEqualTo(String value) {
            addCriterion("location_array =", value, "locationArray");
            return (Criteria) this;
        }

        public Criteria andLocationArrayNotEqualTo(String value) {
            addCriterion("location_array <>", value, "locationArray");
            return (Criteria) this;
        }

        public Criteria andLocationArrayGreaterThan(String value) {
            addCriterion("location_array >", value, "locationArray");
            return (Criteria) this;
        }

        public Criteria andLocationArrayGreaterThanOrEqualTo(String value) {
            addCriterion("location_array >=", value, "locationArray");
            return (Criteria) this;
        }

        public Criteria andLocationArrayLessThan(String value) {
            addCriterion("location_array <", value, "locationArray");
            return (Criteria) this;
        }

        public Criteria andLocationArrayLessThanOrEqualTo(String value) {
            addCriterion("location_array <=", value, "locationArray");
            return (Criteria) this;
        }

        public Criteria andLocationArrayLike(String value) {
            addCriterion("location_array like", value, "locationArray");
            return (Criteria) this;
        }

        public Criteria andLocationArrayNotLike(String value) {
            addCriterion("location_array not like", value, "locationArray");
            return (Criteria) this;
        }

        public Criteria andLocationArrayIn(List<String> values) {
            addCriterion("location_array in", values, "locationArray");
            return (Criteria) this;
        }

        public Criteria andLocationArrayNotIn(List<String> values) {
            addCriterion("location_array not in", values, "locationArray");
            return (Criteria) this;
        }

        public Criteria andLocationArrayBetween(String value1, String value2) {
            addCriterion("location_array between", value1, value2, "locationArray");
            return (Criteria) this;
        }

        public Criteria andLocationArrayNotBetween(String value1, String value2) {
            addCriterion("location_array not between", value1, value2, "locationArray");
            return (Criteria) this;
        }

        public Criteria andPaceIsNull() {
            addCriterion("pace is null");
            return (Criteria) this;
        }

        public Criteria andPaceIsNotNull() {
            addCriterion("pace is not null");
            return (Criteria) this;
        }

        public Criteria andPaceEqualTo(Double value) {
            addCriterion("pace =", value, "pace");
            return (Criteria) this;
        }

        public Criteria andPaceNotEqualTo(Double value) {
            addCriterion("pace <>", value, "pace");
            return (Criteria) this;
        }

        public Criteria andPaceGreaterThan(Double value) {
            addCriterion("pace >", value, "pace");
            return (Criteria) this;
        }

        public Criteria andPaceGreaterThanOrEqualTo(Double value) {
            addCriterion("pace >=", value, "pace");
            return (Criteria) this;
        }

        public Criteria andPaceLessThan(Double value) {
            addCriterion("pace <", value, "pace");
            return (Criteria) this;
        }

        public Criteria andPaceLessThanOrEqualTo(Double value) {
            addCriterion("pace <=", value, "pace");
            return (Criteria) this;
        }

        public Criteria andPaceIn(List<Double> values) {
            addCriterion("pace in", values, "pace");
            return (Criteria) this;
        }

        public Criteria andPaceNotIn(List<Double> values) {
            addCriterion("pace not in", values, "pace");
            return (Criteria) this;
        }

        public Criteria andPaceBetween(Double value1, Double value2) {
            addCriterion("pace between", value1, value2, "pace");
            return (Criteria) this;
        }

        public Criteria andPaceNotBetween(Double value1, Double value2) {
            addCriterion("pace not between", value1, value2, "pace");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNull() {
            addCriterion("use_time is null");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNotNull() {
            addCriterion("use_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseTimeEqualTo(Integer value) {
            addCriterion("use_time =", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotEqualTo(Integer value) {
            addCriterion("use_time <>", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThan(Integer value) {
            addCriterion("use_time >", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_time >=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThan(Integer value) {
            addCriterion("use_time <", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("use_time <=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeIn(List<Integer> values) {
            addCriterion("use_time in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotIn(List<Integer> values) {
            addCriterion("use_time not in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeBetween(Integer value1, Integer value2) {
            addCriterion("use_time between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("use_time not between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andColorArrayIsNull() {
            addCriterion("color_array is null");
            return (Criteria) this;
        }

        public Criteria andColorArrayIsNotNull() {
            addCriterion("color_array is not null");
            return (Criteria) this;
        }

        public Criteria andColorArrayEqualTo(String value) {
            addCriterion("color_array =", value, "colorArray");
            return (Criteria) this;
        }

        public Criteria andColorArrayNotEqualTo(String value) {
            addCriterion("color_array <>", value, "colorArray");
            return (Criteria) this;
        }

        public Criteria andColorArrayGreaterThan(String value) {
            addCriterion("color_array >", value, "colorArray");
            return (Criteria) this;
        }

        public Criteria andColorArrayGreaterThanOrEqualTo(String value) {
            addCriterion("color_array >=", value, "colorArray");
            return (Criteria) this;
        }

        public Criteria andColorArrayLessThan(String value) {
            addCriterion("color_array <", value, "colorArray");
            return (Criteria) this;
        }

        public Criteria andColorArrayLessThanOrEqualTo(String value) {
            addCriterion("color_array <=", value, "colorArray");
            return (Criteria) this;
        }

        public Criteria andColorArrayLike(String value) {
            addCriterion("color_array like", value, "colorArray");
            return (Criteria) this;
        }

        public Criteria andColorArrayNotLike(String value) {
            addCriterion("color_array not like", value, "colorArray");
            return (Criteria) this;
        }

        public Criteria andColorArrayIn(List<String> values) {
            addCriterion("color_array in", values, "colorArray");
            return (Criteria) this;
        }

        public Criteria andColorArrayNotIn(List<String> values) {
            addCriterion("color_array not in", values, "colorArray");
            return (Criteria) this;
        }

        public Criteria andColorArrayBetween(String value1, String value2) {
            addCriterion("color_array between", value1, value2, "colorArray");
            return (Criteria) this;
        }

        public Criteria andColorArrayNotBetween(String value1, String value2) {
            addCriterion("color_array not between", value1, value2, "colorArray");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(Double value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Double value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Double value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Double value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Double value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Double> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Double> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Double value1, Double value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Double value1, Double value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andIndexArrayIsNull() {
            addCriterion("index_array is null");
            return (Criteria) this;
        }

        public Criteria andIndexArrayIsNotNull() {
            addCriterion("index_array is not null");
            return (Criteria) this;
        }

        public Criteria andIndexArrayEqualTo(String value) {
            addCriterion("index_array =", value, "indexArray");
            return (Criteria) this;
        }

        public Criteria andIndexArrayNotEqualTo(String value) {
            addCriterion("index_array <>", value, "indexArray");
            return (Criteria) this;
        }

        public Criteria andIndexArrayGreaterThan(String value) {
            addCriterion("index_array >", value, "indexArray");
            return (Criteria) this;
        }

        public Criteria andIndexArrayGreaterThanOrEqualTo(String value) {
            addCriterion("index_array >=", value, "indexArray");
            return (Criteria) this;
        }

        public Criteria andIndexArrayLessThan(String value) {
            addCriterion("index_array <", value, "indexArray");
            return (Criteria) this;
        }

        public Criteria andIndexArrayLessThanOrEqualTo(String value) {
            addCriterion("index_array <=", value, "indexArray");
            return (Criteria) this;
        }

        public Criteria andIndexArrayLike(String value) {
            addCriterion("index_array like", value, "indexArray");
            return (Criteria) this;
        }

        public Criteria andIndexArrayNotLike(String value) {
            addCriterion("index_array not like", value, "indexArray");
            return (Criteria) this;
        }

        public Criteria andIndexArrayIn(List<String> values) {
            addCriterion("index_array in", values, "indexArray");
            return (Criteria) this;
        }

        public Criteria andIndexArrayNotIn(List<String> values) {
            addCriterion("index_array not in", values, "indexArray");
            return (Criteria) this;
        }

        public Criteria andIndexArrayBetween(String value1, String value2) {
            addCriterion("index_array between", value1, value2, "indexArray");
            return (Criteria) this;
        }

        public Criteria andIndexArrayNotBetween(String value1, String value2) {
            addCriterion("index_array not between", value1, value2, "indexArray");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("upload_time is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterion("upload_time =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterion("upload_time <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterion("upload_time >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upload_time >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterion("upload_time <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("upload_time <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterion("upload_time in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterion("upload_time not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterion("upload_time between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("upload_time not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andRecordImgIsNull() {
            addCriterion("record_img is null");
            return (Criteria) this;
        }

        public Criteria andRecordImgIsNotNull() {
            addCriterion("record_img is not null");
            return (Criteria) this;
        }

        public Criteria andRecordImgEqualTo(String value) {
            addCriterion("record_img =", value, "recordImg");
            return (Criteria) this;
        }

        public Criteria andRecordImgNotEqualTo(String value) {
            addCriterion("record_img <>", value, "recordImg");
            return (Criteria) this;
        }

        public Criteria andRecordImgGreaterThan(String value) {
            addCriterion("record_img >", value, "recordImg");
            return (Criteria) this;
        }

        public Criteria andRecordImgGreaterThanOrEqualTo(String value) {
            addCriterion("record_img >=", value, "recordImg");
            return (Criteria) this;
        }

        public Criteria andRecordImgLessThan(String value) {
            addCriterion("record_img <", value, "recordImg");
            return (Criteria) this;
        }

        public Criteria andRecordImgLessThanOrEqualTo(String value) {
            addCriterion("record_img <=", value, "recordImg");
            return (Criteria) this;
        }

        public Criteria andRecordImgLike(String value) {
            addCriterion("record_img like", value, "recordImg");
            return (Criteria) this;
        }

        public Criteria andRecordImgNotLike(String value) {
            addCriterion("record_img not like", value, "recordImg");
            return (Criteria) this;
        }

        public Criteria andRecordImgIn(List<String> values) {
            addCriterion("record_img in", values, "recordImg");
            return (Criteria) this;
        }

        public Criteria andRecordImgNotIn(List<String> values) {
            addCriterion("record_img not in", values, "recordImg");
            return (Criteria) this;
        }

        public Criteria andRecordImgBetween(String value1, String value2) {
            addCriterion("record_img between", value1, value2, "recordImg");
            return (Criteria) this;
        }

        public Criteria andRecordImgNotBetween(String value1, String value2) {
            addCriterion("record_img not between", value1, value2, "recordImg");
            return (Criteria) this;
        }

        public Criteria andSumDistanceIsNull() {
            addCriterion("sum_distance is null");
            return (Criteria) this;
        }

        public Criteria andSumDistanceIsNotNull() {
            addCriterion("sum_distance is not null");
            return (Criteria) this;
        }

        public Criteria andSumDistanceEqualTo(Double value) {
            addCriterion("sum_distance =", value, "sumDistance");
            return (Criteria) this;
        }

        public Criteria andSumDistanceNotEqualTo(Double value) {
            addCriterion("sum_distance <>", value, "sumDistance");
            return (Criteria) this;
        }

        public Criteria andSumDistanceGreaterThan(Double value) {
            addCriterion("sum_distance >", value, "sumDistance");
            return (Criteria) this;
        }

        public Criteria andSumDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("sum_distance >=", value, "sumDistance");
            return (Criteria) this;
        }

        public Criteria andSumDistanceLessThan(Double value) {
            addCriterion("sum_distance <", value, "sumDistance");
            return (Criteria) this;
        }

        public Criteria andSumDistanceLessThanOrEqualTo(Double value) {
            addCriterion("sum_distance <=", value, "sumDistance");
            return (Criteria) this;
        }

        public Criteria andSumDistanceIn(List<Double> values) {
            addCriterion("sum_distance in", values, "sumDistance");
            return (Criteria) this;
        }

        public Criteria andSumDistanceNotIn(List<Double> values) {
            addCriterion("sum_distance not in", values, "sumDistance");
            return (Criteria) this;
        }

        public Criteria andSumDistanceBetween(Double value1, Double value2) {
            addCriterion("sum_distance between", value1, value2, "sumDistance");
            return (Criteria) this;
        }

        public Criteria andSumDistanceNotBetween(Double value1, Double value2) {
            addCriterion("sum_distance not between", value1, value2, "sumDistance");
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