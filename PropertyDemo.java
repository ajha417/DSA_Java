package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
import java.io.OutputStream;

public class PropertyDemo {
    public static void main(String[] args) throws Exception{
        File f = new File("D:/demo.properties");
        Properties p = new Properties();
        OutputStream fos = new FileOutputStream(f);
        p.setProperty("url","localhost:3306/rkuniversity");
        p.setProperty("pass","1234");
        p.setProperty("uname","Amit");
        p.store(fos,null);   //here there are two arguments one is object of Fileoutputstream and other is comment


    }
}
