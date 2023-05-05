package com.company;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class StringDemo {
    public static void main(String[] args) throws Exception{
       String str = "Ganesh,Krishna,Ram,Vishnu,Shiva,Hanuman,Brahma";
       String names[]=str.split(",");
        for (String element:names
             ) {
            System.out.println(element);
        }

    }

}
