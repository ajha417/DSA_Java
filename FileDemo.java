package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("D:/demo.java");   //this class is used to write anything in the file
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("demo content");  //this is predeifned non-static method to write content inside file so it is accessed using object
        FileInputStream fis = new FileInputStream("D:/demo.java");   //this is used to read the content from file
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF(dis);  //this method returns the string value of the file so we have to store it in variable
        System.out.println(str);
    }
}
