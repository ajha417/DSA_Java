import java.util.HashMap;
import java.util.Map;

public class DistinctWindowOptimized {
    static void countDistinctElements(int a[],int k){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<k;i++){
            //here we are checking unique element in array
            //if it is present then it's frequency is increased by 1
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        System.out.println(map.size());
        for(int i=k;i<a.length;i++){
            //now we will check whether the given element is present in array or not
            //if it is present one time then we will remove it otherwise we will decrease its frequency by 1
            if(map.get(a[i-k])==1){
                map.remove(a[i-k]);
            }
            else{
                map.put(a[i-k],map.get(a[i-k])-1);
            }
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            System.out.println(map.size());
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,2,1,3,1,1,3};
        int k=4;
        countDistinctElements(a,k);

    }
}
