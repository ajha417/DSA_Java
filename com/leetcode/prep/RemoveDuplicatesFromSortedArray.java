package com.leetcode.prep;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums2 = {1,1,2};
        int result = removeDuplicates(nums2);
        System.out.println(result);
    }

    private static int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i =1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) continue;
            else count++;
        }
        return count + 1;
    }
}
