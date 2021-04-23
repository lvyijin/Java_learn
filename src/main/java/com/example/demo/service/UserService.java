package com.example.demo.service;

import com.example.demo.domain.User;

public interface UserService {
    public User findUserById(int id);
    public User[] findUserByName(String name);
    public User[] findUserByAge(int age);
    public User[] getAllUsers();
    public User[] findUserByNameandAge(String key);
    public void insertUser(User user);
    public void deleteUser(int id);
//    public void addUser();
}

