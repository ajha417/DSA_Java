package com.programming.array;

import java.util.ArrayList;
import java.util.List;

public class AdjacentIncreasingSubArrayDetectionI {
    public static void main(String[] args) {
        /*Given an array nums of n integers and an integer k, determine whether there exist two adjacent subarrays of length k such that both subarrays are strictly increasing. Specifically, check if there are two subarrays starting at indices a and b (a < b), where:

Both subarrays nums[a..a + k - 1] and nums[b..b + k - 1] are strictly increasing.
The subarrays must be adjacent, meaning b = a + k.
Return true if it is possible to find two such subarrays, and false otherwise.*/
        int[] arr = {2,5,7,8,9,2,3,4,3,1};
        int k = 3;
        System.out.println(hasIncreasingSubarrays(arr, k));
    }
    private static boolean hasIncreasingSubarrays(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        if(k <= 0 || k > arr.length) return false;
        for (int i = 0; i <= arr.length - k; i++) {
            if(isIncreasing(arr, i, k)) {
                list.add(i);
            }
        }
        for(int idx: list) {
            if(list.contains(idx + k)) return true;
        }
        return false;
    }

    private static boolean isIncreasing(int[] arr, int i, int k) {
        for (int j = i + 1; j < i + k; j++) {
            if(arr[j] < arr[j - 1]) return false;
        }
        return true;
    }
}
