import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args) {
        try{
//            FileWriter fw = new FileWriter("newfile.txt");
            BufferedWriter fw = new BufferedWriter(new FileWriter("newfile.txt",true));
            fw.write("This is the content written in file");
            fw.close();
            System.out.println("content written successfully");
        }
        catch (IOException ex){
            System.out.println("something went wrong");
            ex.printStackTrace();
        }
    }
}
