package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service 注解向 Spring 容器上报 该类是 UserService 接口的实现类
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User findUserById(int id){
        User user = userDao.selectUserById(id);
        return user;
    }

    public User[] findUserByName(String name){
        User[] users = userDao.selectUserByName(name);
        return users;
    }

    public User[] findUserByAge(int age){
        User[] users = userDao.selectUserByAge(age);
        return users;
    }

    public User[] getAllUsers() {
        User[] users = userDao.getAllUsers();
        return users;
    }

    public User[] findUserByNameandAge(String key){
        User[] users;
        try{
            int age = Integer.parseInt(key);
            users = userDao.selectUserByNameandAge(key, age);
        }catch (Exception e){
            users = userDao.selectUserByName(key);
        }
        return users;
    }

    public void insertUser(User user){
        userDao.insertUser(user);
    }
}
