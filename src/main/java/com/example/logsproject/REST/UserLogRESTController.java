package com.example.logsproject.REST;

import com.example.logsproject.Entity.UserLog;
import com.example.logsproject.Services.UserLogActivity;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UserLogRESTController {

    private UserLogActivity userLogActivity;

    public UserLogRESTController(UserLogActivity userLogActivity1){
        userLogActivity = userLogActivity1;
    }

    public List<UserLog> findAll(){
        return userLogActivity.findAll();
    }

    public UserLog getUserLog(int userId){
        UserLog userLog = UserLogActivity.findById(userId);
        if (userLog == null){
            throw new RuntimeException("User ID not found: " + userId);
        }
        return userLog;
    }

    public UserLog addUser(UserLog userLog){
        userLog.setId(0);
        userLogActivity.save(userLog);

        return userLog;
    }

    public String deleteUser(int userId){
        UserLog tempUser = userLogActivity.findById(userId);
        userLogActivity.deleteById(userId);

        if (tempUser == null){
            throw new RuntimeException("User ID is not found: " + userId);
        }

        userLogActivity.deleteById(userId);

        return "Deleted User ID: " + userId;
    }
}
