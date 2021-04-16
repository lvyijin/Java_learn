package com.example.demo;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class UserController {
    public static void main(String[] args){
        String resource = "com/example/demo/mybatisConfig.xml";
        try{
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession sqlSession = sqlSessionFactory.openSession();
            try{
                User user = sqlSession.selectOne("com.example.demo.UserMapper.selectUser", 6);
//                UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//                User user = userMapper.selectUser(6);
//                User user1 = userMapper.findByName("y1");
//                System.out.println(user);
//                System.out.println(user1);
            }finally {
//                保证数据库资源被关闭
                sqlSession.close();
            }

        }catch (Exception e){
            System.out.println("get resource error");
            e.printStackTrace();
        }

    }
}
