package com.company;

public class Peak_element {
    public  static int findingPeak(int arr[],int n){
        if(n==1 || arr[0]>arr[1]){ //here we are checking if array has only one element or its first element is greater than second one
            return 0;
        }
        if(arr[n-1]>arr[n-2]){  //here we are checking if last element is greater than the second last element
            return n-1;
        }
        for(int i=1;i<n-1;i++){   //here loop is starting from 2nd element and running upto 2nd last element
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){  //here element is compared with its adjacent elements
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,2,6};
        int ans = findingPeak(arr,arr.length);
        System.out.println(ans);
    }
}
