package com.interview.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {

    @Autowired
    private ServiceA serviceA;

    public void methodB(){
        serviceA.methodAA();
    }

    public void methodBB(){
        System.out.println("Service-B");;
    }
}
