package com.leetcode.prep;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    private static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        for(int i = 0; i < k; i++) {
            int temp = nums[n - (k - i)];
            nums[n - (k - i)] = nums[i];
            nums[i] = temp;
        }
    }
}
