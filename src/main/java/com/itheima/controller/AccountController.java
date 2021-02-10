package com.itheima.controller;

import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSQLColumnDefinition;
import com.itheima.pojo.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description
 * @author: Administrator
 * @date: 2021/2/2 0002 21:35
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("findAll.....");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/add")
    @ResponseBody
    public Map<String,String> add(@RequestBody Account account){
        System.out.println("add.......");
        accountService.add(account);
        Map<String,String> map = new HashMap<>();
        map.put("msg","添加成功");
        return map;
    }
}
