package com.leetcode.prep;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int trappedWater = trap(height);
        System.out.println("TrappedWater units::" + trappedWater);
    }

    private static int trap(int[] height) {
        int n = height.length;
//        int[] prefixMax = new int[n];
//        int[] suffixMax = new int[n];
//        prefixMax[0] = height[0];
//        suffixMax[n - 1] = height[n - 1];
//        for(int i = 1; i < n; i++) {
//            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
//            suffixMax[n - i - 1] = Math.max(suffixMax[n - i], height[n - i - 1]);
//        }
//        int total = 0;
//        for(int i = 0; i < n; i++) {
//            if(height[i] < prefixMax[i] && height[i] < suffixMax[i]) {
//                total += Math.min(prefixMax[i], suffixMax[i]) - height[i];
//            }
//        }

        // optimized solution
        int total = 0;
        int rMax = 0, lMax = 0, l = 0, r = n - 1;
        while(l < r) {
            if (height[l] <= height[r]) {
                if(lMax > height[l]) {
                    total += lMax - height[l];
                } else lMax = height[l];
                l++;
            } else {
                if(rMax > height[r]) {
                    total += rMax - height[r];
                } else rMax = height[r];
                r--;
            }
        }
        return total;
    }
}
