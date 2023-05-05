package com.company;
import  java.util.Scanner;

import java.util.Scanner;

public class CWH_16_conditional {
    public static void main(String[] args) {
//        Scanner a = new Scanner(System.in);
//        System.out.println("Enter the age of Student:");
//        int age=a.nextInt();
//        if(age>=18)
//        {
//            System.out.println("You are allowed to watch movies");
//        }
//        else
//        {
//            System.out.println("You are not allowed to watch movies");
//        }
        boolean a=true;
        boolean b=true;
        boolean c=true;

//        logical and returns true only if all are true otherwise it returns false
//        if(a&&b&&c){
//            System.out.println("Yes it is true");
//        }
//        else{
//            System.out.println("NO is is not true");
//        }
//        but if we talk about logical or then it returns true if any one of the codition is true
    if(a || b || c){
        System.out.println("Yes it true by logical or");
    }
    else{
        System.out.println("No it is not true by logical or");
    }
    }
}
