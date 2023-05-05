package com.company;
import java.util.HashMap;
import java.util.Map;
public class LearnMap {
    public static void main(String[] args) {
      /*  Map<Integer,String> m=new HashMap<>();
        m.put(1,"Amit");     //in Map we add element by using put method
        m.put(2,"Raman");   //map is actually key value pair where key and value can be of any data type
        m.put(3,"Ratan");
        m.putIfAbsent(2,"Neha");
        m.putIfAbsent(4,"Hrithik");  //putIfAbsent checks whether the given key is already present in the map as map doesn't allow duplicate keys
        for(Map.Entry<Integer,String> e:m.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
*/
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"Amit");
        m.put(2,"Raman");
        m.put(3,"Aradhna");
        //Map doesn't allow duplicate key in the map
        //map is actually key value pair
        //if we try to insert duplicate value then it will be updated
        m.putIfAbsent(2,"Raman");
        m.putIfAbsent(4,"Hrithik");
        System.out.println(m);
        //to iterate over map we can use for each loop
        for(Map.Entry<Integer,String> e:m.entrySet()){
            System.out.println(e);  //this will print both key and value as well
            //entrySet method provides the set of keys values present in the map
        }
        for(Map.Entry<Integer,String> f:m.entrySet())
        {
            System.out.println(f.getKey());  //this will only show  keys
            System.out.println(f.getValue());  //this will only show the vallues
        }
    }
}
