package com.company;

public class Number_Of_Ways {
    public static int count(int m,int n){
        if(m==1 ||n==1){
            return 1;  //if matrix has only one row or only one column only one way is possible
        }
        return count(m-1,n) + count(m,n-1);
    }
    public static void main(String[] args) {
        //here we will be finding the number of ways we can reach from starting corner to ending corner
        int a[][]=new int[2][2];
        int ans =count(3,3);
        System.out.println(ans);
}
}
