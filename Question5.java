package com.company;

import java.util.*;
 class TestCollection
{
    public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ramesh");
        al.add("Tejas");
        //Missing Statement
        al.add("Kajal");
        al.add(1,"Virat");
        System.out.println("element at 2nd position: "+al.get(2));
        ListIterator<String> itr=al.listIterator();
        System.out.println("traversing elements in forward direction...");
        //Missing Statement
        for(int i=0;i<al.size();i++)
        {
            System.out.println(itr.next());
        }
        System.out.println("traversing elements in backward direction...");
        //Missing Statement
        for(int i=0;i< al.size();i++)   //here the iterator loop will start from end of the array as it is mentioned previous method
        {
            System.out.println(itr.previous());
        }
    }
}


