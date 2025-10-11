package com.leetcode;

import java.util.Arrays;

public class MaximumTotalDamageWithSpellCasting {
    public static void main(String[] args) {
//        A magician has various spells.
//
//        You are given an array power, where each element represents the damage of a spell. Multiple spells can have the same damage value.
//
//        It is a known fact that if a magician decides to cast a spell with a damage of power[i], they cannot cast any spell with a damage of power[i] - 2, power[i] - 1, power[i] + 1, or power[i] + 2.
//
//        Each spell can be cast only once.
//
//        Return the maximum possible total damage that a magician can cast.

        int[] powers = {1,1,3,4};
        long totalDamage = maximumTotalDamage(powers);
        System.out.println(totalDamage);
    }

    private static long maximumTotalDamage(int[] powers) {
        Arrays.sort(powers);
        int n = powers.length;
        int j = 0;
        long max = 0;
        long[] dp = new long[n + 1];
        for(int i = 0; i < n; i++) {
            if (i > 0 && powers[i] == powers[i - 1]) {
                dp[i + 1] = dp[i] + powers[i];
            } else {
                while(j < i && powers[j] + 2 < powers[i]) {
                    max = Math.max(max, dp[++j]);
                }
                dp[i + 1] = max + powers[i];
            }
        }

        long result = 0;
        for(long x : dp) {
            result = Math.max(result, x);
        }
        return result;
    }
}
