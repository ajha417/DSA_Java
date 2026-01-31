package com.leetcode.prep;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithSumK {
    public static void main(String[] args) {
        int target = 2;
        int[] nums = {1,1,1};
        // need to find the total number of subarrays whose sum is equal to k

        int ans = subArraySum(nums, target);
        System.out.println(ans);
    }

    private static int subArraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for(int i = 0; i  < nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
