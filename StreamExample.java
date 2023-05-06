import java.util.Arrays;
import java.util.List;
class Persons{
    private String firstname,lastname;
    private int age;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Persons(String firstname,String lastname,int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public int getAge(){
        return this.age;
    }

}
public class StreamExample {
    public static void main(String[] args) {
        List<Persons> people = Arrays.asList(
                new Persons("Charles","Babbage",40),
                new Persons("Thomas","Elba",54),
                new Persons("Albert","Einstein",60),
                new Persons("Sir Isaac","Newton",35),
                new Persons("Nikola","Tesla",28)
                );

//        to print only those names whose lastname starts with C
        people.stream().
        filter(p->p.getLastname().startsWith("E")).
                forEach(p-> System.out.println(p.getFirstname()));
    }
}
