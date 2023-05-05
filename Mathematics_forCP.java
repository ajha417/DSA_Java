package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Mathematics_forCP {
    public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter the range:");
        n=sc.nextInt();
            boolean []isPrime =seiveOfEratoSthenes(n);
        for (int i = 2; i <=n ; i++) {
            if (isPrime[i]==true){
                System.out.println(i);
            }*/
//        System.out.println("Enter the number1:");
//        int a= sc.nextInt();
//            System.out.println("Enter the number2: ");
//            int b = sc.nextInt();
//            int result =findGcd(a,b);
//            System.out.println("The gdc of "+a+" and "+b+" is "+result);
        System.out.println("Enter the first number:");
        int a= sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        long result=fastpower(a,b,10000000);
        System.out.println("The answer is "+result);
        }

        public static int findGcd(int a,int b){
        if(b==0){
            return  a;
        }
        return findGcd(b,a%b);
        }
        public  static long fastpower(int a,int b,int n){
        long result=1;
        while(b>0){
        if((b&1)!=0){   //here the last bit of odd number is 1 and operation with 1 gives 1 which is not equal to 0 so it is odd number case
            result = (result%n *a%n)%n;   //this method is used to find the result for number having more index power which can exceed the limit of int
        }
        a= (a%n*a%n)%n;
        b=b>>1;     //if we right shift by one it means it is divided by 2 and left shift means if is multiplied by 2
        }
        return result;
        }
        public static boolean[] seiveOfEratoSthenes(int n){    //here we are taking boolean array
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for (int i=2;i*i<=n;i++){
            for(int j=i*2;j<=n;j+=i){
                isPrime[j]=false;
            }
        }
        return isPrime;
        }
//        public static  int
    }

