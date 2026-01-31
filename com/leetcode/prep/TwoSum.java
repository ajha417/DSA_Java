package com.leetcode.prep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // find the indices whose sum is equal to target

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        // brute force approach will be that iterating two loops to find the pair whose sum is equal to target

        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
               ans = new int[]{map.get(target - nums[i]), i};
               break;
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
