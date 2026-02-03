package com.leetcode.prep.dp;

import java.util.Arrays;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean canJump = canJump(nums);
        System.out.println(canJump);
    }

    private static boolean canJump(int[] nums) {
//        Map<Integer, HashSet<Integer>> map = new HashMap<>();
//        for(int val: nums) {
//            map.put(val, new HashSet<>());
//        }
//        for (int i = 1; i < nums[0]; i++) {
//            map.get(nums[0]).add(i);
//        }
//
//        for(int i = 1; i < nums.length; i++) {
//            HashSet<Integer> jumps = map.get(nums[i]);
//            for(int jump: jumps) {
//                int nextJump = i + jump;
//                if(nextJump >= nums.length - 1) return true;
//                if (map.containsKey(nums[nextJump])) {
//                    for (int j = 1; j <= jump; j++) {
//                        map.get(nums[nextJump]).add(j);
//                    }
//                }
//            }
//        }
//        return false;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return create(nums, 0, dp);
    }

    private static boolean create(int[] nums, int ind, int[] dp) {
        if(ind == nums.length - 1) return true;
        if (nums[ind] == 0) return false;

        if (dp[ind] != -1) {
            return dp[ind] == 1;
        }
        int reach = ind + nums[ind];
        for (int jump = ind + 1; jump <= reach; jump++) {
            if (jump < nums.length && create(nums, jump, dp)) {
                dp[ind] = 1;
                return true;
            }
        }
        dp[ind] = 0;
        return false;
    }
}
