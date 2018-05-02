package com.f22pkj31.bean;

public class LeadcampusStudent {
    private Integer studentId;

    private String studentName;

    private String studentNum;

    private Integer studentSex;

    private String studentPasswd;

    private String schoolName;

    private String phoneNum;

    private Double totalMileage;

    private Double totalTime;

    private Double averageVelocity;

    private Integer heartRate;

    private Integer trainingDays;

    private Double totalCalories;

    private String studentPic;

    private String sessionId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum == null ? null : studentNum.trim();
    }

    public Integer getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Integer studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentPasswd() {
        return studentPasswd;
    }

    public void setStudentPasswd(String studentPasswd) {
        this.studentPasswd = studentPasswd == null ? null : studentPasswd.trim();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public Double getTotalMileage() {
        return totalMileage;
    }

    public void setTotalMileage(Double totalMileage) {
        this.totalMileage = totalMileage;
    }

    public Double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Double totalTime) {
        this.totalTime = totalTime;
    }

    public Double getAverageVelocity() {
        return averageVelocity;
    }

    public void setAverageVelocity(Double averageVelocity) {
        this.averageVelocity = averageVelocity;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public Integer getTrainingDays() {
        return trainingDays;
    }

    public void setTrainingDays(Integer trainingDays) {
        this.trainingDays = trainingDays;
    }

    public Double getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(Double totalCalories) {
        this.totalCalories = totalCalories;
    }

    public String getStudentPic() {
        return studentPic;
    }

    public void setStudentPic(String studentPic) {
        this.studentPic = studentPic == null ? null : studentPic.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }
}