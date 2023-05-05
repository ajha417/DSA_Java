package com.company;

public class Variable_Arguments {
    static int sum(int ...arr){  //we can take n number of parameters in this method
       int result=0;
        for(int a:arr){
            result=result+a;
        }
        return result;
    }
    public static void main(String[] args) {
        //This is the tutorial for variable arguments
        System.out.println("This is the tutorial for variable arguments");
        System.out.println("The sum of 23 and 46 is "+sum(23,46));
        System.out.println("The sum of 12,23 and 46 is "+sum(12,23,46));
        System.out.println("The sum of 12,23 and 46 and 78 is "+sum(12,23,46,78));
    }
}
