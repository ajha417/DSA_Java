package com.company;

public class Powerset {
    public static void powerset(String s,int i,String curr){
        if(i==s.length()) {
            System.out.println(curr);
            return;
        }
        powerset(s,i+1, curr+s.charAt(i));  //here two possiblities can be there
        //if current want to add the next character or not
        powerset(s,i+1,curr);
    }
    public static void main(String[] args) {
        //in this problem we have to find the number of possible subset of given string
        //for example for ab we can have "",a,b,ab
        String s ="abc";
        String curr ="";
        int i=0;
        powerset(s,i,curr);

    }
}
