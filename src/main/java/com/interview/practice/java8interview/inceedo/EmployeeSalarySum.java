package com.interview.practice.java8interview.inceedo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSalarySum {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(11, "manish", 2000));
        list.add(new Employee(12, "alok", 5000));
        list.add(new Employee(13, "manish", 2000));

        list.stream().collect(Collectors.groupingBy(Employee::getName,
                Collectors.summingInt(Employee::getSalary)))
                .forEach( (key, value) -> {
                    System.out.println("Name "+key + " Salary Sum "+ value);
                });
    }
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee{

    private int id;
    private String name;
    private int salary;

}