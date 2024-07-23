package com.interview.practice.DesignPattern.FactoryDesignPattern.Factory;

import com.interview.practice.DesignPattern.FactoryDesignPattern.Employee;
import com.interview.practice.DesignPattern.FactoryDesignPattern.FactoryImpl.AndroidDeveloper;
import com.interview.practice.DesignPattern.FactoryDesignPattern.FactoryImpl.JavaDeveloper;

public class EmployeeFactory {

    public static Employee getEmployee(String employeeType){

        switch (employeeType.trim()){
            case "java":
                return new JavaDeveloper();
            case "android":
                return new AndroidDeveloper();
            default:
                return null;

        }
    }
}
