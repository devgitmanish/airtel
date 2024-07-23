package com.interview.practice.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="student")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Student {

    @Id
    private int id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="city")
    private String city;
    @Column(name="country")
    private String country;
}
