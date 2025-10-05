package com.leetcode;
import java.util.*;

public class AvoidFloodInTheCity {
    public static void main(String[] args) {
        int[] rains = new int[]{1,2,0,0,2,1};
        int[] ans = avoidFlood(rains);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] avoidFlood(int[] rains) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[rains.length];
        List<Integer> driedIndices = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < rains.length; i++) {
            if(rains[i] == 0) {
                driedIndices.add(i);
                map.put(0, map.getOrDefault(0, 0) + 1);
                ans[i] = 0;
            }
            else if(map.containsKey(rains[i])) {
                if(map.containsKey(0)) {
                    ans[driedIndices.get(count)] = rains[i];
                    count++;
                    map.put(rains[i], map.get(rains[i]) - 1);
                    map.put(0, map.get(0) - 1);
                    ans[i] = -1;
                } else {
                    return new int[0];
                }
            } else {
                map.put(rains[i], 1);
                ans[i] = -1;
            }
        }
        return ans;
    }
}
