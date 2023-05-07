import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File fo = new File("newfile.txt");
            if(fo.createNewFile()){
                System.out.println("File "+fo.getName()+" is created successfully");
            }
            else {
                System.out.println("File already exists");
            }
        }
        catch (IOException ex){
            System.out.println("An unexpected error occured while creating file");
            ex.printStackTrace();
        }
    }
}
