package com.leetcode.prep;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxWaterStored = findMaxWater(height);
        System.out.println(maxWaterStored);
    }

    private static int findMaxWater(int[] height) {

        int max = -1;
//        the time complexity here will be O(N*N)
//        for(int i = 0; i < height.length; i++) {
//            for(int j = i + 1; j < height.length; j++) {
//                int minHeight = Math.min(height[i], height[j]);
//                int waterStored = minHeight * (j - i);
//                max = Math.max(max, waterStored);
//            }
//        }

//        Optimized approach
        int right = height.length - 1;
        int left = 0;
        while(left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            int minHeight = Math.min(leftHeight, rightHeight);
            int waterStored = minHeight * (right - left);
            max = Math.max(max, waterStored);
            if(leftHeight < rightHeight) left++;
            else right--;
        }
        return max;
    }
}
