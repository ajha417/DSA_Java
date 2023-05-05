package com.company;

public class String_05_02 {
    public static void main(String[] args) {
        /*
        String test ="ABCabc1234'#!#$";
        for(int i=0;i<test.length();i++){
            char ch = test.charAt(i);
            if(Character.isAlphabetic(ch)){
                System.out.println(ch+"is alphabetic");
            }
            if(Character.isDigit(ch)){
                System.out.println(ch+"is digit");
            }
            if(ch=='#'){
                System.out.println(ch+"it is #hashtag");
            }
        }
        String test = "ABCabcde019";
        for(int i=0;i<test.length();i++){
            char ch=test.charAt(i);
            char uch=Character.toUpperCase(ch);
            char lch = Character.toLowerCase(ch);
            System.out.println(ch+" "+uch+" "+lch);
        }*/
        String input="HI I AM AMIT";
        int key=12;
        StringBuilder encrypted= new StringBuilder(input);
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet=alphabet.substring(key)+alphabet.substring(0,key);
        for(int i=0;i<encrypted.length();i++){
            char currChar= encrypted.charAt(i);
            int idx=alphabet.indexOf(currChar);
            if(idx!=-1){
                char newChar=shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i,newChar);
            }
        }
        System.out.println("Your original message is: "+input);
        System.out.println("Your ecrypted message is: "+encrypted);
    }
}
