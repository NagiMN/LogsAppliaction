package com.example.logsproject.Services;

import com.example.logsproject.Entity.UserLog;

import java.util.List;

public class UserLogActivityImp {
    private UserLogDAO userLogDAO;

    public UserLogActivityImp (UserLogDAO userLogDao){
        userLogDAO = userLogDao;
    }

    public List<UserLog> findAll() {
        return userLogDAO.findAll();
    }

    public UserLog findById(int id){
        return userLogDAO.findById(id);
    }

    public void save(UserLog userLog){
        userLogDAO.save(userLog);
    }

    public void deleteByID(int id){
        userLogDAO.deleteById(id);
    }
}
