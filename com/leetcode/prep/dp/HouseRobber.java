package com.leetcode.prep.dp;

public class HouseRobber {
    public static void main(String[] args) {
//        You are a professional robber planning to rob houses along a street.
//        Each house has a certain amount of money stashed. All houses at this place are arranged in a circle.
//        That means the first house is the neighbor of the last one.
//        Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police
//        if two adjacent houses were broken into on the same night.
//
//        Given an integer array nums representing the amount of money of each house,
//        return the maximum amount of money you can rob tonight without alerting the police.

        int[] nums = {2, 3, 2};
        System.out.println(rob(nums));
    }

    private static int rob(int[] nums) {
        int n = nums.length;
        return Math.max(robHouse(nums, 0, n - 2), robHouse(nums, 1, n - 1));
    }

    private static int robHouse(int[] nums, int start, int end) {
        int include = 0, exclude = 0;
        for(int j = start; j <= end; j++) {
            int i = include, e = exclude;
            include = e + nums[j];
            exclude = Math.max(i, e);
        }
        return Math.max(include, exclude);
    }
}
