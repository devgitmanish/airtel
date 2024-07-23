package com.interview.practice.depandancyInjection.nullPointerInFieldBased;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

   // @Autowired
    //MyService service;

    public MyController(){
        System.out.println("my controller constructor called");
    }

    @GetMapping("/get-null")
    public String Control(){
        MyService service = new MyService();
        return service.callMyComponent();
    }
}
