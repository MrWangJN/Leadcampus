package com.f22pkj31.bean;

import java.util.Date;

public class LeadcampusRoute {
    private Integer routeId;

    private String routeName;

    private String schoolName;

    private String routeArray;

    private Date routeUploadTime;

    private String routeCenterPoint;

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName == null ? null : routeName.trim();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public String getRouteArray() {
        return routeArray;
    }

    public void setRouteArray(String routeArray) {
        this.routeArray = routeArray == null ? null : routeArray.trim();
    }

    public Date getRouteUploadTime() {
        return routeUploadTime;
    }

    public void setRouteUploadTime(Date routeUploadTime) {
        this.routeUploadTime = routeUploadTime;
    }

    public String getRouteCenterPoint() {
        return routeCenterPoint;
    }

    public void setRouteCenterPoint(String routeCenterPoint) {
        this.routeCenterPoint = routeCenterPoint == null ? null : routeCenterPoint.trim();
    }
}