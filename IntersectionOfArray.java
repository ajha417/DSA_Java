import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        int a[]={3,2,1,5,6,8,10};
        int count=0;
        int b[]={5,9,11,13,16,2,1,3};
        for(int x:a){
            s.add(x);
        }
        for(int x:b){
            count++;
            s.remove(x);
        }
        System.out.println(s.size());
    }
}
