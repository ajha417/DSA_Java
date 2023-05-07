import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromFile {
    public static void main(String[] args) {
        try {
            File f1 = new File("newfile.txt");
            Scanner dataReader = new Scanner(f1);
            while (dataReader.hasNextLine()){
                String dataFile = dataReader.nextLine();
                System.out.println(dataFile);
            }
            dataReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
