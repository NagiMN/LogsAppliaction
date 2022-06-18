package com.example.logsproject.DAOpattern;

import com.example.logsproject.Entity.UserLog;

import java.util.List;

public interface UserLogDAO {

    public List<UserLog> findAll();

    public UserLog findById(int id);

    public void save(UserLog userLog);

    public void deleteById(int id);
}
