package com.company;


import java.util.Scanner;

//public class practise_cipher {
public class practise_cipher {
     static String encryption(int key, String input){
        StringBuilder encrypted=new StringBuilder(input);
        String   alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet=alphabet.substring(key)+alphabet.substring(0,key);
        for(int i=0;i<encrypted.length();i++){
            char currChar=encrypted.charAt(i);
            int idx=alphabet.indexOf(currChar);
            if(idx!=-1){
                char newchar=shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i,newchar);
            }
        }
        return encrypted.toString();

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your message:");
        String input=sc.nextLine();
        String inp=input.toUpperCase();
        String enc=encryption(15,inp);
        System.out.println("The encrypted message is as follow:");
        System.out.println(enc);
        System.out.println("the original message was:");
        System.out.println(input);


    }
}
