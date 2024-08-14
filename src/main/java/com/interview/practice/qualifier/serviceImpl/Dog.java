package com.interview.practice.qualifier.serviceImpl;

import com.interview.practice.qualifier.service.Animals;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Dog implements Animals {
    @Override
    public String animalCharacterstics() {
        return "Bark Bark";
    }
}
