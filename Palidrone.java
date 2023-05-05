package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Palidrone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number:");
        int n = Integer.parseInt(br.readLine());
        int temp=n;
        int res=0,r;
        while(temp>0){
            r=temp%10;
            res = res *10 + r;
            temp = temp/10;
        }
        if(res==n)
            System.out.println("It is palidrone number");
        else
            System.out.println("It is not palidrone number");
    }
}
