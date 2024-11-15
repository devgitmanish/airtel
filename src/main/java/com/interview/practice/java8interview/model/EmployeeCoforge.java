package com.interview.practice.java8interview.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeCoforge {

    private int id;
    private String name;
    private int salary;
    private int age;
}
