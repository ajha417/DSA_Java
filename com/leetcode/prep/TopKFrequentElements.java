package com.leetcode.prep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
//        Given an integer array nums and an integer k, return the k most frequent elements.
//        You may return the answer in any order.
        int[] result = topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // It will serve the element whose frequency is more in the map
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            maxHeap.offer(entry);
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            assert entry != null;
            result[i] = entry.getKey();
        }
        return result;
    }
}
