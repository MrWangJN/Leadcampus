package com.f22pkj31.bean;

import java.util.ArrayList;
import java.util.List;

public class LeadcampusStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeadcampusStudentExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNumIsNull() {
            addCriterion("student_num is null");
            return (Criteria) this;
        }

        public Criteria andStudentNumIsNotNull() {
            addCriterion("student_num is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNumEqualTo(String value) {
            addCriterion("student_num =", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotEqualTo(String value) {
            addCriterion("student_num <>", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumGreaterThan(String value) {
            addCriterion("student_num >", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumGreaterThanOrEqualTo(String value) {
            addCriterion("student_num >=", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumLessThan(String value) {
            addCriterion("student_num <", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumLessThanOrEqualTo(String value) {
            addCriterion("student_num <=", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumLike(String value) {
            addCriterion("student_num like", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotLike(String value) {
            addCriterion("student_num not like", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumIn(List<String> values) {
            addCriterion("student_num in", values, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotIn(List<String> values) {
            addCriterion("student_num not in", values, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumBetween(String value1, String value2) {
            addCriterion("student_num between", value1, value2, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotBetween(String value1, String value2) {
            addCriterion("student_num not between", value1, value2, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNull() {
            addCriterion("student_sex is null");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNotNull() {
            addCriterion("student_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSexEqualTo(Integer value) {
            addCriterion("student_sex =", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotEqualTo(Integer value) {
            addCriterion("student_sex <>", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThan(Integer value) {
            addCriterion("student_sex >", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_sex >=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThan(Integer value) {
            addCriterion("student_sex <", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThanOrEqualTo(Integer value) {
            addCriterion("student_sex <=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexIn(List<Integer> values) {
            addCriterion("student_sex in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotIn(List<Integer> values) {
            addCriterion("student_sex not in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexBetween(Integer value1, Integer value2) {
            addCriterion("student_sex between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotBetween(Integer value1, Integer value2) {
            addCriterion("student_sex not between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdIsNull() {
            addCriterion("student_passwd is null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdIsNotNull() {
            addCriterion("student_passwd is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdEqualTo(String value) {
            addCriterion("student_passwd =", value, "studentPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdNotEqualTo(String value) {
            addCriterion("student_passwd <>", value, "studentPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdGreaterThan(String value) {
            addCriterion("student_passwd >", value, "studentPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("student_passwd >=", value, "studentPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdLessThan(String value) {
            addCriterion("student_passwd <", value, "studentPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdLessThanOrEqualTo(String value) {
            addCriterion("student_passwd <=", value, "studentPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdLike(String value) {
            addCriterion("student_passwd like", value, "studentPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdNotLike(String value) {
            addCriterion("student_passwd not like", value, "studentPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdIn(List<String> values) {
            addCriterion("student_passwd in", values, "studentPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdNotIn(List<String> values) {
            addCriterion("student_passwd not in", values, "studentPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdBetween(String value1, String value2) {
            addCriterion("student_passwd between", value1, value2, "studentPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentPasswdNotBetween(String value1, String value2) {
            addCriterion("student_passwd not between", value1, value2, "studentPasswd");
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

        public Criteria andPhoneNumIsNull() {
            addCriterion("phone_num is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("phone_num =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("phone_num <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("phone_num >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("phone_num >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("phone_num <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("phone_num <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("phone_num like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("phone_num not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("phone_num in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("phone_num not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("phone_num between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("phone_num not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andTotalMileageIsNull() {
            addCriterion("total_mileage is null");
            return (Criteria) this;
        }

        public Criteria andTotalMileageIsNotNull() {
            addCriterion("total_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMileageEqualTo(Double value) {
            addCriterion("total_mileage =", value, "totalMileage");
            return (Criteria) this;
        }

        public Criteria andTotalMileageNotEqualTo(Double value) {
            addCriterion("total_mileage <>", value, "totalMileage");
            return (Criteria) this;
        }

        public Criteria andTotalMileageGreaterThan(Double value) {
            addCriterion("total_mileage >", value, "totalMileage");
            return (Criteria) this;
        }

        public Criteria andTotalMileageGreaterThanOrEqualTo(Double value) {
            addCriterion("total_mileage >=", value, "totalMileage");
            return (Criteria) this;
        }

        public Criteria andTotalMileageLessThan(Double value) {
            addCriterion("total_mileage <", value, "totalMileage");
            return (Criteria) this;
        }

        public Criteria andTotalMileageLessThanOrEqualTo(Double value) {
            addCriterion("total_mileage <=", value, "totalMileage");
            return (Criteria) this;
        }

        public Criteria andTotalMileageIn(List<Double> values) {
            addCriterion("total_mileage in", values, "totalMileage");
            return (Criteria) this;
        }

        public Criteria andTotalMileageNotIn(List<Double> values) {
            addCriterion("total_mileage not in", values, "totalMileage");
            return (Criteria) this;
        }

        public Criteria andTotalMileageBetween(Double value1, Double value2) {
            addCriterion("total_mileage between", value1, value2, "totalMileage");
            return (Criteria) this;
        }

        public Criteria andTotalMileageNotBetween(Double value1, Double value2) {
            addCriterion("total_mileage not between", value1, value2, "totalMileage");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIsNull() {
            addCriterion("total_time is null");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIsNotNull() {
            addCriterion("total_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTimeEqualTo(Double value) {
            addCriterion("total_time =", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotEqualTo(Double value) {
            addCriterion("total_time <>", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeGreaterThan(Double value) {
            addCriterion("total_time >", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("total_time >=", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeLessThan(Double value) {
            addCriterion("total_time <", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeLessThanOrEqualTo(Double value) {
            addCriterion("total_time <=", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIn(List<Double> values) {
            addCriterion("total_time in", values, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotIn(List<Double> values) {
            addCriterion("total_time not in", values, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeBetween(Double value1, Double value2) {
            addCriterion("total_time between", value1, value2, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotBetween(Double value1, Double value2) {
            addCriterion("total_time not between", value1, value2, "totalTime");
            return (Criteria) this;
        }

        public Criteria andAverageVelocityIsNull() {
            addCriterion("average_velocity is null");
            return (Criteria) this;
        }

        public Criteria andAverageVelocityIsNotNull() {
            addCriterion("average_velocity is not null");
            return (Criteria) this;
        }

        public Criteria andAverageVelocityEqualTo(Double value) {
            addCriterion("average_velocity =", value, "averageVelocity");
            return (Criteria) this;
        }

        public Criteria andAverageVelocityNotEqualTo(Double value) {
            addCriterion("average_velocity <>", value, "averageVelocity");
            return (Criteria) this;
        }

        public Criteria andAverageVelocityGreaterThan(Double value) {
            addCriterion("average_velocity >", value, "averageVelocity");
            return (Criteria) this;
        }

        public Criteria andAverageVelocityGreaterThanOrEqualTo(Double value) {
            addCriterion("average_velocity >=", value, "averageVelocity");
            return (Criteria) this;
        }

        public Criteria andAverageVelocityLessThan(Double value) {
            addCriterion("average_velocity <", value, "averageVelocity");
            return (Criteria) this;
        }

        public Criteria andAverageVelocityLessThanOrEqualTo(Double value) {
            addCriterion("average_velocity <=", value, "averageVelocity");
            return (Criteria) this;
        }

        public Criteria andAverageVelocityIn(List<Double> values) {
            addCriterion("average_velocity in", values, "averageVelocity");
            return (Criteria) this;
        }

        public Criteria andAverageVelocityNotIn(List<Double> values) {
            addCriterion("average_velocity not in", values, "averageVelocity");
            return (Criteria) this;
        }

        public Criteria andAverageVelocityBetween(Double value1, Double value2) {
            addCriterion("average_velocity between", value1, value2, "averageVelocity");
            return (Criteria) this;
        }

        public Criteria andAverageVelocityNotBetween(Double value1, Double value2) {
            addCriterion("average_velocity not between", value1, value2, "averageVelocity");
            return (Criteria) this;
        }

        public Criteria andHeartRateIsNull() {
            addCriterion("heart_rate is null");
            return (Criteria) this;
        }

        public Criteria andHeartRateIsNotNull() {
            addCriterion("heart_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHeartRateEqualTo(Integer value) {
            addCriterion("heart_rate =", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotEqualTo(Integer value) {
            addCriterion("heart_rate <>", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateGreaterThan(Integer value) {
            addCriterion("heart_rate >", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("heart_rate >=", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateLessThan(Integer value) {
            addCriterion("heart_rate <", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateLessThanOrEqualTo(Integer value) {
            addCriterion("heart_rate <=", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateIn(List<Integer> values) {
            addCriterion("heart_rate in", values, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotIn(List<Integer> values) {
            addCriterion("heart_rate not in", values, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateBetween(Integer value1, Integer value2) {
            addCriterion("heart_rate between", value1, value2, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotBetween(Integer value1, Integer value2) {
            addCriterion("heart_rate not between", value1, value2, "heartRate");
            return (Criteria) this;
        }

        public Criteria andTrainingDaysIsNull() {
            addCriterion("training_days is null");
            return (Criteria) this;
        }

        public Criteria andTrainingDaysIsNotNull() {
            addCriterion("training_days is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingDaysEqualTo(Integer value) {
            addCriterion("training_days =", value, "trainingDays");
            return (Criteria) this;
        }

        public Criteria andTrainingDaysNotEqualTo(Integer value) {
            addCriterion("training_days <>", value, "trainingDays");
            return (Criteria) this;
        }

        public Criteria andTrainingDaysGreaterThan(Integer value) {
            addCriterion("training_days >", value, "trainingDays");
            return (Criteria) this;
        }

        public Criteria andTrainingDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("training_days >=", value, "trainingDays");
            return (Criteria) this;
        }

        public Criteria andTrainingDaysLessThan(Integer value) {
            addCriterion("training_days <", value, "trainingDays");
            return (Criteria) this;
        }

        public Criteria andTrainingDaysLessThanOrEqualTo(Integer value) {
            addCriterion("training_days <=", value, "trainingDays");
            return (Criteria) this;
        }

        public Criteria andTrainingDaysIn(List<Integer> values) {
            addCriterion("training_days in", values, "trainingDays");
            return (Criteria) this;
        }

        public Criteria andTrainingDaysNotIn(List<Integer> values) {
            addCriterion("training_days not in", values, "trainingDays");
            return (Criteria) this;
        }

        public Criteria andTrainingDaysBetween(Integer value1, Integer value2) {
            addCriterion("training_days between", value1, value2, "trainingDays");
            return (Criteria) this;
        }

        public Criteria andTrainingDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("training_days not between", value1, value2, "trainingDays");
            return (Criteria) this;
        }

        public Criteria andTotalCaloriesIsNull() {
            addCriterion("total_calories is null");
            return (Criteria) this;
        }

        public Criteria andTotalCaloriesIsNotNull() {
            addCriterion("total_calories is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCaloriesEqualTo(Double value) {
            addCriterion("total_calories =", value, "totalCalories");
            return (Criteria) this;
        }

        public Criteria andTotalCaloriesNotEqualTo(Double value) {
            addCriterion("total_calories <>", value, "totalCalories");
            return (Criteria) this;
        }

        public Criteria andTotalCaloriesGreaterThan(Double value) {
            addCriterion("total_calories >", value, "totalCalories");
            return (Criteria) this;
        }

        public Criteria andTotalCaloriesGreaterThanOrEqualTo(Double value) {
            addCriterion("total_calories >=", value, "totalCalories");
            return (Criteria) this;
        }

        public Criteria andTotalCaloriesLessThan(Double value) {
            addCriterion("total_calories <", value, "totalCalories");
            return (Criteria) this;
        }

        public Criteria andTotalCaloriesLessThanOrEqualTo(Double value) {
            addCriterion("total_calories <=", value, "totalCalories");
            return (Criteria) this;
        }

        public Criteria andTotalCaloriesIn(List<Double> values) {
            addCriterion("total_calories in", values, "totalCalories");
            return (Criteria) this;
        }

        public Criteria andTotalCaloriesNotIn(List<Double> values) {
            addCriterion("total_calories not in", values, "totalCalories");
            return (Criteria) this;
        }

        public Criteria andTotalCaloriesBetween(Double value1, Double value2) {
            addCriterion("total_calories between", value1, value2, "totalCalories");
            return (Criteria) this;
        }

        public Criteria andTotalCaloriesNotBetween(Double value1, Double value2) {
            addCriterion("total_calories not between", value1, value2, "totalCalories");
            return (Criteria) this;
        }

        public Criteria andStudentPicIsNull() {
            addCriterion("student_pic is null");
            return (Criteria) this;
        }

        public Criteria andStudentPicIsNotNull() {
            addCriterion("student_pic is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPicEqualTo(String value) {
            addCriterion("student_pic =", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicNotEqualTo(String value) {
            addCriterion("student_pic <>", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicGreaterThan(String value) {
            addCriterion("student_pic >", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicGreaterThanOrEqualTo(String value) {
            addCriterion("student_pic >=", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicLessThan(String value) {
            addCriterion("student_pic <", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicLessThanOrEqualTo(String value) {
            addCriterion("student_pic <=", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicLike(String value) {
            addCriterion("student_pic like", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicNotLike(String value) {
            addCriterion("student_pic not like", value, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicIn(List<String> values) {
            addCriterion("student_pic in", values, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicNotIn(List<String> values) {
            addCriterion("student_pic not in", values, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicBetween(String value1, String value2) {
            addCriterion("student_pic between", value1, value2, "studentPic");
            return (Criteria) this;
        }

        public Criteria andStudentPicNotBetween(String value1, String value2) {
            addCriterion("student_pic not between", value1, value2, "studentPic");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("session_id like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("session_id not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
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