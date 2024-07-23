package com.interview.practice.LeetCodeArray.interview;


/* PROBLEM STATEMENT : MERGE TWO SORTED ARRAY
 * Q : Given two sorted integer array nums1 and nums2 merge nums2 in to nums1
 * as one sorted array ?
 *
 *Note :
 * (1) the number of element initialized in nums1 and nums2 are m and n respectively.
 * (2) You may assume that nums1 has enough space (size that is equal to m+n) to hold
 * additional elements from nums2.
 * */
//        p1
//  1, 2, 3, 0, 0, 0
//  2, 5, 6
//        p2

//TimeComplexity 0(m+n)

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void mergeTwoArray(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;

        for (int index = nums1.length - 1; index >= 0; index--) {

            int valAtP1 = p1 >= 0 ? nums1[p1] : Integer.MIN_VALUE;
            int valAtP2 = p2 >= 0 ? nums2[p2] : Integer.MIN_VALUE;

            if (valAtP1 > valAtP2) {
                nums1[index]=valAtP1;
                p1--;
            } else {
                nums1[index] = valAtP2;
                p2--;
            }
        }
        System.out.println("Merged Sorted Array "+ Arrays.toString(nums1));
    }

    public static void main(String[] args) {

        int [] nums1 = {1, 2, 3, 0, 0, 0};
        int [] nums2 = {2, 5, 6};
        mergeTwoArray(nums1, 3, nums2, 3);
    }
}

