package com.interview.practice.DesignPattern.FactoryDesignPattern;

import com.interview.practice.DesignPattern.FactoryDesignPattern.Factory.EmployeeFactory;

public class MainExecution {

    public static void main(String[] args) {


        Employee employee1 = EmployeeFactory.getEmployee("java");
        System.out.println(employee1.employeeType());

        Employee employee2 = EmployeeFactory.getEmployee("android");
        System.out.println(employee2.employeeType());
    }
}
