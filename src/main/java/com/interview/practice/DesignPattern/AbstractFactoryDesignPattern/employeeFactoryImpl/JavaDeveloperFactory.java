package com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.employeeFactoryImpl;

import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.employeeAbstractFactory.AbstractFactory;
import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.service.Employee;
import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.serviceimpl.JavaDeveloper;

public class JavaDeveloperFactory extends AbstractFactory {
    @Override
    public Employee createEmployee() {
        return new JavaDeveloper();
    }
}
