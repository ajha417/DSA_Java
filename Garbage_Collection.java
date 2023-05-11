import java.io.IOException;

class GC_Collector{

}
class GC_Collector2{

}
public class Garbage_Collection {
    public static void main(String[] args) throws IOException {
        GC_Collector obj1 = new GC_Collector();
        GC_Collector2 obj2 = new GC_Collector2();
        obj2 = null;
        obj1 = null;
        System.gc();
        Runtime.getRuntime().exec("notepad");


    }
    @Override
    protected void finalize(){
        System.out.println("finalize is called");
    }
}
