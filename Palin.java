package com.company;

public class Palin {
    public static void main(String[] args) {
        String s ="abba";
        String temp="";
        for(int i=s.length()-1;i>=0;i--){
            temp=temp + s.charAt(i);
        }
        System.out.println(temp);
    }
}
