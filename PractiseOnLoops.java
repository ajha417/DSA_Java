package com.company;

import java.util.Scanner;

public class PractiseOnLoops {
    public static void main(String[] args) {
//        int i;
//        int j;
//        for(i=0;i<=5;i++){
//            for(j=5;j>=i;j--){
//                System.out.print("* ");
//            }
//            System.out.println("\n");
//        }

        //Question number 2
        //write a program to print first sum n even numbers;
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the terms:");
//        int n=sc.nextInt();
//        int sum=0;
//        int i=0;
//        while(i<=n){
//            if(i%2==0){
//                sum=sum+i;
//            }
//            i++;
//        }
//        System.out.print("The answer is: ");
//        System.out.println(sum);

        //Question number 3 write a program to print the table of given number n

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of which you want table:");
////        System.out.println();
//        int n=sc.nextInt();
//        int i=1;
//        while(i<=10){
//            System.out.println(n+"*"+i+"="+n*i);
//            i++;
//        }


        //question number 4 write a program to print the table of 10 in reverse order
//        int i=10;
//        while(i>=1){
//            System.out.println(10+"*"+i+"="+10*i);
//            i--;


        //Question number 5 write a program to print factorial of giiven number
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number:");
//        System.out.println();
//        int n = sc.nextInt();
//        int fact=1;
//        for(int i=1;i<=n;i++){
//            fact=fact*i;
//    }
//        System.out.println("The factorial of given number is "+fact);

        int sum=0;
        int i=1;
        while(i<=10){
            sum=sum+(8*i);
            i++;
        }
        System.out.println("The answer is : "+sum);
    }
}
