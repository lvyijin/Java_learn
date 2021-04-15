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
            sqlSessionFactory.getConfiguration().addMapper(UserMapper.class);

            SqlSession sqlSession = sqlSessionFactory.openSession();
            try{
//                User user = sqlSession.selectOne("mapper.userMapper.selectUser", 6);
                UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
                User user = userMapper.selectUser(6);
                System.out.println(user);
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
