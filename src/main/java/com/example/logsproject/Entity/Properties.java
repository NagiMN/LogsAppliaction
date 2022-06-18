package com.example.logsproject.Entity;

import com.fasterxml.jackson.databind.annotation.JsonAppend;

public class Properties {

    private int id;
    private String viewedID;
    private String pageFrom;
    private String pageTo;
    private Integer locationX;
    private Integer locationY;
    private Action action;

    public Properties(){}

    public Properties(String viewedID, String pageFrom, String pageTo, Integer locationX, Integer locationY){
        this.viewedID = viewedID;
        this.pageFrom = pageFrom;
        this.pageTo = pageTo;
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public String getViewedID(){
        return viewedID;
    }

    public void setViewedID(String viewedID) {
        this.viewedID = viewedID;
    }

    public String getPageFrom(){
        return pageFrom;
    }

    public void setPageFrom(String pageFrom) {
        this.pageFrom = pageFrom;
    }

    public String getPageTo(){
        return pageTo;
    }

    public void setPageTo(String pageTo) {
        this.pageTo = pageTo;
    }

    public Integer getLocationX(){
        return locationX;
    }

    public void setLocationX(Integer locationX) {
        this.locationX = locationX;
    }

    public Integer getLocationY(){
        return locationY;
    }

    public void setLocationY(Integer locationY) {
        this.locationY = locationY;
    }

    @Override
    public String toString(){
        return "Properties [ViewedID= " + viewedID + ", LocationX= " + locationX + ", LocationY= " + locationY + ", PageFrom= " + pageFrom + ", PageTo= " + pageTo + "]";
    }
}
