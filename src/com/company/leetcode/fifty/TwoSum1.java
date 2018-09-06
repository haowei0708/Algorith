package com.company.leetcode.fifty;

import java.util.HashMap;

public class TwoSum1 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        TwoSum1 twoSum = new TwoSum1();
        int[] result = twoSum.twoSum(nums, 26);
        System.out.println("[index0:" + result[0] + "index1:" + result[1]);
        int[] result2 = twoSum.twoSum2(nums, 9);
        System.out.println("[index0:" + result2[0] + "index1:" + result2[1]);
    }

    // method one
    private int[] twoSum(int[] nums, int target) {
        int[] tmp = new int[2];
        if (nums == null || nums.length < 2) {
            return tmp;
        }

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                if (a + b == target) {
                    tmp[0] = i;
                    tmp[1] = j;
                    return tmp;
                }
            }
        }

        return tmp;
    }

    // method two
    private int[] twoSum2(int[] nums, int target) {
        int[] tmp = new int[2];
        if (nums == null || nums.length < 2) {
            return tmp;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                tmp[1] = i;
                tmp[0] = map.get(target - nums[i]);
            }
        }

        return tmp;
    }
}
