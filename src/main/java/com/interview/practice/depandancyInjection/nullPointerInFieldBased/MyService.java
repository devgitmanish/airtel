package com.interview.practice.depandancyInjection.nullPointerInFieldBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyService {

    @Autowired
    private MyComponent component;

    public String callMyComponent(){
        return component.doWork();
    }
}
