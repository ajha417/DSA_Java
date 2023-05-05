package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Leader_element {
    public static ArrayList<Integer>leader(int a[],int n){
        ArrayList<Integer>al=new ArrayList<>();
        int m=a[n-1];  //here rightmost value is stored in the variable
        al.add(m);
        for(int i=n-2;i>=0;i--){
            if(a[i]>m){  //if left element is greater than right one it is stored in array
                al.add(a[i]);
                m=a[i];  //here the greater value is stored in m
            }
        }
//        Collections.sort(al);
        return al;
    }
    public static void main(String[] args) {
        int a[]={16,17,4,3,5,2};
        ArrayList<Integer>ans = leader(a,a.length);
        Collections.sort(ans);
        for(int i:ans){
            System.out.println(i);
        }

    }
}
