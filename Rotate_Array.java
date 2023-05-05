package com.company;

import java.util.ArrayList;

public class Rotate_Array {
    public static  void rotate(int a[],int n,int d){
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i=d;i<n;i++){
            arr.add(a[i]);

        }
        for(int i=0;i<d;i++){
            arr.add(a[i]);
        }
        for (int i = 0; i < arr.size() ; i++) {
            System.out.println(arr.get(i));
        }
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10,12,14,16,18};
        int d=3;
        rotate(a,a.length,d);
    }
}
