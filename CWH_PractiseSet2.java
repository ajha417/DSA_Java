package com.company;

import java.util.Scanner;

public class CWH_PractiseSet2 {
     static void multiplicationTable(byte n){
         for(int i=1;i<=10;i++){
             System.out.println(n+"X"+i+"="+n*i);
         }
     }
     static  void starPattern(int n){
         for(int i=0;i<n;i++){
             for(int j=0;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
     }
     static int findSum(int n){
//         int sum=0;
         if(n==1){
             return 1;
         }

             return n + findSum(n-1);


     }
     static void printPattern(int n){
         for(int i=0;i<n;i++){
             for(int j=n;j>i;j--){
                 System.out.print("*");
             }
             System.out.println();
         }
     }
     static void findFibonnaci(int term){
         int n1=0;
         int n2=1;
         int n3;
         int count=2;
         System.out.println(n1);
         System.out.println(n2);
         while(count<term){
             n3=n1+n2;
             n1=n2;
             n2=n3;
             System.out.println(n3);
             count++;
         }
     }
     static int findResult(int ...arr){
         int sum=0;
         int l=arr.length;
         for(int a:arr){
             sum=sum+a;
         }
         return sum/l;
     }
static void printPattern1(int n){
         if(n>0){
             printPattern(n-1);
             for(int i=n;i>0;i--){
                 System.out.print("*");
             }
             System.out.println();
         }
}
    public static void main(String[] args) {
        //Question number 1
        //write a java method to print multiplication table of number n
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the number you want table of: ");
        //byte n= sc.nextByte();
       // multiplicationTable(n);



        //Question Number 2
        //Write a program to print the following pattern
       // System.out.println("Enter the number of rows:");
        //int row= sc.nextInt();
        //starPattern(row);



        //Question NUmber 3
        //Write a recursive function to find the sum of first n numbers
      /*  System.out.println("Enter any number:");
        int n= sc.nextInt();
      int result=  findSum(n);
        System.out.format("The sum of %d  id %d",n,result);
*/


        //Question number 4
        //Write a java method to print the following pattern
       /* System.out.println("Enter the number of rows:");
        int row= sc.nextInt();
        printPattern(row);

        */


        //Question number 5
        //write a program to find nth term of fibonacci series

       /* System.out.println("Enter the number of term:");
        int term= sc.nextInt();
        findFibonnaci(term);

        */


        //Question number 6
        //write a program to find the average of numbers passed as arguments to it
      /*  int res=findResult(23,45,78,21,34,54);
        System.out.println("The average is :"+res);

       */

        //Question Number 7
        //Write a recursive method to print the star pattern
        System.out.println("Enter the number of rows:");
        int rows= sc.nextInt();
        printPattern1(rows);
    }
}
