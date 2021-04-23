package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class userController {
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return userService.findUserById(id);
    }
    @GetMapping
    public User[] searchUserByName(String name, String age, String key){
        User[] users;
        if (name != null){
            users = userService.findUserByName(name);
        }else if (age != null){
            users = userService.findUserByAge(Integer.parseInt(age));
        }else if (key != null){
            users = userService.findUserByNameandAge(key);
        }else {
            users = userService.getAllUsers();
        }
        return users;
    }
    @PutMapping
    public void addUser(@RequestBody User user){
        System.out.println(user);
        userService.insertUser(user);
        System.out.println("test");
    }
}
