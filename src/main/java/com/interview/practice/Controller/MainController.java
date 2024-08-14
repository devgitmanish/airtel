package com.interview.practice.Controller;

import com.interview.practice.exception.InvalidArgumentException;
import com.interview.practice.service.BusinessLogic;
import com.interview.practice.service.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private BusinessLogic businessLogic;

    @GetMapping(value = "/docker")
    public String getCode() {
        return "this is first docker deployment";
    }

    @GetMapping(value = "/student")
    public ResponseEntity<?> getEmployee() throws InvalidArgumentException {
        return businessLogic.getStudent(11);
    }



}
