package com.programming.array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int []arr1={1,2,3,3,4,5,6,7,8};
        int []arr2={2,3,3,4,5,6,7,8,9};
        List<Integer> ans = findIntersectionOfTwoSortedArray(arr1, arr2, arr1.length, arr2.length);
        System.out.println(ans);
    }

    private static List<Integer> findIntersectionOfTwoSortedArray(int[] arr1, int[] arr2, int n, int m) {
        List<Integer> ans = new ArrayList<>();
        // This is the brute force approach
//        boolean[] visited = new boolean[m];
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < m; j++) {
//                if(arr1[i] == arr2[j] && !visited[j]) {
//                    ans.add(arr1[i]);
//                    visited[j] = true;
//                    break;
//                }
//                if (arr2[j] > arr1[i]) break;
//            }
//        }

        //optimal approach
        int i = 0, j = 0;
        while(i < n && j < m) {
            if(arr1[i] < arr2[j]) {
                i++;
            } else if(arr1[i] > arr2[j]) {
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
