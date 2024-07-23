package com.interview.practice.depandancyInjection.nullPointerInFieldBased;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public String doWork(){
        System.out.println("do work....");
        return "do work..";
    }
}
