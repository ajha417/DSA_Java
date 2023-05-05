package com.company;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("D:/file.txt",true);  //first argument is path and other is boolean append
        String s = "Hello world";
        char[] ch = s.toCharArray();  //this is the method to convert string into an array
        for(int i=0;i<s.length();i++){
            fout.write(ch[i]);  //this will append the character one by one
        }
        fout.close();  //this is used to save the file from buffer to hard disk
    }
}
