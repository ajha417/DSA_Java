package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trailing_zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int n = Integer.parseInt(br.readLine());
//        System.out.println(n);
        //here we have to find the no of trailing zeros in the result of the factorial
        int res=0;
        for (int i = 5; i <=n ; i=i*5) {
            res = res + n/i;
        }
        long fact=1;
        for (int i = n; i >=1 ; i--) {
            fact *=i;
        }
        System.out.println(fact);
        System.out.println("The number of trailing zeros is: "+res);
    }
}
