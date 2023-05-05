import java.net.Inet4Address;
import java.util.ArrayList;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int a[] = {1,3,-1,-3,5,3,6,7};
        int b=3;
        ArrayList<Integer> result = slidingwindowMax(a,b);
        printIt(result);
    }
    static void printIt(ArrayList<Integer> result){
        for (int r:
             result) {
            System.out.print(" "+r);
        }
    }
    static ArrayList<Integer> slidingwindowMax(int a[],int b){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<a.length-b;i++){
            int maxIdx=i;
            for(int j=0;j<b;j++){
                if(a[i]>a[maxIdx]) {
                    maxIdx = j;
                    result.add(a[maxIdx]);
                    break;
                }
            }

        }
        return result;
    }
}
