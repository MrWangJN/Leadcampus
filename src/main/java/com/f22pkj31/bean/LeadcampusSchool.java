package com.f22pkj31.bean;

public class LeadcampusSchool {
    private Integer schoolId;

    private String schoolName;

    private String schoolPinyin;

    private Integer isservice;

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public String getSchoolPinyin() {
        return schoolPinyin;
    }

    public void setSchoolPinyin(String schoolPinyin) {
        this.schoolPinyin = schoolPinyin == null ? null : schoolPinyin.trim();
    }

    public Integer getIsservice() {
        return isservice;
    }

    public void setIsservice(Integer isservice) {
        this.isservice = isservice;
    }
}