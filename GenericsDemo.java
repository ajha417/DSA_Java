package com.company;
class Container<T extends Number>{    //if we want to work with particular type then we have to mention like this
    T value;   //here whatever we mention in angular bracket it is generics

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show(){
        System.out.println(value.getClass().getName());
    }
}
public class GenericsDemo {
    public static void main(String[] args) {
        Container<Integer> obj = new Container<>();  //Now the object type will be of String
        obj.value=9;  //whenever we are working with generics it supports only wrapper classes not primitive data type
        obj.show();
    }
}
