package com.leetcode.prep;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        int length = lengthOfLongestRepeatingCharacterReplacement(s, k);
        System.out.println(length);
    }

    private static int lengthOfLongestRepeatingCharacterReplacement(String s, int k) {
        int l = 0, r = 0;
        int[] hash = new int[26];
        int maxLength = 0;
        int maxF = 0;
        while(r < s.length()) {
            char c = s.charAt(r);
            hash[c - 'A']++;
            maxF = Math.max(maxF, hash[c - 'A']);
            while((r - l + 1) - maxF > k) {
                char cl = s.charAt(l);
                hash[cl - 'A']--;
                maxF = 0;
                for(int i = 0; i < 26; i++) {
                    maxF = Math.max(maxF, hash[i]);
                }
                l++;
            }
            if ((r - l + 1) - maxF <= k) {
                maxLength = Math.max(maxLength, r - l + 1);
                r++;
            }
        }
        return maxLength;
    }
}
