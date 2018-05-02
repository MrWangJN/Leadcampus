package com.f22pkj31.bean;

import java.util.Date;

public class LeadcampusRunningRecord {
    private Integer recordId;

    private Integer studentid;

    private String locationArray;

    private Double pace;

    private Integer useTime;

    private String colorArray;

    private Double distance;

    private String indexArray;

    private Date uploadTime;

    private String recordImg;

    private Double sumDistance;

    public LeadcampusRunningRecord( Integer studentid, String locationArray, Double pace, Integer useTime, String colorArray, Double distance, String indexArray, Date uploadTime) {
        this.studentid = studentid;
        this.locationArray = locationArray;
        this.pace = pace;
        this.useTime = useTime;
        this.colorArray = colorArray;
        this.distance = distance;
        this.indexArray = indexArray;
        this.uploadTime = uploadTime;
        this.recordImg = recordImg;
    }

    public LeadcampusRunningRecord() {
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getLocationArray() {
        return locationArray;
    }

    public void setLocationArray(String locationArray) {
        this.locationArray = locationArray == null ? null : locationArray.trim();
    }

    public Double getPace() {
        return pace;
    }

    public void setPace(Double pace) {
        this.pace = pace;
    }

    public Integer getUseTime() {
        return useTime;
    }

    public void setUseTime(Integer useTime) {
        this.useTime = useTime;
    }

    public String getColorArray() {
        return colorArray;
    }

    public void setColorArray(String colorArray) {
        this.colorArray = colorArray == null ? null : colorArray.trim();
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getIndexArray() {
        return indexArray;
    }

    public void setIndexArray(String indexArray) {
        this.indexArray = indexArray == null ? null : indexArray.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getRecordImg() {
        return recordImg;
    }

    public void setRecordImg(String recordImg) {
        this.recordImg = recordImg == null ? null : recordImg.trim();
    }

    public Double getSumDistance() {
        return sumDistance;
    }

    public void setSumDistance(Double sumDistance) {
        this.sumDistance = sumDistance;
    }
}