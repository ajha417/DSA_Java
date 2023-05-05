package com.company;

import java.util.Scanner;

public class Missing_number {
   public static int missingnumber(int []arr,int n){
        int count=0;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            count++;
            if(count<arr[i]){
                flag=1;
                break;
            }

        }
        if(flag==1){
            return count;
        }
        return ++count;
    }
    public static void main(String[] args) {
        int array[]=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        int n=6;
        int result=missingnumber(array,n);
        System.out.println("The  missing number is "+result);
    }
}
