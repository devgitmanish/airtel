package com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.serviceimpl;


import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.service.Employee;

public class JavaDeveloper implements Employee {
    @Override
    public int getSalary() {
        return 500000;
    }

    @Override
    public String getEmployee() {
        return "java developer";
    }
}
