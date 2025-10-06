package java_practice.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/description/
public class LeetCode27 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int k = removeElement(nums, val);
        System.out.println("k = " + k + ", " + pretty(nums, k));
        // [0, 1, 3, 0, 4, _, _, _]
    }

    static int removeElement(int[] nums, int val) {
        int uniqueElements = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[uniqueElements] = nums[i];
                uniqueElements++;
            }
        }
        return uniqueElements;
    }

    static String pretty(int[] nums, int k) {
        String[] out = new String[nums.length];
        Arrays.fill(out, "_");
        for (int i = 0; i < k; i++) {
            out[i] = Integer.toString(nums[i]);
        }
        return Arrays.toString(out);
    }

}
