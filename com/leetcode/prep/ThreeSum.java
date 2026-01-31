package com.leetcode.prep;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }
    private static List<List<Integer>> threeSum(int[] nums) {
        //brute force approach
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = i + 1; j < nums.length; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> list = new ArrayList<>();
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[k]);
//                        set.add(list);
//                    }
//                }
//            }
//        }

        // optimized approach

        for(int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                if(nums[left] + nums[right] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    set.add(list);
                    left++; right--;
                } else if(nums[left] + nums[right] < target) left++;
                else right--;
            }
        }
        return set.stream().toList();
    }
}
