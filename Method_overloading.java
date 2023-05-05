package com.company;

public class Method_overloading {

     static void change(int[] arr1){
        arr1[0]=90;
    }
    static void play(){
        System.out.println("Good Morning Dost");
    }
    static void play(int a){
        System.out.println("Love you "+a+" buddy!");
    }
    static int play(int a,int b){
        int c;
        c=a+b;
        return c;
    }
    public static void main(String[] args) {
        //if we pass array as an argument then its address of the object is passed to the method ana
        //any changes made in that will reflect in the actual array

        int [] arr={23,45,12,11,1,2};
        change(arr);
        System.out.println("The array is "+arr[0]);
        //java supports method overloading in this we can declare more methods having same name
        //but the condition is that each method should have different numbers of parameters
        //even if the return type of method is different but if they have same numbers of parameters then it will throw an error
        //so method overloading works only if the number of parameter is different

        play();
        play(3000);
        int res=play(20,12);
        System.out.println("The value of result is "+res);

    }
}
