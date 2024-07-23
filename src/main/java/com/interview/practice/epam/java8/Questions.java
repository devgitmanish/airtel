package com.interview.practice.epam.java8;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

public class Questions {

    /*
    1)Find the lowest model of cheapest price car from given list of cars.
      you can use java 8 streams



    2)Calculate the average age for each grade.

    3)Please use the below two arrays as inputs and try to write a program addition
      of the two arrays

    4)Print the square of even numbers from given array {1,2,3,4,5,6,7,8,9,10}?

    5)Given an array, find the pairs of numbers, whose sum = 11


    {0, 14, 0, 4, 7, 8, 3, 5, 7}?

     */

    public static int[] squareGivenNumber(int[] num) {

        int[] result = new int[num.length];
        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 == 0)
                result[i] = num[i] * num[i];
            else
                result[i] = num[i];
        }
        return result;
    }

    public static int[] targerIndex(int[] nums, int target) {

        Map<Integer, Integer> map = new LinkedHashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                result[0] = map.get(diff);
                result[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }


    public static Set<List<Integer>> findPairs(int[] arr, int target) {

        Set<List<Integer>> result = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for(int i=0; i<arr.length; i++) {

            int difference = target - arr[i];
            if (seen.contains(difference)) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(difference);
                result.add(list);
            }
            seen.add(arr[i]);
        }
        return result;
    }
    //int[] values = {0, 14, 0, 4, 7, 8, 3, 5, 7};
    //int target = 11;
    public static void main(String[] args) {

        /*
        1)Find the lowest model of cheapest price car from given list of cars.
                you can use java 8 streams
        */

        List<Cars> listCar = new ArrayList<>();
        listCar.add(new Cars("honda", "highest", 7000));
        listCar.add(new Cars("maruti", "lowest", 2000));
        listCar.add(new Cars("BMW", "highest", 12000));
        listCar.add(new Cars("Audi", "highest", 13000));
        listCar.add(new Cars("tata", "lowest", 3000));

        Optional<Cars> min = listCar.stream().min(Comparator.comparing(Cars::getPrice));
        min.ifPresent(cars -> System.out.println("Car Name "+cars.getCarName() + " Price "+cars.getPrice()));

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "manish", 32, "ABC"));
        list.add(new Employee(4, "alex", 33, "ABC"));
        list.add(new Employee(3, "ram", 33, "PQR"));
        list.add(new Employee(2, "harish", 34, "PQR"));
        list.add(new Employee(6, "laxman", 42, "XYZ"));
        list.add(new Employee(7, "alok", 42, "XYZ"));


        Map<String, Double> collect = list.stream()
                .collect(Collectors.groupingBy(Employee::getGrade,
                        Collectors.averagingInt(Employee::getAge)));

        System.out.println(collect);

        /*
            Print the square of even numbers from given array {1,2,3,4,5,6,7,8,9,10}?
         */
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(squareGivenNumber(arr)));


        /*
        Given an array, find the pairs of numbers, whose sum = 11

        {0, 14, 0, 4, 7, 8, 3, 5, 7}?
         */
        int[] values = {0, 14, 0, 4, 7, 8, 3, 5, 7};
        int target = 11;
        //System.out.println(Arrays.toString(targerIndex(values, target)));

        Set<List<Integer>> pairs = findPairs(values, target);
        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }


    }

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee {
    int id;
    String name;
    int age;
    String grade;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Cars {

    String carName;
    String model;
    int price;
}
