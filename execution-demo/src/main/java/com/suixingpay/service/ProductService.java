package com.suixingpay.service;

import com.suixingpay.anno.NeedSecuredClass;
import com.suixingpay.anno.NeedSecuredSource;
import com.suixingpay.anno.NeedSecured;
import com.suixingpay.log.Loggable;
import org.springframework.stereotype.Component;

@Component
@NeedSecured
@NeedSecuredSource
@NeedSecuredClass
public class ProductService implements Loggable{

    public String getName(){
        System.out.println("execute get name");
        return "product service";
    }

    public void exDemo() throws IllegalAccessException{
        System.out.println("execute ex demo");
        throw new IllegalAccessException("TEST");
    }

    public void findById(Long id){
        System.out.println("execute find by id");
    }

    public void findByTwoArgs(Long id,String name){
        System.out.println("execute find by id and name");
    }

//    @Override
    public void log() {
        System.out.println("log from product service");
    }
}
