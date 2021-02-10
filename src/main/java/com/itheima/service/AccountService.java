package com.itheima.service;

import com.itheima.pojo.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @author: Administrator
 * @date: 2021/2/2 0002 21:39
 */
public interface AccountService {

    List<Account> findAll();

    void add(Account account);
}
