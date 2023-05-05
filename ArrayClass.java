package com.company;
import java.util.Arrays;
public class ArrayClass {
    public static void main(String[] args) {
        /*int a[]={1,2,3,4,5,6,7,8};
        int index=Arrays.binarySearch(a,5);
        System.out.println("the number is present at "+index);*/
        Integer [] number={10,-2,3,7,1,0,87};
        Arrays.sort(number);
        for(int i:number){
            System.out.println(i+ " ");
        }


    }
}
