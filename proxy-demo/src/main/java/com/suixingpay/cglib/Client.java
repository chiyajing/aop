package com.suixingpay.cglib;

import com.suixingpay.pattern.RealSubject;
import com.suixingpay.pattern.Subject;
import net.sf.cglib.proxy.Enhancer;


public class Client {

    public static void main(String[] args){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new DemoMethodInterceptor());
        Subject subject = (Subject) enhancer.create();
        subject.hello();
    }
}
