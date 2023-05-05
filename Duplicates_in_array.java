package com.company;

import java.util.ArrayList;

public class Duplicates_in_array {
    public static ArrayList<Integer> duplicates(int []arr,int n){
        ArrayList<Integer>al = new ArrayList<>();
        int flag=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]==arr[i]){
                    al.add(arr[j]);
                    flag=1;
                }
            }
        }
        if(flag==0){
            al.add(-1);
        }
        return al;
    }
    public static void main(String[] args) {
        int []arr={2,3,1,3,4,4,5,6};
        ArrayList<Integer>ans=duplicates(arr,arr.length);
        for(int i=0;i< ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
