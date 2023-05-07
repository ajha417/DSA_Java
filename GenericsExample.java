import java.util.ArrayList;
import java.util.List;


class Container<T>{
    T value;
    public void showType(){
        System.out.println(value.getClass().getName());
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
    }
}
