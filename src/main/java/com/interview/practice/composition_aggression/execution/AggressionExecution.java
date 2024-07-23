package com.interview.practice.composition_aggression.execution;

import com.interview.practice.composition_aggression.aggression_model.Address;
import com.interview.practice.composition_aggression.aggression_model.Employee;

public class AggressionExecution {

    public static void main(String[] args) {

        Address address1 = Address.builder()
                .city("agra")
                .country("india")
                .build();

        Employee employee = Employee.builder()
                .id(111)
                .name("manish")
                .address(address1)
                .build();

        System.out.println(employee);

        employee=null;

        System.out.println(employee);
        System.out.println(address1);

    }
}
