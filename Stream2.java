package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,5,9,7,21,26);  //here this array is written as a list
        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        list.forEach(c);
    }
}
