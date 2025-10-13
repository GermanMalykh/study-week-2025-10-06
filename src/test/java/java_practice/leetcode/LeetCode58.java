package java_practice.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/length-of-last-word/description/
public class LeetCode58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy")); // 6
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println(lengthOfLastWord("a")); // 1
        System.out.println(lengthOfLastWord(" ")); // 0

    }

    static int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }
}
