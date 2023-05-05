package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud{
    int marks;
    int roll_no;
    public Stud(int marks,int roll_no){
        this.marks = marks;
        this.roll_no = roll_no;
    }
    @Override
    public String toString(){
        return "Student{"+"marks:"+this.marks+" roll no:"+this.roll_no+"}";
    }

}
class Container1<T extends Number>{
    T value;
    public void show(){
        System.out.println(value.getClass().getName());
    }
   /* public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }*/
}
public class Generic_demo {
    public static void main(String[] args) {
      /*  List<Stud> studs = new ArrayList<Stud>();
        studs.add(new Stud(99,25));
        studs.add(new Stud(89,10));
        studs.add(new Stud(67,17));
        studs.add(new Stud(91,24));
        Collections.sort(studs,(s1,s2)->{   //the second parameter is lambda function
            return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
        });
        for(Stud s:studs){
            System.out.println(s);
        }
*/


        //let's understand about what is generics

        List values = new ArrayList();  //here we haven't mentioned the type so, it will accept all the values
        values.add(1);  //it will accept all the object
        values.add("Amit");
        int i = Integer.parseInt(values.get(0).toString());
        //at first we are converting object to string and, then we are converting it to string and then parsing it to integer
//        System.out.println(i);
        //but what if we want integer only not the string then index 1 will give error
        //int i =Integer.parseInt(values.get(1).toString()); this will throw an error as it has string value in it
//        List<Container1> obj = new ArrayList<>();
        List<Integer> obj = new ArrayList<>();  //now we can only specify child classes of number class
        Container1<Float> obj1 = new Container1<>();
        obj1.value=9.9f;
        obj1.show();



    }
}
