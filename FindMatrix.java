import java.util.ArrayList;
import java.util.List;

public class FindMatrix {
    public static void main(String[] args) {
        int nums[] = {1,3,4,1,2,3,1};
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int val:nums){
            temp.add(val);
        }
        while(!temp.isEmpty()){
            for(int val:temp){
                if(!ans.contains(val)){
                    ans.add(val);
                    temp.remove(val);
                }
            }
            res.add(ans);
        }
        System.out.println(res);
    }
}
