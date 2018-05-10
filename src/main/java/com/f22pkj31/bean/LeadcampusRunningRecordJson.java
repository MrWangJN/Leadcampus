package com.f22pkj31.bean;

import com.f22pkj31.utils.MyDate;

import java.util.Date;

public class LeadcampusRunningRecordJson {
    private Integer recordId;

    private Integer studentid;

    private Object[] locationArray;

    private Double pace;

    private Integer useTime;

    private Object[] colorArray;

    private Double distance;

    private Object[] indexArray;

    private Date uploadTime;

    private String recordImg;

    private Double sumDistance;
    
    public LeadcampusRunningRecordJson() {
		super();
	}

	public LeadcampusRunningRecordJson(LeadcampusRunningRecord record,Object[] locationArray, Object[] colorArray, Object[] indexArray) {
		super();
		this.recordId = record.getRecordId();
		this.studentid = record.getStudentid();
		this.locationArray = locationArray;
		this.pace = record.getPace();
		this.useTime = record.getUseTime();
		this.colorArray = colorArray;
		this.distance = record.getDistance();
		this.indexArray = indexArray;
		this.uploadTime = record.getUploadTime();
		this.recordImg = record.getRecordImg();
		this.sumDistance = record.getSumDistance();
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

    public Object[] getLocationArray() {
        return locationArray;
    }

    public void setLocationArray(Object[] locationArray) {
        this.locationArray = locationArray;
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

    public Object[] getColorArray() {
        return colorArray;
    }

    public void setColorArray(Object[] colorArray) {
        this.colorArray = colorArray;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Object[] getIndexArray() {
        return indexArray;
    }

    public void setIndexArray(Object[] indexArray) {
        this.indexArray = indexArray;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = new MyDate(uploadTime);
    }

    public String getRecordImg() {
        return recordImg;
    }

    public void setRecordImg(String recordImg) {
        this.recordImg = recordImg;
    }

    public Double getSumDistance() {
        return sumDistance;
    }

    public void setSumDistance(Double sumDistance) {
        this.sumDistance = sumDistance;
    }
}