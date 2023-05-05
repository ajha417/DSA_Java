package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Library{
    String [] availableBooks={"Let Us see","Java Basics","Python Programming","Mathematics","Internet Programming"};

    void addBook(String book){
        List <String> arrlist=new ArrayList<String>(Arrays.asList(availableBooks));
        arrlist.add(book);
        availableBooks=arrlist.toArray(availableBooks);
    }
    void showBooks(){
        for(int i=0;i< availableBooks.length;i++){
            System.out.println(availableBooks[i]);
        }
    }

}

public class OnlineLibrary {
    public static void main(String[] args) {

    }
}
