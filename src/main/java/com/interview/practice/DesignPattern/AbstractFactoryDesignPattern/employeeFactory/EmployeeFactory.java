package com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.employeeFactory;

import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.service.Employee;
import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.employeeAbstractFactory.AbstractFactory;

public class EmployeeFactory {

    public static Employee createEmployee(AbstractFactory abstractFactory){
        return abstractFactory.createEmployee();
    }
}
