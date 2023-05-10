public class Wrapper_ClassDemo {
    static public void main(String[] args) {
        int i = 5;  //primitive variable
        Integer i1 = 10; //reference variable;

        Integer i2 = Integer.valueOf(i); //this is called boxing or wrapping
        int j = i2.intValue(); //this is called unboxing or unwrapping


        Integer i3 = i; //this is called autoboxing as new Integer(i) at right side is executed automatically by java
        int k = i3; //this is called auto unboxing and auto-unboxing or auto-unwrapping

//        //primitive data type is executed faster than that of wrapper class
//        wrapper classes are necessary in collections frameworks

        String str = "123";
        int n = Integer.parseInt(str);
        System.out.println(n);

    }
}
