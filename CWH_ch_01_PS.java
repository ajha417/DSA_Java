package com.company;
import java.util.Scanner;
public class CWH_ch_01_PS {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of Maths");
        int maths=sc.nextInt();
        System.out.println("Enter the marks of Science:");
        int sci=sc.nextInt();
        System.out.println("Enter the marks of Physics:");
        int phy=sc.nextInt();
        System.out.print("Enter the marks of chemistry:");
        int che=sc.nextInt();
        System.out.println("Enter the marks of computer: ");
        int com=sc.nextInt();
        int res;
        res=(maths+sci+phy+che+com)/5;
        System.out.print("The percentenge you have recieved is:");
        System.out.print(res);
    }
}
