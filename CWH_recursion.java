package com.company;

import java.util.Scanner;

public class CWH_recursion {
    static int factorial(int x){
        if(x==0||x==1){
            return 1;
        }
        else{
            return  x * factorial(x-1);
        }
    }
    public static void main(String[] args) {
        //this is the tutorial for recursion
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
       int result=factorial(n);
        System.out.format("The factorial of %d is %d",n,result);


    }
}
