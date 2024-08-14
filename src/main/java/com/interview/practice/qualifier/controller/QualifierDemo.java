package com.interview.practice.qualifier.controller;

import com.interview.practice.qualifier.service.Animals;
import com.interview.practice.qualifier.serviceImpl.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class QualifierDemo {

    //@Qualifier("dog")
    @Autowired
    private Animals animals;

    @GetMapping("/qualifier")
    public String qualifierDemo(){
        return animals.animalCharacterstics();
    }
}
