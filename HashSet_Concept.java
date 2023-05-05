import java.util.HashSet;

public class HashSet_Concept {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<Integer>();
        //to insert value into the hashset
        h.add(34);
        //it overwrites the duplicate values
        h.add(34);
        h.add(5);
        h.add(7);
        System.out.println(h);
        //now to check if it contains particular element or not
        if(h.contains(5)){
            System.out.println("Present");
        }
        else {
            System.out.println("It is not present");
        }
        //to remove the element from the hashset
        h.remove(34);
        System.out.println(h);
        System.out.println(h.stream().count());  //to know the no. of elements
        System.out.println(h.size());
        //to check whether the hashset is empty or not
        if(h.isEmpty()){ //it returns boolean value
            System.out.println("It is empty");
        }
        else{
            System.out.println("It is not empty");
        }
        h.clear();
        System.out.println(h);


    }
}
