package com.leetcode.prep.dp;

import java.util.Arrays;

public class MaximumSumOfNonAdjacentElements {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 9};

        // top-down approach
        int[] dp = new  int[nums.length + 1];
        Arrays.fill(dp, -1);
        int maxValue = findMaxSum(nums, nums.length - 1, dp);
        System.out.println(maxValue);

        // bottom-up approach
        int[] dp2 = new int[nums.length];

        dp2[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int take = nums[i];
            if(i > 1) take += dp2[i - 2];
            int notTake = dp2[i - 1];
            dp2[i] = Math.max(take, notTake);
        }
        System.out.println(dp2[nums.length - 1]);
    }

    private static int findMaxSum(int[] nums, int i, int[] dp) {
        if(i == 0) return nums[i];
        if(i < 0) return 0;
        if(dp[i] != -1) return dp[i];
        int take = nums[i] + findMaxSum(nums, i - 2, dp);
        int nonTake = findMaxSum(nums, i - 1, dp);
        return Math.max(take, nonTake);
    }
}
