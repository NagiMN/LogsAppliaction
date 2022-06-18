package com.example.logsproject.DAOpattern;

import com.example.logsproject.Entity.UserLog;
import org.apache.catalina.User;

import java.util.List;

import javax.jms.Session;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UserLogDAOpatternImp  implements UserLogDAO{

    private EntityManager entityManager;

    public UserLogDAOpatternImp(EntityManager entityManager1){
        entityManager = entityManager1;
    }

}
