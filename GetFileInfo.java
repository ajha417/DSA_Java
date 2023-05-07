import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File fo = new File("newfile.txt");
        if(fo.exists()){
            System.out.println("File name "+fo.getName());
            System.out.println("File path: "+fo.getAbsolutePath());
            System.out.println("is file writable? "+fo.canWrite());
            System.out.println("is file readable? "+fo.canRead());
            System.out.println("The size of file in bytes: "+fo.length());
        }
        else System.out.println("File doesn't exist");
    }
}
