package com.ruaoux.service.impl;

import com.ruaoux.dao.AccountDao;
import com.ruaoux.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

@Service("accountService")
@ComponentScan("com.ruaoux")
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;


    public AccountServiceImpl() {
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan,money);
        int i = 1/0;
        accountDao.in(inMan,money);
    }
}
