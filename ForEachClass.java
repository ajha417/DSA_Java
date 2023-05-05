import java.util.Arrays;
import java.util.List;

public class ForEachClass {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(3,5,9,10,15);
//        for and enhanced for loops are external loop
//        foreach loop was introduced in java 8 and regarded as internal loop
//        since it is internal part of collection it is faster in execution


        values.forEach(i-> System.out.println(i));
    }
}
