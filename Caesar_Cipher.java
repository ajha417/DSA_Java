package com.company;

import java.util.Scanner;

public class Caesar_Cipher {
    static String encryption(int key,String input){
        StringBuilder encrypted=new StringBuilder(input);
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet=alphabet.substring(key)+alphabet.substring(0,key);
        for(int i = 0;i < encrypted.length();i++){
            char currChar=encrypted.charAt(i);
            int idx=alphabet.indexOf(currChar);
            if(idx!=-1){
                char newChar=shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i,newChar);
            }
        }
        return encrypted.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int key=15;
//        FileResource
        System.out.println("Enter input in capital letters:");
        String input=sc.nextLine();

        String encrypted=encryption(key,input);
        System.out.println(encrypted);
    }
}
