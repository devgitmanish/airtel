package com.interview.practice.sortingAlgo;

public class BinarySearch {

    public static int binarySearchAlgo(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (low <= high) {

            mid = (low + high) / 2;

            if (key == arr[mid])
                return mid;
            else if (key < arr[mid])
                high = mid - 1;
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearchAlgoFindFirstOccourance(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int result = -1;

        while (low <= high) {

            mid = (low + high) / 2;

            if (key == arr[mid]) {
                result = mid;
                high = mid - 1;
            } else if (key < arr[mid])
                high = mid - 1;
            else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int key = 12;
        int[] arr = {3, 5, 6, 8, 12, 15, 16, 19, 21};
        int index = binarySearchAlgo(arr, key);
        System.out.println("key index value " + index);

        int key1 = 7;
        int[] arr1 = {3, 5, 6, 8, 7, 7, 7, 19, 21};
        int index1 = binarySearchAlgoFindFirstOccourance(arr1, key1);
        System.out.println("key index value " + index1);
    }
}
