class Signleton_Instance{
    private static Signleton_Instance instance;
    int i;
    private Signleton_Instance(){
        i = 90;
    }
    public static Signleton_Instance getInstance(){
        if (instance == null){
            instance = new Signleton_Instance();
        }
        return instance;
    }


}
public class Singleton_Class {
    public static void main(String[] args) {
        Signleton_Instance fist = Signleton_Instance.getInstance();
        System.out.println("First instance integer value:"+fist.i);
        fist.i = fist.i + 90;
        Signleton_Instance second = Signleton_Instance.getInstance();
        System.out.println("Second instance integer value:"+second.i);
    }
}
