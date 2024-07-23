package com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.serviceimpl;


import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.service.Employee;

public class AndroidDeveloper implements Employee {
    @Override
    public int getSalary() {
        return 200000;
    }

    @Override
    public String getEmployee() {
        return "Android Developer";
    }
}
