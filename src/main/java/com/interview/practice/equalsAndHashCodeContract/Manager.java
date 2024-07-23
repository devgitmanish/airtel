package com.interview.practice.equalsAndHashCodeContract;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Manager {

    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Manager manager)) return false;
        return id == manager.id && Objects.equals(name, manager.name);

        //return false // another use case
    }

    @Override
    public int hashCode() {
        return 111;
    }
}
