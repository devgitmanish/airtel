package com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.mainexcution;


import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.employeeFactory.EmployeeFactory;
import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.employeeFactoryImpl.AndroidDeveloperFactory;
import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.employeeFactoryImpl.JavaDeveloperFactory;
import com.interview.practice.DesignPattern.AbstractFactoryDesignPattern.service.Employee;

public class MainExecution {

    public static void main(String[] args) {


        Employee employeeFactory1
                = EmployeeFactory.createEmployee(new AndroidDeveloperFactory());

        System.out.println("Employee Name "+employeeFactory1.getEmployee()
                + " Salary :"+employeeFactory1.getSalary());

        Employee employeeFactory2
                = EmployeeFactory.createEmployee(new JavaDeveloperFactory());

        System.out.println("Employee Name "+employeeFactory2.getEmployee()
                + " Salary :"+employeeFactory2.getSalary());


    }
}
