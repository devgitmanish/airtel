package com.interview.practice.DesignPattern.FactoryDesignPattern.FactoryImpl;

import com.interview.practice.DesignPattern.FactoryDesignPattern.Employee;

public class JavaDeveloper implements Employee {
    @Override
    public String employeeType() {
        return "Java Developer";
    }
}
