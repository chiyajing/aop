package com.suixingpay.transaction.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BalanceLog {
    private String fromUser;
    private String toUser;
    private double money;
}
