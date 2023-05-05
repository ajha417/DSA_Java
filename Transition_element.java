package com.company;

public class Transition_element {
    public static int findTransition(int arr[]){
        //transition point is the index position from where 1 starts
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1};
        int ans =findTransition(arr);
        System.out.println(ans);
    }
}
