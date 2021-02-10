package com.itheima.dao;

import com.itheima.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description
 * @author: Administrator
 * @date: 2021/2/2 0002 21:55
 */
public interface AccountDao {
    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account values(null,#{name},#{money})")
    void add(Account account);
}
