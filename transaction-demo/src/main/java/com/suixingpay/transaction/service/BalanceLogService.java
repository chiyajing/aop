package com.suixingpay.transaction.service;


import com.suixingpay.transaction.domain.BalanceLog;
import com.suixingpay.transaction.mapper.BalanceLogMapper;
import com.suixingpay.transaction.mapper.BalanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BalanceLogService {

    @Autowired
    private BalanceLogMapper balanceLogMapper;

    @Transactional(propagation= Propagation.REQUIRES_NEW)
    public void tranferMoneyLog(String from, String to, double money) {
        BalanceLog balanceLog = new BalanceLog();
        balanceLog.setFromUser(from);
        balanceLog.setToUser(to);
        balanceLog.setMoney(money);
        balanceLogMapper.save(balanceLog);
    }
}
