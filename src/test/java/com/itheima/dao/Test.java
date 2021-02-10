package com.itheima.dao;

import com.itheima.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @description
 * @author: Administrator
 * @date: 2021/2/2 0002 22:02
 */
public class Test {


    @org.junit.Test
    public void Test01() throws IOException {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        System.out.println(accountDao.findAll());
        sqlSession.close();
    }

    @org.junit.Test
    public void Test02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        AccountDao accountDao = context.getBean(AccountDao.class);
        System.out.println(accountDao.findAll());
    }
}
