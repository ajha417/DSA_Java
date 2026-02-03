package com.leetcode.prep;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int[] diff = new int[gas.length];

        for(int i = 0; i < gas.length; i++) {
            diff[i] = gas[i] - cost[i];
        }
        int totalGas = 0;
        int ans = -1;
        for(int i = 0; i < diff.length; i++) {
            totalGas += diff[i];
            if (totalGas < 0) {
                totalGas = 0;
                continue;
            }
            if (canReachDestination(totalGas, diff, i)) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }

    private static boolean canReachDestination(int totalGas, int[] diff, int index) {
        int n = diff.length;
        for(int i = index; i < diff.length + index - 1; i++) {
            totalGas += diff[i % n];
            if (totalGas < 0) return false;
        }
        return true;
    }

}
