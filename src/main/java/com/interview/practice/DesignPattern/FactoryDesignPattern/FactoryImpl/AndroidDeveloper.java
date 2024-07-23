package com.interview.practice.DesignPattern.FactoryDesignPattern.FactoryImpl;

import com.interview.practice.DesignPattern.FactoryDesignPattern.Employee;

public class AndroidDeveloper implements Employee {

    @Override
    public String employeeType() {
        return "Android Developer";
    }
}
