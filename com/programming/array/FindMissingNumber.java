package com.programming.array;

public class FindMissingNumber {
    public static void main(String[] args) {
        // 1st approach using nested for loops keeping flag, if found flag = 1
        // if the flag remains 0, means that is the number which is missing

        //2nd approach will be using hash Array and where space complexity will be O(N) and TC will be O(2N)

        // the optimal approach will be using sum

        int[] arr = {1,2,3,5,6,7,8,9,10};

        int missingNumber = findMissingNumber(arr, 10);
        System.out.println(missingNumber);
    }
    private static int findMissingNumber(int[] arr, int N) {
        int sum = N*(N+1)/2;
        int s = 0;
        for(int i:arr){
            s += i;
        }
        return sum - s;
    }
}
