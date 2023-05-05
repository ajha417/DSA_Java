package com.company;
import java.util.Scanner;
public class CWH_18_ladder_if {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your age:");
//        int age=sc.nextInt();
//        if(age>60){
//            System.out.println("you are very experienced");
//        }
//        else if(age>50){
//            System.out.println("You are semi-experienced");
//        }
//        else if(age>30)
//        {
//            System.out.println("you are mature now");
//        }
//        else{
//            System.out.println("You are still learning");
//        }
//        now we are going to learn about switch case
        System.out.println("press B for burger");
        System.out.println("Press P for pizza");
        System.out.println("Press V for veg Biryani");
        System.out.println("Press M for momos");
        System.out.println("Please enter your choice");
        char choice=sc.next().charAt(0);
        switch(choice){
            case 'B':
                System.out.println("Your order for Burger has been placed.Please wait for while");
                break;
            case 'P':
                System.out.println("Your order for pizza has been placed.Please wait for while");
                break;
            case 'V':
                System.out.println("Your order for Veg Biryani has been placed.Please wait for while");
                break;
            case 'M':
                System.out.println("Your order for Momos has been placed.Please wait for while");
                break;
            default:
                System.out.println("You have pressed wrong key.Please select valid input");
                break;
        }
        System.out.println("Thanks for using our services");

    }
}
