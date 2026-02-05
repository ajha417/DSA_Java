package com.leetcode.prep;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {

//        You are given a string s and an integer k.
//        You can choose any character of the string and change it to any other uppercase English character.
//        You can perform this operation at most k times.
//
//        Return the length of the longest substring containing the same letter,
//        you can get after performing the above operations.
//
//
//
//        Example 1:
//
//        Input: s = "ABAB", k = 2
//        Output: 4
//        Explanation: Replace the two 'A's with two 'B's or vice versa.
//        Example 2:
//
//        Input: s = "AABABBA", k = 1
//        Output: 4
//        Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
//                The substring "BBBB" has the longest repeating letters, which is 4.
//        There may exists other ways to achieve this answer too.

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
