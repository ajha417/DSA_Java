import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4,5,1,6,8,9,10);
        Consumer<Integer> obj = i -> System.out.println(i);
        values.forEach(i-> System.out.println(i));
    }
}
