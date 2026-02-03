package com.leetcode.prep;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        String s = "III";

        int ans = convertToInteger(s, map);
        System.out.println(ans);
    }

    private static int convertToInteger(String s, Map<Character, Integer> map) {
        int ans = 0;
        if (s.length() == 1) return map.get(s.charAt(0));
        for(int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            char nextChar = s.charAt(i + 1);
            if (map.get(ch) < map.get(nextChar)) {
                ans -= map.get(ch);
            } else {
                ans += map.get(ch);
            }
        }
        ans += map.get(s.charAt(s.length() - 1));
        return ans;
    }
}
