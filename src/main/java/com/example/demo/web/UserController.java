package com.example.demo.web;

import com.example.demo.dao.User;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
//    static 关键字表示是类变量
    static ArrayList<User> users = new ArrayList<User>();
    static int id;
//    需要有构造器吗？- 不需要
    @GetMapping
    public ArrayList<User> getUsers(){
        return users;
    }
    //    前端如何传参访问： curl --location --request PUT 'http://localhost:8080/user?name=yijing2&age=20'
    @PutMapping
    public String insertUser(@RequestBody User user){
        user.setId(id);
        users.add(user);
        id += 1;
        for(User u : users){
            System.out.println(u);
        }
        return "ok";
    }
    @DeleteMapping
    public User deleteUser(String name){
        for (User u : users){
            if (u.getName().equals(name)){
                users.remove(u);
                return u;
            }
        }
        return null;
    }
}
