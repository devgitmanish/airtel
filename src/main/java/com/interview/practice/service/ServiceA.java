package com.interview.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {

    @Lazy
    @Autowired
    private ServiceB serviceB;

    public void methodA(){
        System.out.println("service-A");
    }

    public void methodAA(){
        System.out.println("Service-A");;
    }
}
