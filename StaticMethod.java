interface I{
//    we can even define methods using static keyword
    static void show(){
        System.out.println("This is static method defined inside interface I");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        I.show();
        //we can directly call show method using interface I as show is static method
    }
}
