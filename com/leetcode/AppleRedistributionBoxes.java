package com.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class AppleRedistributionBoxes {
    public static void main(String[] args) {
        /*
        *
        *   You are given an array apple of size n and an array capacity of size m.

            There are n packs where the ith pack contains apple[i] apples. There are m boxes as well, and the ith box has a capacity of capacity[i] apples.

            Return the minimum number of boxes you need to select to redistribute these n packs of apples into boxes.

            Note that, apples from the same pack can be distributed into different boxes.
        * */

        /*
        *
        *   Hint:

            1.find the sum of apple array
            2.sort the capacity array
            3.now count the number of boxes using your sum and capacity array
        * */
        int[] apples = {1, 3, 2};
        int[] capacity = {4, 2, 1, 5, 2};
        int minBoxes = minimumBoxes(apples, capacity);
        System.out.println(minBoxes);
    }

    public static int minimumBoxes(int[] apple, int[] capacity) {
        int appleSum = 0;
        for(int a: apple) {
            appleSum += a;
        }
        int boxCount = 0;
        Integer[] capArray = new Integer[capacity.length];
        for(int i = 0; i < capacity.length; i++) {
            capArray[i] = capacity[i];
        }
        Arrays.sort(capArray, Collections.reverseOrder());
        int capCount = 0;
        for(int cap: capArray) {
            capCount += cap;
            boxCount++;
            if(capCount >= appleSum) break;
        }
        return boxCount;
    }
}
