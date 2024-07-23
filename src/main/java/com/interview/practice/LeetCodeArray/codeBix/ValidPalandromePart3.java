package com.interview.practice.LeetCodeArray.codeBix;

public class ValidPalandromePart3 {

    public static boolean checkValidPalandrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (!isAlphanumeric(str.charAt(left))) {
                left++;
            }
            else if (!isAlphanumeric(str.charAt(right))) {
                right--;
            }
            else if (!convertCharToString(str.charAt(left))
                    .equalsIgnoreCase(convertCharToString(str.charAt(right)))) {
                return false;

            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    private static boolean isAlphanumeric(char value) {
        return ('a' <= value && value <= 'z')
                || ('A' <= value && value <= 'Z')
                || ('0' <= value && value <= '9');
    }

    private static String convertCharToString(Character ch) {
        return String.valueOf(ch);
    }


    public static void main(String[] args) {

        String str = "RA!CEca$r";
        boolean result = checkValidPalandrome(str);
        if (result)
            System.out.println("valid palandrome string");
        else
            System.out.println("not valid palandrome string");

    }
}
