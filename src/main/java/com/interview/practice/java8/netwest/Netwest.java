package com.interview.practice.java8.netwest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

public class Netwest {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "zeebra");
        map.put(102, "cow");
        map.put(103, "lion");
        map.put(104, "monkey");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue
                        , (x, y) -> x, LinkedHashMap::new))
                .entrySet()
                .stream()
                .forEach(System.out::println);

        Map<Employee, String> empMap = new HashMap<>();
        empMap.put(new Employee(101, "manish", 5000, 32), "gurgaon");
        empMap.put(new Employee(102, "manish", 3000, 34), "delhi");
        empMap.put(new Employee(103, "manish", 1000, 25), "agra");
        empMap.put(new Employee(104, "manish", 2000, 41), "lucknow");

        LinkedHashMap<Employee, String> sortedBySalary = empMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (x, y) -> x, LinkedHashMap::new));
        System.out.println("==========================");
        System.out.println(sortedBySalary);


        /* those employee whose salalry is greater than 2000 */
        LinkedHashMap<Employee, String> collect3 = empMap.entrySet()
                .stream()
                .filter(x -> x.getKey().getSalary() > 2000)
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (x, y) -> x, LinkedHashMap::new));

        System.out.println("Employee whose salary greater than 2000 " + collect3);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(11, "manish", 2000, 32));
        employeeList.add(new Employee(12, "alex", 3000, 33));
        employeeList.add(new Employee(13, "ram", 5000, 34));
        employeeList.add(new Employee(14, "ram", 7000, 21));

        List<Employee> collect = employeeList
                .stream()
                .filter(x -> x.getSalary() > 3000)
                .toList();
        System.out.println("Employee More than 3000  " + collect);

        /* List to Map */
        System.out.println("======Convert list to Map=======");
        Map<Integer, Integer> collect1 = employeeList
                .stream()
                .filter(x -> x.getSalary() > 3000)
                .collect(Collectors.toMap(Employee::getId, Employee::getSalary));

        System.out.println("======Convert list to Map with entire object=======");

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {

    private int id;
    private String name;
    private int salary;
    private int age;
}