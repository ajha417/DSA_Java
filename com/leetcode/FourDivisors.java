package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FourDivisors {
    public static void main(String[] args) {
/*        Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors. If there is no such integer in the array, return 0.



        Example 1:

        Input: nums = [21,4,7]
        Output: 32
        Explanation:
        21 has 4 divisors: 1, 3, 7, 21
        4 has 3 divisors: 1, 2, 4
        7 has 2 divisors: 1, 7
        The answer is the sum of divisors of 21 only.
                Example 2:

        Input: nums = [21,21]
        Output: 64
        Example 3:

        Input: nums = [1,2,3,4,5]
        Output: 0*/

        int[] nums = {21,4,7};
        int sum = sumFourDivisors(nums);
        System.out.println("The sum of the number which has exactly four divisors is:" + sum);
    }
    public static int sumFourDivisors(int[] nums) {
        // int ans = 0;
        // for(int num: nums) {
        //     if(hasFourDivisors(num).get("hasFourDivisors") == 1) {
        //         ans += hasFourDivisors(num).get("sum");
        //     }
        // }
        // return ans;

        int sum = 0;
        for (int n : nums) {
            int last_d = 0;
            for (int d = 2; d * d <= n; ++d) {
                if (n % d == 0) {
                    if (last_d == 0)
                        last_d = d;
                    else {
                        last_d = 0;
                        break;
                    }
                }
            }
            if (last_d > 0 && last_d != n / last_d) {
                sum += 1 + n + last_d + n / last_d;
            }
        }
        return sum;
    }
    private static Map<String, Integer> hasFourDivisors(int num) {

        int count = 0;
        int sum = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                count++;
                sum += i;
            }
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("sum", sum);

        map.put("hasFourDivisors", count == 4 ? 1: 0);
        return map;
    }
}
