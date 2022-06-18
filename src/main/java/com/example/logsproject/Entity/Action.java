package com.example.logsproject.Entity;

import com.fasterxml.jackson.databind.annotation.JsonAppend;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Properties;

public class Action {

    private int id;
    private Timestamp time;
    private String type;
    private UserLog userLog;
    private Properties properties;

    public Action(){}

    public Action(Timestamp time, String type){
        this.time = time;
        this.type = type;
    }

    public Timestamp getTime(){
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Properties getProperties(){
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "Action [\n Time= "+ time + ",\n Type= "+ type + "]";
    }
}
