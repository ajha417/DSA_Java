import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int a[]={10, 2, -2, -20, 10};
        int sum=-10;
        int start=0;
        int end = -1;
        int currSum=0;
        for(int i=0;i<a.length;i++){
            currSum=currSum+a[i];
            if(currSum-sum==0){
                start=0;
                end=i;
                break;
            }
            if(h.containsKey(currSum-sum)){
                start = h.get(currSum-sum)+1;
                end=i;
                break;
            }
            h.put(currSum,i);
        }
        if(end==-1){
            System.out.println("Subarray doesn't exist");
        }
        else{
            System.out.println("SubArray exist between "+start+" and "+end);
        }
    }
}
