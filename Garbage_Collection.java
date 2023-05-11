class GC_Collector{

}
class GC_Collector2{

}
public class Garbage_Collection {
    public static void main(String[] args) {
        GC_Collector obj1 = new GC_Collector();
        GC_Collector2 obj2 = new GC_Collector2();
        obj2 = null;
        obj1 = null;
        System.gc();


    }
    @Override
    protected void finalize(){
        System.out.println("finalize is called");
    }
}
