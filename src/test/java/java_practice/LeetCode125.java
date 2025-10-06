package java_practice;

import java.util.Arrays;

//https://leetcode.com/problems/valid-palindrome/description/
public class LeetCode125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P0"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome(".,,!!"));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String inputString = s
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();
        String reversedString = String.valueOf(sb.reverse())
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();
        if (reversedString.equals(inputString)) {
            return true;
        } else {
            return false;
        }
    }
}
