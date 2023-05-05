package com.company;

import java.util.Scanner;

public class bit1 {
    public static void main(String[] args) {
//        int a=5;
//        int b=7;
//        a = a^b;  //here xor makes the process fast and swaps the two values
//        b=a^b;
//        a=a^b;
//        System.out.println(a);
//        System.out.println(b);

        //to find whether the number is odd or even
        /*Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        if((n&1)==0)   //the last bit of even number is always 0 bitwise and checks if the last bit is 0 or 1
            System.out.println("It is even number");
        else
            System.out.println("It is odd number");*/

        //find the only non-repeating element in an array where every element repeats twice
      /*  int n[]={5,1,3,5,1,4,4};
        int res=0;
        for(int i=0;i<n.length;++i){
         res=res^n[i];     //here xor makes 0 if two same element is found
        } //for example 5^5=0 1^1=0
        System.out.println(res);*/

        //find the two non-repeating element in an array where every element repeats twice
      /* int a[]={2,3,4,4,2,3,8,9};
       int res=0;
        for (int i = 0; i < a.length ; i++) {
            res = (res^a[i]);
        }
        res = (res & -res);
        int res1=0,res2=0;
        for (int i = 0; i < a.length; i++) {
            if((a[i]&res)>0)   //here it checks if the number is odd or not and later xor is done with the resultant number
                res1=(res1^a[i]);
            else
                res2=(res2^a[i]);   //here it checks if the number if even or not
        }
        System.out.println(res1);
        System.out.println(res2);*/

        //find the only non-repeating element in an array where every other element is repeating thrice
                    int a[]={5,4,4,4,5,5,3,3,3,1};
                    int k=3;
                    byte size_ofint=4;
                    int INT_SIZE=8*size_ofint;
                    int count[] = new int[INT_SIZE];
        for (int i = 0; i < INT_SIZE ; i++) {
            for(int j=0;j<a.length;++j){
                if((a[j]&(1<<i))!=0)
                    count[i]+=1;
            }
            int res=0;
            for(int j=0;i<INT_SIZE;++j){
                res+=(count[j]%k)*(1<<j);
            }
            System.out.println(res);
        }
    }
}
