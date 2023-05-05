package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:/file1.txt",true);  //here we are creating object of writer class
        BufferedWriter bf = new BufferedWriter(fw); //here we are passing that object as parameter
        bf.write("Hello  World"); //here we are writing at once
        bf.close(); //In bufferedWriter all the values are written at once and stored in temp buffer when it is full it stores in disk and again empties

    }
}
