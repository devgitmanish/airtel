package com.interview.practice.sapient.coderpad.done;
/*
Given a binary string, that is it contains only 0s and 1s.
 We need to make this string a sequence of alternate characters by
 flipping some of the bits, our goal is to minimize the number of bits to be flipped.
        Examples :

Input : str = “001”
Output : 1
Minimum number of flips required = 1
We can flip 1st bit from 0 to 1

Input : str = “0001010111”
               0101010101
Output : 2
Minimum number of flips required = 2
We can flip 2nd bit from 0 to 1 and 9th
bit from 1 to 0 to make alternate
string “0101010101”.
*/

public class BinaryAlternateFlipCount {

    public static int mainFlips(String str){

        int start_with_0 = 0;
        for(int i=0; i<str.length(); i++){
            if(i%2==0){ //Even
                if(str.charAt(i) == '0')
                    start_with_0++;
            }
            else {
                if(str.charAt(i) == '1')
                    start_with_0++;
            }
        }
        int start_with_1 = str.length() - start_with_0;
        return Math.min(start_with_0, start_with_1);
    }
    public static void main(String[] args) {
        int flip = mainFlips("10010100");
        System.out.println(flip);


    }
}
