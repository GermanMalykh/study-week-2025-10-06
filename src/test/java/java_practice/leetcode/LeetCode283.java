package java_practice.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/
public class LeetCode283 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] test = new int[]{0, 1, 0, 3, 12};
        s.moveZeroes(test);
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int indexValue = nums.length - count;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        Arrays.fill(nums, count, indexValue, 0);
        System.out.println(Arrays.toString(nums));
    }
}
