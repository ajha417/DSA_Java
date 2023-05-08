import java.io.*;

public class SerialDemo {
    public static void main(String[] args) throws Exception{
        File f = new File("Obj.txt");

        Save obj = new Save();
        obj.i = 10;
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj1 = (Save) ois.readObject();
        System.out.println("The value of i in obj1 is: "+obj1.i);
    }
}
class Save implements Serializable{
    int i;
}
