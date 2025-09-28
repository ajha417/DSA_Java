package com.programming.array;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int []arr = new int[]{1,0,2,0,3,4,0};
        moveAllZerosToEnd(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    private static void moveAllZerosToEnd(int[] arr) {
        int j = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return;
        for(int i = j + 1; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
