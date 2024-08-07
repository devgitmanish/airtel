package com.interview.practice.sapient.coderpad.done;

import java.util.*;
import java.util.stream.Collectors;

public class MaxAverageMarks {

    //Given an array of Employees with name,marks.
    // Find out the maximum average marks from the list.

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alia", -678),
                new Employee("Bobby", 100),
                new Employee("Alex", 223),
                new Employee("Alex", -23),
                new Employee("Bobby", 723)
        );

        Map<String, Double> employee = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName,
                        Collectors.averagingInt(Employee::getMarks)));

        Map.Entry<String, Double> employeeFound = employee.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(() -> new NoSuchElementException("no employee found"));

        System.out.println("Employee name Max Marks "+employeeFound.getKey()
                + " Maximum Average Marks "+ employeeFound.getValue());
    }
}
