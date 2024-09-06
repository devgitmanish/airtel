package com.interview.practice.sapient.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeOnEveryThingOneClass {

    public static void main(String[] args) {

        Map<String, Employees> map = new HashMap<>();
        map.put("one", new Employees(123, "manish", 32, 500000));
        map.put("two", new Employees(456, "ram", 34, 700000));
        map.put("three", new Employees(789, "hanu", 26, 800000));
        map.put("four", new Employees(113, "laxman", 37, 900000));
        map.put("five", new Employees(114, "alex", 43, 300000));

        /* Sorted Map on the basis of Values */
        System.out.println("Sorted Map on the basis of Values");
        LinkedHashMap<String, Employees> collect = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employees::getSalary)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (x, y) -> x, LinkedHashMap::new));
        System.out.println(collect);


        Map<String, Integer> nthHighestSalary = new HashMap<>();
        nthHighestSalary.put("manish", 500000);
        nthHighestSalary.put("harish", 400000);
        nthHighestSalary.put("ram", 300000);
        nthHighestSalary.put("laxman", 200000);
        nthHighestSalary.put("hanu", 200000);

        System.out.println("Nth Highest Salary ");
        Map.Entry<Integer, List<String>> integerListEntry = nthHighestSalary.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getKey)))
                .toList()
                .get(1);
        System.out.println(integerListEntry);


        /* convert map to list  */
        System.out.println("Map to list ");
        List<String> list1 = nthHighestSalary.entrySet().stream().map(x -> x.getKey()).toList();
        System.out.println(list1);


        /* list to map  */




        Map<String, Integer> nthHighestSalaryComplex = new HashMap<>();
        nthHighestSalaryComplex.put("manish", 500000);
        nthHighestSalaryComplex.put("golu", 400000);
        nthHighestSalaryComplex.put("harish", 400000);
        nthHighestSalaryComplex.put("ram", 300000);
        nthHighestSalaryComplex.put("laxman", 200000);
        nthHighestSalaryComplex.put("hanu", 200000);

        /* nthHighestSalaryComplex logic Here on nthHighestSalaryComplex
         * print the person's name who is having second highest salary */
        System.out.println("Print the person's name who is having second highest salary");
        Map.Entry<Integer, List<String>> integerListEntry1 = nthHighestSalaryComplex.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getKey)))
                .toList()
                .get(1);
        System.out.println("2nd Highest Salary "+integerListEntry1.getKey() + " Employee "+integerListEntry1.getValue());


        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee(101, "manish", 5000));
        employeeMap.put(2, new Employee(103, "ram", 4000));
        employeeMap.put(3, new Employee(102, "alex", 4000));
        employeeMap.put(4, new Employee(104, "saurav", 3000));
        employeeMap.put(5, new Employee(105, "alok", 2000));

        /* nthHighestSalaryComplex logic Here on employeeMap */

        Map.Entry<Integer, List<String>> integerListEntry2 = employeeMap.values()
                .stream()
                .collect(Collectors.groupingBy(Employee::getSalary,
                        Collectors.mapping(Employee::getName, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getKey)))
                .toList()
                .get(1);
        System.out.println("IInd Highest Employee Name "+ integerListEntry2.getValue() + " Salary "+ integerListEntry2.getKey());


        /* Find Employee's who's have salary more than 3000*/
        System.out.println("Find Employee's who's have salary more than 3000");
        Map<Integer, Employee> collect3 = employeeMap.entrySet()
                .stream()
                .filter(x -> x.getValue().getSalary() > 3000)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        collect3.forEach((key, value) -> System.out.println(" Employee Id "+key + " Employee Name "+value.getName()
                + "Employee Salary "+ value.getSalary()));


        List<Employee> list = new ArrayList<>();
        list.add(new Employee(11, "manish", 2000));
        list.add(new Employee(12, "alok", 5000));
        list.add(new Employee(13, "manish", 2000));

        /* Sum on Salary */

        System.out.println("Sum Of Salary");

        Map<String, Integer> collect1 = list.stream().collect(Collectors.groupingBy(Employee::getName,
                Collectors.summingInt(Employee::getSalary)));
        System.out.println(collect1);

        /* Salary count
         * 2000- -> 2
         * 5000 -> 1 */

        Map<Integer, Long> collect2 = list.stream()
                .collect(Collectors.groupingBy(Employee::getSalary,
                        Collectors.counting()));
        System.out.println("Salary Count" + collect2);


    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employees{
    private int id;
    private String name;
    private int age;
    private double salary;
}

