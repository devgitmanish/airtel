package com.interview.practice.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class ControllerExample {

    @GetMapping("/getNames")
    public @ResponseBody String getName() {
        return "manish";
    }
}
