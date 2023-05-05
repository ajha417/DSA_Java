import java.util.Arrays;
import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args) {
        int a[] = {5,10,15,5,4,5};
        Arrays.sort(a);
        int count = 1;
        int n = a.length;
        for(int i=1;i<n;i++){
            while(i<n-1 && a[i]==a[i+1]){
                i++;
            }
            count++;
        }
        System.out.println(count);
        //here the time complexity is O(nlogn)
        //we can apply the concept of hashing here
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(a[i]);
        }
        System.out.println(h.size());
    }


}
