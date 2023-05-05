package com.company;

public class Power_Using_Recursion {
    public static int findPower(int a,int b){
        if(b==0) {   //once the value of b reaches 0 then anything raise to 0 power gives 0
            return 1;   //so this is the base condition
        }
        return a * findPower(a,b-1);  //here we are decreasing the value of b by 1
    }
    public static void main(String[] args) {
        int ans=findPower(3,4);
        System.out.println(ans);
    }
}
