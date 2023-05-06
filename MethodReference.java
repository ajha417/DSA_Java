import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amit","Rakesh","Suresh","Dinesh");

//        here we are using call by method
        list.forEach(System.out::println);
    }
}
