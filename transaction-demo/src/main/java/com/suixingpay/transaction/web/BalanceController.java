package com.suixingpay.transaction.web;

import com.suixingpay.transaction.service.BalanceLogService;
import com.suixingpay.transaction.service.BalanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/balance")
public class BalanceController {
    @Autowired
    private BalanceService balanceService;

    @Autowired
    private BalanceLogService balanceLogService;

    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    public void test() {
        //zhangsan 给 lisi 转 10元
        balanceService.transfer("zhangsan","lisi",10);
        balanceLogService.tranferMoneyLog("zhangsan", "lisi", 10);
    }

}
