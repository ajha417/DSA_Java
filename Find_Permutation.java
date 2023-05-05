package com.company;

public class Find_Permutation {
    public static void main(String[] args) {
        String s = "abc";
        int n= s.length();
        permute(s,0,n-1);
    }
    public static void permute(String s,int l,int r){
        if(l==r){
            System.out.println(s);
        }
        int count = 0;
        for (int i=l;i<=r;i++){
            s = swap(s,l,i);
            permute(s,l+1,r);
            s = swap(s,l,i);
            count++;

        }

    }
    public static String swap(String s,int i,int j){
        char temp;
        char[] charA = s.toCharArray();
        temp = charA[i];
        charA[i]= charA[j];
        charA[j]=temp;
        return String.valueOf(charA);
    }
}
