package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class File_Example1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:/file.txt");
        int i;
             do {
                 i = fis.read();
                 if (i != -1) {
                     System.out.print((char) i); //since i in int type so, it is type casting into char type
                 }
             }while (i!=-1);  //the loop runs till the value of i reaches to -1
             fis.close();

    }
}
