package com.interview.practice.shallowDeepClonning.deep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee implements Cloneable {

    private String name;
    private String gender;
    private Address address;

    @Override
    public Employee clone() {
        try {
            Employee clone = (Employee) super.clone();
            clone.setAddress(address.clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
