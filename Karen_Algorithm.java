package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public  class Karen_Algorithm{
    public static int findMax(int []arr){
        int maxItem=0;
        int curr_max=0;
        for (int i = 0; i < arr.length; i++) {
            curr_max = curr_max + arr[i];
            if(maxItem<curr_max){
                maxItem = curr_max;
            }
            if(maxItem<0){
                maxItem =0;
            }

        }
        return  maxItem;
    }
    public static void main(String[] args) {
        int []arr = new int[5];
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr1 = new ArrayList<>();
//        for(int i=0;i<5;i++){
//            arr1.add(sc.nextInt());
//
//        }
//        int arr2=findMax(arr1);
        System.out.println("Enter the values of arr:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result = findMax(arr);
        System.out.println("the result is "+result);
    }
}