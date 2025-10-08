package com.programming.array;

public class FindNumberAppearingOnce {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        int ans = findNumberAppearingOnce(arr);
        System.out.println(ans);
    }
    private static int findNumberAppearingOnce(int[] arr) {
        // 1st approach will be, 2 loops to find element whose count is 1
        // 2nd approach will be using map

        // this is the optimal approach as we are neither using extra space nor extra loops
        int xor = 0;
        for(int i:arr){
            xor ^= i;
        }
        return xor;
    }
}
