package com.interview.practice.LeetCodeArray.leetcode;
/* TC o(n) */
public class JumpGame {

    public static boolean jumpGame(int [] nums){

        if(nums.length==1) return true;

        int reachable=0;

        for(int index=0; index<nums.length && index <= reachable ; index++){

            reachable = Math.max(reachable, index + nums[index]);

            if(reachable >= nums.length-1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};
        System.out.println(jumpGame(nums));
    }
}
