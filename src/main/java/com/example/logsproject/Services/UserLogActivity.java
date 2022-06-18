package com.example.logsproject.Services;

import com.example.logsproject.Entity.UserLog;

import java.util.List;

public interface UserLogActivity {

    public List<UserLog> findAll();

    public UserLog findById(int id);
    public void save(UserLog userLog);

    public void deleteById(int id);

}
