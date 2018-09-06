package com.company.leetcode.fifty;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int[] result = twoSum(nums, 26);
        System.out.println("[index0:" +result[0] + "index1:" + result[1]);
    }

    // method one
    public static int[] twoSum(int[] nums, int target) {
        int[] tmp = new int[2];
        if(nums == null || nums.length < 2) {
            return tmp;
        }

        for(int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                if(a + b == target) {
                    tmp[0] = i;
                    tmp[1] = j;
                    return tmp;
                }
            }
        }

        return tmp;
    }
}
