package com.leetcode;

public class BinaryNumberWithBitManipulation {
    public static void main(String[] args) {
       /* Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.



        Example 1:

        Input: n = 5
        Output: true
        Explanation: The binary representation of 5 is: 101
        Example 2:

        Input: n = 7
        Output: false
        Explanation: The binary representation of 7 is: 111.
        Example 3:

        Input: n = 11
        Output: false
        Explanation: The binary representation of 11 is: 1011.*/


        int n = 5;
        boolean isAlternate = hasAlternatingBits(n);
        System.out.println(isAlternate);
    }
    private static boolean hasAlternatingBits(int n) {
//        We know that if we shift the number by 1 to the right,
//        all the ones will become zeros and vice versa.
//        Now if we AND those two numbers, we can get the whole thing as zero
//        but that won't work for numbers like 2, 4, 8... So we will take another approach.
//        Instead of AND we will do an XOR . This will make all bits 1.
//        Now we need to check if all the bits are 1. The best way to do that is AND the number by (number+1) .
//        It'll give you zero.
          /*
        n =         1 0 1 0 1 0 1 0
        n >> 1      0 1 0 1 0 1 0 1
        n ^ n>>1    1 1 1 1 1 1 1 1
        n           1 1 1 1 1 1 1 1
        n + 1     1 0 0 0 0 0 0 0 0
        n & (n+1)   0 0 0 0 0 0 0 0
        */
        n = n ^ (n >> 1);
        return (n & (n + 1)) == 0;
    }
}
