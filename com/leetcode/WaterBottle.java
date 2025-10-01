package com.leetcode;

public class WaterBottle {
    public static void main(String[] args) {
        /*There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

        The operation of drinking a full water bottle turns it into an empty bottle.

        Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

         */
        int numBottles = 9;
        int numExchange = 3;
        System.out.println(numWaterBottles(numBottles, numExchange));

    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0;
        while(numBottles >= numExchange) {
            int result = numBottles / numExchange;

            ans += numExchange * result;
            numBottles -= numExchange * result;
            numBottles += result;
        }
        return ans + numBottles;
    }
}
