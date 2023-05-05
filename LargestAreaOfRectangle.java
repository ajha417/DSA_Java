import java.util.Stack;

public class LargestAreaOfRectangle {
    public static void main(String[] args) {
        int a[][] = new int[][]{
                {0,1,1,1,1,0},
                {1,1,1,1,0,1},
                {1,1,0,1,1,1},
                {1,1,1,1,1,0},
        };
        System.out.println(largestArea(a));

    }
    static int largestArea(int [][]a){
        int []currRow=a[0];
        int maxArea=findHistogram(currRow);
        for(int i=1;i<4;i++){
            for(int j=0;j<5;j++){
                if(a[i][j]==1){
                    currRow[j]+=1;
                }
                if(a[i][j]==0){
                    currRow[j]=0;
                }

            }
            int currArea=findHistogram(currRow);
            maxArea=Math.max(maxArea,currArea);
        }
        return maxArea;
    }
    static int findHistogram(int a[]){
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int n=a.length;
        int left_smaller[]=new int[a.length];
        int right_smaller[]=new int[a.length];
        int maxArea=a[0];
        for(int i=0;i<n;i++){
            left_smaller[i]=-1;
            right_smaller[i]=n;
        }
        int i=0;
        while(i<n){
            while(!s.isEmpty() && s.peek()!=-1 && a[i]<a[s.peek()]){
                right_smaller[s.peek()]=(int)i;
                s.pop();
            }
            if(i>0 && a[i]==a[i-1]){
                left_smaller[i]=left_smaller[(int)(i-1)];
            }
            else{
                left_smaller[i]=s.peek();
            }
            s.push(i);
            i++;
        }
        for(i=0;i<n;i++){
            int currArea= (right_smaller[i]-left_smaller[i]-1)*a[i];
            maxArea=Math.max(maxArea,currArea);

        }
        return maxArea;



    }
}
