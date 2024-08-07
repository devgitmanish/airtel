package com.interview.practice.sapient.coderpad.done;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianTwoSortedArray {

    private static int[] mergeArrays(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];

        int i=0, j=0, k=0;
        while (i < a.length){
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            res[k] = b[j];
            j++;
            k++;
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static double median(int [] sortedArr){
        int length = sortedArr.length;
        double median;
        if (length % 2 == 0) {
            int index1 = length / 2;
            int index2 = index1 + 1;
            //index -1 because array index starts with o
            median = (sortedArr[index1 - 1] + sortedArr[index2 - 1]) / 2.0;
        } else {
            int index = (length / 2) + 1;
            median = sortedArr[index - 1];
        }
        return median;
    }

    public static void main(String[] args) {
        int a[] = {9,8,10,10,1};
        int b[] = {81,71,1,4};
        //[1, 1, 4, 8, 9, 10, 10, 71, 81]
        int [] sortedArray = mergeArrays(a,b);
        median(sortedArray);
    }
}
