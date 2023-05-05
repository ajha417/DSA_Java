package com.company;

public class TestGeneric {
    public static <E> void display(E[] arr){
        for(E i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Integer[] arrInteger={10,20,30,40,50,60};
        Character[] arrChar={'I','N','F','O','S','Y','s'};
        Double[]  arrDouble = {100.1,200.1,300.1,400.1,500.1,600.1};
        TestGeneric test = new TestGeneric();
        test.display(arrInteger);
        test.display(arrChar);
        test.display(arrDouble);


    }
}
