package com.company;

import java.util.Random;
import java.util.Scanner;

public class ScissorGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r= new Random();
        int count=0;
        int co=0;
        int ci=0;
        System.out.println("Welcome to Scissors paper rock game");
        System.out.println("____________________________________________________________________________________________");
        System.out.println("There will be series of 5 games and the winner will be decided");
        System.out.println("Press 0 for rock 1 for paper and 2 for scissors");
        while(count<=5){

            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            int computerInput=r.nextInt(3);
            if(choice==computerInput){
                System.out.println("The game is drawn");
            }
            else if((choice==0 && computerInput==2)||(choice==1 && computerInput==0)||(choice==2 && computerInput==1))
            {
                System.out.println("You won this game");
                ci=ci+1;
            }
            else{
                System.out.println("Computer won this game");
                co=co+1;
            }
            if(computerInput==0){
                System.out.println("computer has chosen rock");
            }
            else if(computerInput==1){
                System.out.println("computer has chosen paper");
            }
            else{
                System.out.println("Computer has chosen scissors");
            }
            count=count+1;

        }
        System.out.println("___________________________");
        if(co>ci){
            System.out.println("The computer has won the series");
        }
        else if(ci>co){
            System.out.println("You have won the series");

        }
        else{
            System.out.println("The series was drawn");
        }
    }
}
