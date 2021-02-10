package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.pojo.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.AccessControlContext;
import java.util.List;

/**
 * @description
 * @author: Administrator
 * @date: 2021/2/2 0002 21:40
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("在service中调用dao的findAll方法~~~");
        List<Account> list = accountDao.findAll();
        return list;
    }

    @Transactional
    @Override
    public void add(Account account){
        accountDao.add(account);
    }
}
