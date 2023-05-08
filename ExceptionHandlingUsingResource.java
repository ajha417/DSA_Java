import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingUsingResource {
    public static void main(String[] args) throws IOException {
        BufferedReader br=null;
        try
        {
            String str = "";
            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            System.out.println(str);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            br.close();
        }
    }
}
