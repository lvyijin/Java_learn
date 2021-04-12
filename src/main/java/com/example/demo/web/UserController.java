package com.example.demo.web;

import com.example.demo.dao.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
//    static 关键字表示是类变量
    static ArrayList<User> users = new ArrayList<User>();
    static int id;
//    需要有构造器吗？
    @GetMapping
    public ArrayList<User> getUsers(){
        return users;
    }
    @PutMapping
    public String insertUser(String name, int age){
        User user = new User();
        user.setId(UserController.id);
        user.setName(name);
        user.setAge(age);
        users.add(user);
        for(User u : users){
            System.out.println(u);
        }
        return "ok";
    }
}
