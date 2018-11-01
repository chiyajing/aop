package com.suixingpay.transaction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.util.StringUtils;

@SpringBootApplication
@MapperScan("com.suixingpay.transaction.mapper") // mybatis扫描
public class StartApplication {

    public static void main(String[] args) {
        try {
            SpringApplicationBuilder builder = new SpringApplicationBuilder(StartApplication.class);
            ApplicationContext context = builder.web(true).run(args);
        } catch (Exception e) {// 一定要加此try catch, 方便解决问题
            // 打印启动失败的错误信息
            e.printStackTrace();
        }
    }
}
