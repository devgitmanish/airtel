package com.interview.practice.equalsAndHashCodeContract;

import java.util.HashMap;
import java.util.Map;

public class ExecutionWithMap {

    public static void main(String[] args) {


        Map<Employee, Integer> map = new HashMap<>();
        map.put(new Employee(11, "manish"), 4000);
        map.put(new Employee(12, "ravi"), 5000);
        map.put(new Employee(13, "laxman"), 6000);
        map.put(new Employee(11, "manish"), 9000);

        System.out.println("SIZE "+map.size());

        System.out.println(map.get(new Employee(11, "manish")));


        /*
        Example 2 where we can comment hashcode
         */

        Map<Student, Integer> studentMap = new HashMap<>();
        studentMap.put(new Student(11, "manish"), 4000);
        studentMap.put(new Student(12, "ravi"), 5000);
        studentMap.put(new Student(13, "laxman"), 6000);
        studentMap.put(new Student(11, "manish"), 9000);

        //size is 4 because we comment the hashcode method now jvm provide default
        //implementation on the basis of new object (new Student) and provide
        // memory address as a hashcode,
        // We know that whenever we crate a object with new keyword we have always
        // different memory address ( now that's your hash code )

        // For above 4 new object create a differnet memory address that's why size if 4
        System.out.println("SIZE "+studentMap.size());

        // due to comment hashcode jvm create a new memory adress to to find in the
        // hashmap bucket and it never find it becuase its a new memberoy adress crateed
        //that a reason it return null
        System.out.println(map.get(new Student(11, "manish")));

    }
}
