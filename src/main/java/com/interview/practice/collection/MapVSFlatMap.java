package com.interview.practice.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVSFlatMap {


    public static List<User> getAll() {
        return Stream.of(
                new User(1, "manish", "manish@gmail.com", Arrays.asList("908908", "989898")),
                new User(2, "alok", "alok@gmail.com", Arrays.asList("908908", "989898")),
                new User(3, "ram", "ram@gmail.com", Arrays.asList("908908", "989898")),
                new User(4, "laxman", "laxman@gmail.com", Arrays.asList("908908", "989898"))
        ).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> collect = getAll().stream()
                .map(x -> x.getEmail())
                .toList();
        collect.forEach(System.out::println);

        List<String> collect1 =
                getAll()
                        .stream()
                        .flatMap(x -> x.getPhone().stream())
                        .toList();
        System.out.println("================");
        collect1.forEach(System.out::println);


    }
}
