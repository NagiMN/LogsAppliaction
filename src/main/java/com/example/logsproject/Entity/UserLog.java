package com.example.logsproject.Entity;

import org.w3c.dom.views.AbstractView;

import java.util.List;

public class UserLog {

    private int id;
    private String userId;
    private String sessionId;
    private List<Action> action;

    public UserLog(){}

    public UserLog(int id, String sessionId, String userId){
        this.id = id;
        this.userId = userId;
        this.sessionId = sessionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public List<Action> getAction(){
        return action;
    }

    public void setAction(List<Action> action){
        this.action = action;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString(){
        return "Log [UserID= " + userId + ", SessionId= " + sessionId + "]";
    }
}
