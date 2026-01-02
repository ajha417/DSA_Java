package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
    public static void main(String[] args) {
        /*
        *
        *   You are given an integer array nums with the following properties:

            nums.length == 2 * n.
            nums contains n + 1 unique elements.
            Exactly one element of nums is repeated n times.
            Return the element that is repeated n times.



            Example 1:

            Input: nums = [1,2,3,3]
            Output: 3
            Example 2:

            Input: nums = [2,1,2,5,3,2]
            Output: 2
            Example 3:

            Input: nums = [5,1,5,2,5,3,5,4]
            Output: 5
        *
        * */

        int[] nums = {1,2,3,3};
        int num = repeatedNTimes(nums);
        System.out.println(num);
    }

    public static int repeatedNTimes(int[] nums) {
        int requiredNum = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int val: nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() == requiredNum) {
                ans = entry.getKey();
                break;
            }
        }
        // for(Integer value: map.values()) {
        //     if(value >  1) {
        //         return
        //     }
        // }
        return ans;
    }
}
