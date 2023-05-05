import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution{

    public static int [][]merge(int [][]intervals){
        List<int[]>res = new ArrayList<>();
        if(intervals.length==0 || intervals==null){
            return res.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i[]:intervals){
            if(i[0]<=end){
                end = Math.max(end,i[1]);
            }
            else{
                res.add(new int[]{start,end});
                start=i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
}


public class MergeIntervals {
    public static void main(String[] args) {
        //here in this problem we have to overlap the sub-array and return non overlapping array
        //for example
       /* Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
        Output: [[1,6],[8,10],[15,18]]
        Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].*/

        int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
        /*int result[][]=merge(intervals);
        System.out.println();
        for(int i=0;i< intervals.length;i++){
            for(int j=0;j<2;j++){
                System.out.print(" "+intervals[i][j]);

            }
            System.out.println();
        }
        }
    static int [][]merge(int interval[][]){
        int flag=0;
        int n = interval.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<2;j++){
                if(flag==1){
                    continue;
                }
                if(interval[i+1][0]<interval[i][1]){
                    interval[0][0]=interval[i][0];
                    interval[0][1]=interval[i+1][1];
                    flag=1;
                }
            }
        }
            return interval;*/
        int res[][] = Solution.merge(intervals);
        for(int i=0;i<res.length;i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" "+res[i][j]);
            }
            System.out.println();
        }
    }

}
