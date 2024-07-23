package com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.employeeFactoryImpl;

import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.serviceimpl.AndroidDeveloper;
import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.employeeAbstractFactory.AbstractFactory;
import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.service.Employee;

public class AndroidDeveloperFactory extends AbstractFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
