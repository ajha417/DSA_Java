package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println( lengthOfLongestSubstring(s));

    }

    private static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(j < s.length()) {
            if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) >= i) {
                i = map.get(s.charAt(j)) + 1;
            }
            int length = j - i + 1;
            maxLen = Math.max(maxLen, length);
            map.put(s.charAt(j), j);
            j++;
        }
        return maxLen;
    }
}
