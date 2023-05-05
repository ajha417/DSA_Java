package com.company;

public class Pallidrone {
    public static boolean isPalin(String s,int l,int r){
        if(l>=r){
            return true;
        }
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return isPalin(s,l+1,r-1);
    }
    public static void main(String[] args) {
        String s="madam";
//        int l=s.length();
        int l=0;
        int r=s.length()-1;
        System.out.println(r);
        boolean ans = isPalin(s,l,r);
        if(ans){
            System.out.println("The given is palidrone");
        }
        else
            System.out.println("It is not palidrone");

    }
}
