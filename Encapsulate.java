class Person{
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

public class Encapsulate {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(22);
        System.out.println(p1.getAge());

        String s1 = "This is demo";
        System.out.println(s1.replaceAll("is(.*)","hi"));

    }
}
