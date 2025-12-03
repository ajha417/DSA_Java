package com.leetcode;

import java.util.Arrays;

public class CountPalidromeOf3Length {
    public static void main(String[] args) {
        /*
        *
        * Given a string s, return the number of unique palindromes of length three that are a subsequence of s.

Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.

A palindrome is a string that reads the same forwards and backwards.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
        * */
        String s = "aabca";
        int ans = countPalindromicSubsequence(s);
        System.out.println(ans);
    }

    private static int countPalindromicSubsequence(String s) {
        int[] last = new int[26];
        int[] first = new int[26];
        int result = 0;
        Arrays.fill(first, Integer.MAX_VALUE);
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            last[index] = i;
            first[index] = Math.min(first[index], i);
        }

        for(int i = 0; i < 26; i++) {
            if(first[i] < last[i]) {
                result += (int) s.substring(first[i] + 1, last[i]).chars().distinct().count();
            }
        }
        return result;
    }
}
