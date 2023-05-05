package com.company;

public class Methods {
    static int addition(int x,int y){
            int z;
            if(x>y){
                z=(x+y)*4;
            }
            else{
                z=x+y;
            }
            return z;
    }
    public static void main(String[] args) {
        int a=23;
        int b=46;
        int c=addition(a,b);
        System.out.println(c);
        int a1=78;
        int b1=23;
        int c1=addition(a1,b1);
        System.out.println(c1);
    }
}
