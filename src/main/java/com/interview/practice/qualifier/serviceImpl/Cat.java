package com.interview.practice.qualifier.serviceImpl;

import com.interview.practice.qualifier.service.Animals;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Primary
public class Cat implements Animals {
    @Override
    public String animalCharacterstics() {
        return "Meao Meao";
    }
}
