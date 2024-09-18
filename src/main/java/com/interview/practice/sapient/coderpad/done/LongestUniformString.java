package com.interview.practice.sapient.coderpad.done;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestUniformString {

    private static final Map<String, int[]> testCases = new HashMap<>();

    static int[] longestUniformSubstring(String input) {
        int longestStart = -1;
        int longestLength = 0;

        if (input == null || input.isEmpty()) {
            return new int[]{longestStart, longestLength};
        }

        int currentStart = 0;
        int currentLength = 1;

        for (int i = 1; i < input.length(); i++) {
            System.out.println(input.charAt(i));
            System.out.println(input.charAt(currentStart));
            if (input.charAt(i) == input.charAt(currentStart)) {
                currentLength++;
            } else {
                if (currentLength > longestLength) {
                    longestStart = currentStart;
                    longestLength = currentLength;
                }
                currentStart = i;
                currentLength = 1;
            }
        }

        // Final check at the end of the loop
        if (currentLength > longestLength) {
            longestStart = currentStart;
            longestLength = currentLength;
        }

        return new int[]{longestStart, longestLength};
    }

    public static void main(String[] args) {
        //testCases.put("", new int[]{-1, 0});
        //testCases.put("10000111", new int[]{1, 4});
        testCases.put("aabbbbbCdAA", new int[]{2, 5});

        boolean pass = true;
        for (Map.Entry<String, int[]> testCase : testCases.entrySet()) {
            int[] result = longestUniformSubstring(testCase.getKey());
            pass = pass && (Arrays.equals(result, testCase.getValue()));
        }
        if (pass) {
            System.out.println("Pass!");
        } else {
            System.out.println("Failed! ");
        }
    }
}
