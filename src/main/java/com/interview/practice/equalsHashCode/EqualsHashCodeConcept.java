package com.interview.practice.equalsHashCode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class EqualsHashCodeConcept {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Rahul"));
        list.add(new Employee(1, "Rahul"));
        list.add(new Employee(1, "Rahul"));
        System.out.println(list.size());


        /* Here entire employee object like id and value treat as key
        * if something is change in id and name return different size using equals and hashcode
        * if nothing is change then size is one
        *
        * if either comment equals method or hashcode method always size different
        * there is a contract between equals and hashcode method.
        *
        * play with it
        *
        * */


        Map<Employee, String> map = new HashMap<>();
        map.put(new Employee(1, "Rahul"), "value1");
        map.put(new Employee(1, "Rahul"), "value2");
        map.put(new Employee(1, "Rahul"), "value3");
        System.out.println(map.size());
    }
}


@Getter
@Setter
@AllArgsConstructor
class Employee {

    int id;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Employee employee))
            return false;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


