package com.leetcode.prep;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4, 0, -1, 2, 8, -12, 5, 9};

        int ans = maxProduct(nums);
        System.out.println(ans);
    }

    private static int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
//        for(int i = 0; i < nums.length; i++) {
//            int currProduct = 1;
//            for(int j = i; j < nums.length; j++) {
//                currProduct *= nums[j];
//                maxProduct = Math.max(maxProduct, currProduct);
//            }
//        }

        // iterating from both ways
        int prefixProduct = 1, suffixProduct = 1;
        for(int i = 0;i < nums.length; i++) {
            if (prefixProduct == 0) prefixProduct = 1;
            else if(suffixProduct == 0) suffixProduct = 1;
            prefixProduct *= nums[i];
            suffixProduct *= nums[nums.length - 1 - i];
            maxProduct = Math.max(maxProduct, Math.max(prefixProduct, suffixProduct));
        }

        return maxProduct;
    }
}
