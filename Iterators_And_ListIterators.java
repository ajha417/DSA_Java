import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators_And_ListIterators {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45,56,12);


        System.out.println("This is example of iterator");
//        This is example of iterator
        Iterator<Integer> i = list.iterator();
        while(i.hasNext()){

            System.out.println(i.next());
        }

//        this is example of list-iterator
        System.out.println("Applying list iterator");
        ListIterator<Integer> li = list.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
    }
}
