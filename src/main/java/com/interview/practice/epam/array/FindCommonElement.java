package com.interview.practice.epam.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindCommonElement {


    public static int[] findCommonElements(int[]... arrays) {
        Set<Integer> commonElements = new HashSet<>();

        // Add elements of the first array to the set
        for (int num : arrays[0]) {
            commonElements.add(num);
        }

        // Iterate over the remaining arrays and retain common elements
        for (int i = 1; i < arrays.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int num : arrays[i]) {
                set.add(num);
            }
            commonElements.retainAll(set);
        }

        // Convert the set to an array
        return commonElements.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {

        int intarr1[] = {1, 5, 10, 20, 40, 80};
        int intarr2[] = {5, 6, 7, 20, 30, 40, 50, 80};
        int intarr3[] = {3, 4, 15, 20, 30, 40, 50, 60, 77, 80};
        int intarr4[] = {3, 4, 15, 20, 30, 40, 50, 60, 77, 78, 79, 80};
        int intarr5[] = {3, 4, 15, 20, 30, 40, 50, 60, 64, 65, 69, 77, 78, 79, 80};

        int[] commonElementsArray = findCommonElements(intarr1, intarr2, intarr3, intarr4, intarr5);

        System.out.println("Common elements: " + Arrays.toString(commonElementsArray));
    }
}

