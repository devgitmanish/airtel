package com.interview.practice.comparablevscomprator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExec {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(111, "manish"));
        list.add(new Employee(444, "laxman"));
        list.add(new Employee(222, "ram"));
        list.add(new Employee(333, "alex"));


//        list.forEach(x -> System.out.println(x.getName()));
//        System.out.println("--------------------------");
//        Collections.sort(list);
//        list.forEach(x -> System.out.println(x.getName()));


        list.forEach(x -> System.out.println(x.getId()));
        System.out.println("--------------------------");
        Collections.sort(list);
        list.forEach(x -> System.out.println(x.getId()));
    }
}



@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee implements Comparable<Employee>{
    private int id;
    private String name;

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.name.compareTo(o.getName());
//    }
}