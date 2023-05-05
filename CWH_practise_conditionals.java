package com.company;
import java.util.Scanner;
public class CWH_practise_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        this is the solution for question 1
//        System.out.println("Enter the marks of Physics:");
//        int phy = sc.nextInt();
//        System.out.println("Enter the marks of Chemistry:");
//        int che=sc.nextInt();
//        System.out.println("Enter the marks of computer:");
//        int com= sc.nextInt();
//        float per=(phy+che+com)/3.0f;
//        System.out.print("your percentage is:");
//        System.out.println(per);
//        if(per>=40 && phy>=33 && che>=33 && com>=33){
//            System.out.println("You are passed");
//        }
//        else{
//            System.out.println("You are failed");
//        }



//        question2

        System.out.println("Enter your income");
        float income= sc.nextFloat();
        float tax=0;
        if(income<2.5*100000){
            tax=tax+0;
        }
        if(income>=2.5*100000 && income<=5*100000 ){
            tax=tax+income*0.05f;
        }
        if(income>5*100000 && income<=10*100000){
            tax=tax+income*0.20f;
        }
        if(income>1000000){
            tax=tax+income*0.3f;
        }
        System.out.println("The income tax amount you have to pay is:");
        System.out.println(tax);
    }
}
