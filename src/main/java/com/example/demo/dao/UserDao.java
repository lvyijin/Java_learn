package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

    public User selectUserById(int id);
    public User[] selectUserByName(String name);
    public User[] getAllUsers();
    public User[] selectUserByAge(int age);
    public User[] selectUserByNameandAge(String name, int age);
    public void insertUser(User user);
    public void deleteUser(int id);

//    @Select("SELECT * FROM USER WHERE NAME = #{name}")
//    User findByName(@Param("name") String name);
}
