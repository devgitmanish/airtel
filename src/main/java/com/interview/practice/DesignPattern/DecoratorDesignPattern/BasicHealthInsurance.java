package com.interview.practice.DesignPattern.DecoratorDesignPattern;

public class BasicHealthInsurance implements HealthInsurance{
    @Override
    public String basicHealthInsurance() {
        return "basic disease covered";
    }
}
