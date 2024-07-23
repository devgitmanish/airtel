package com.interview.practice.equalsAndHashCodeContract;

import java.util.HashMap;
import java.util.Map;

public class Interview {

    public static void main(String[] args) {

        Map<Manager, Integer> map = new HashMap<>();

        Manager m1 = new Manager(11, "manish");
        Manager m2 = new Manager(12, "ravi");
        Manager m3 = new Manager(13, "laxman");
        Manager m4 = new Manager(11, "manish");

        map.put(m1, 5000);
        map.put(m2, 6000);
        map.put(m3, 7000);
        map.put(m4, 9000);

        //Here its return false because because equals always return false.
        System.out.println(m1.equals(m4));

        System.out.println(map.size());

        System.out.println(map.get(new Manager(11, "manish")));
    }
}
