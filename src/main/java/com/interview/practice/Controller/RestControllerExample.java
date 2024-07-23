package com.interview.practice.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestControllerExample {


    @GetMapping("/getNames")
    public String getName() {
        return "mannish";
    }
}
