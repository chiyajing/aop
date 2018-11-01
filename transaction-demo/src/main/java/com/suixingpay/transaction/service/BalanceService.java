package com.suixingpay.transaction.service;


import com.suixingpay.transaction.domain.Balance;
import com.suixingpay.transaction.mapper.BalanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BalanceService {


    @Autowired
    private BalanceMapper balanceMapper;

    @Autowired
    private BalanceLogService balanceLogService;

    public void reduceMoney(String name, double money) {
        double hasMoney = balanceMapper.getMoneyByName(name);
        if(hasMoney > money) {
            Balance balance = new Balance();
            balance.setName(name);
            balance.setMoney(hasMoney-money);
            balanceMapper.update(balance);
        }

    }

    public void addMoney(String name, double money) {

        int a = 1/0;
        double hasMoney = balanceMapper.getMoneyByName(name);
        Balance balance = new Balance();
        balance.setName(name);
        balance.setMoney(hasMoney+money);
        balanceMapper.update(balance);

    }


    public void transfer(String from, String to, double money ) {
        reduceMoney(from,money);
        addMoney(to,money);
    }

    @Transactional
    public void test(String name,double money ) {
        double hasMoney = balanceMapper.getMoneyByName(name);
        if(hasMoney > money) {
            Balance balance = new Balance();
            balance.setName(name);
            balance.setMoney(hasMoney-money);
            balanceMapper.update(balance);
        }
        balanceLogService.tranferMoneyLog("zhangsan", "lisi", 10);
        int a = 1/0;



    }
}
