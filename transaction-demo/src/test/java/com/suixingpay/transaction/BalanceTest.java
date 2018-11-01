package com.suixingpay.transaction;


import com.suixingpay.transaction.service.BalanceLogService;
import com.suixingpay.transaction.service.BalanceService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BalanceTest extends BaseTest {

    @Autowired
    private BalanceService balanceService;
    @Autowired
    private BalanceLogService balanceLogService;
    @Test
    public void test() {

        balanceService.test("zhangsan",10);
        //zhangsan 给 lisi 转 10元
      //  balanceService.transfer("zhangsan","lisi",10);
      //  balanceLogService.tranferMoneyLog("zhangsan", "lisi", 10);

    }
}

