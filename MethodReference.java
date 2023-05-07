import java.util.Arrays;
import java.util.List;

interface Parser{
    String parse(String s);
}
class StringParser{
    public static String convert(String s){
        if(s.length() <= 4){
            s = s.toUpperCase();
        }
        else{
            s = s.toLowerCase();
        }
        return s;
    }
}
class MyPrinter{
    public void print(String str,Parser p){
        str = p.parse(str);
        System.out.println(str);
    }
}
public class MethodReference {
    public static void main(String[] args) {

        /*
        List<String> list = Arrays.asList("Amit","Rakesh","Suresh","Dinesh");

//        here we are using call by method
        list.forEach(System.out::println);*/

        String str = "Amit";
        MyPrinter mp = new MyPrinter();
       /* mp.print(str, new Parser() {
            @Override
            public String parse(String s) {
                return StringParser.convert(s);
            }
        });*/

//        using lambda expression
//        mp.print(str,s->StringParser.convert(s));

//        using method reference
        mp.print(str,StringParser::convert);
    }
}
