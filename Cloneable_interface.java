class CloningClass implements Cloneable{
    int i = 20;
    String name = "cloning object";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Cloneable_interface {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloningClass c1 = new CloningClass();
        CloningClass c2 = (CloningClass) c1.clone();
        System.out.println(c2.i);
        System.out.println(c2.name);
    }
}
