package com.company;
import java.util.Scanner;
class For_Loop{
    Scanner sc = new Scanner(System.in);
    public int[] store_marks(){
        int []arr = new int[5];
        System.out.println("Enter marks :");
        for(int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void show_marks(int [] arr){
        System.out.println("The marks are:");
        for(int i:arr){
            System.out.println(i);
        }
    }
}
public class Infosys_for_loop {

    public static void main(String[] args) {
        For_Loop obj = new For_Loop();
        int[] arr = obj.store_marks();
        obj.show_marks(arr);



    }
}
