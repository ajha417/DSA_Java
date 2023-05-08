import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserDefinedExceptionHandling {
    public static void main(String[] args) {
        int a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{

            System.out.println("Enter number:");
            a = Integer.parseInt(br.readLine());
            if(a < 10){
                throw new MyExceptionClass("Value should be more than 10");
            }
            else System.out.println(a);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

class MyExceptionClass extends Exception{
    public MyExceptionClass(String msg)
    {
        super(msg);
    }
}