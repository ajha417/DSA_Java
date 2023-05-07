import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


class Container<T extends Number>{ //this will bound class to have only of number type or its sub-class type
    T value;

    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
    public void showType(){
        System.out.println(value.getClass().getName());
    }

    public void demo(ArrayList<? super T> obj){

    }
}
public class GenericsExample {
    public static void main(String[] args) {
        /*
        List values = new ArrayList();
        values.add(1);
        values.add("Amit");*/
/*
        List<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(7);
        int i = Integer.parseInt(values.get(1).toString()); //this will throw runtime error which is not good
        System.out.println(i);*/

        Container<Integer> obj = new Container();
        obj.value = 10;
        obj.showType();
        obj.demo(new ArrayList<Number>());
    }
}
