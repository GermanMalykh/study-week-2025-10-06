package java_practice.leetcode;

//https://leetcode.com/problems/third-maximum-number/description/
public class LeetCode414 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 2, 1};
        int[] nums2 = new int[]{1, 2};
        int[] nums3 = new int[]{2, 2, 3, 1};
        int[] nums4 = new int[]{2, 2, 2, 1};
        Test s1 = new Test();
        Test s2 = new Test();
        Test s3 = new Test();
        Test s4 = new Test();
        System.out.println("Expected 1:" + s1.thirdMax(nums1));
        System.out.println("Expected 2:" + s2.thirdMax(nums2));
        System.out.println("Expected 1:" + s3.thirdMax(nums3));
        System.out.println("Expected 2:" + s4.thirdMax(nums4));
    }
}

class Test {
//    public int thirdMax(int[] nums) {
//        int thirdMaxNumber = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (thirdMaxNumber - 2 <= nums[i]) {
//                thirdMaxNumber = nums[i];
//            }
//        }
//        return thirdMaxNumber;
//    }

    public int thirdMax(int[] nums) {
        Integer first = null,
                second = null,
                third = null; // 3 уникальных максимума

        for (int x : nums) {
            // игнорируем дубликаты
            if ((first != null && x == first) ||
                    (second != null && x == second) ||
                    (third != null && x == third)) {
                continue;
            }

            if (first == null || x > first) {
                third = second;
                second = first;
                first = x;
            } else if (second == null || x > second) {
                third = second;
                second = x;
            } else if (third == null || x > third) {
                third = x;
            }
        }

        // если уникальных < 3 — вернуть максимум
        return third == null ? first : third;
    }
}
