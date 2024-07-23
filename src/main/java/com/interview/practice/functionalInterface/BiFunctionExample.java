package com.interview.practice.functionalInterface;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionExample implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {


    public List<Integer> apply(List<Integer> list1, List<Integer> list2) {

        return Stream.of(list1, list2)
                .flatMap(x -> x.stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        BiFunctionExample biFunctionExample = new BiFunctionExample();
        List<Integer> result = biFunctionExample.apply(Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(1, 3, 6, 7, 8, 9));

        result.forEach(System.out::println);



        /* via annonymous */

        BiFunction<List<Integer>, List<Integer>, List<Integer>> list = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> l1, List<Integer> l2) {
                return Stream.of(l1, l2)
                        .flatMap(x -> x.stream())
                        .distinct()
                        .collect(Collectors.toList());
            }
        };
        System.out.println("Via Annonymous " + list.apply(Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(1, 2, 3, 6, 7, 8)));


        /* via Lambda */

        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction = (l1, l2) -> {
             return Stream.of(l1, l2)
                    .flatMap(x -> x.stream())
                    .distinct()
                    .collect(Collectors.toList());
        };
        System.out.println("Via Lambda "+biFunction.apply(Arrays.asList(1,2,3,4,5),
                Arrays.asList(1,2,3,6,7,8)));
    }

}

