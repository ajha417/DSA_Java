package com.programming.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,0,3};
        int k = 3;
        int longestLength = findLongestSubArrayWithSumK(arr, k);
        System.out.println(longestLength);
    }
    private static int findLongestSubArrayWithSumK(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (sum == k) {
                length = i + 1;
            }
            if(map.containsKey(sum - k)){
                length = Math.max(length, i - map.get(sum - k));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return length;
    }
}
