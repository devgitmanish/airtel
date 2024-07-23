package com.interview.practice.LeetCodeArray.tough;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrayAndRemoveDuplicate {

    public static void SortArray(int a[], int b[], int res[], int n, int m) {
        int i=0, j=0, k=0;
        while (i < n){
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            res[k] = b[j];
            j++;
            k++;
        }
        Arrays.sort(res);
    }

    static int removeDuplicates(int res[], int a){

        if(a == 0 || a ==1 ){
            return a;
        }
        int j= 0 ;
        for(int i= 0; i <a-1; i++ ) {
            if (res[i] != res[i + 1])
                res[j++] = res[i];
        }
        res[j++] = res [a-1];

        return j;
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 7, 2, 8, 9};

        int res[] = new int[ a.length + b.length];
        SortArray(a, b, res, a.length, b.length);

        System.out.println("Sorted merged list : "+ Arrays.toString(res));

        int unique = res.length;
        unique=removeDuplicates(res, unique);

        System.out.println("Printing element after removing duplicates");
        for (int i=0; i<unique; i++){
            System.out.print (res[i]+" ");
        }
    }
}
