package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Please Enter a number:");
        int a = s.nextInt();
        int r;
        int temp=a;
        int sum=0;
        while(a>0){
            r=a%10;
            sum=sum*10+r;
            a=a/10;
        }
        System.out.println("The reverse of "+temp + " is "+sum);
    }
}
