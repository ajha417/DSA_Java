import java.util.Stack;
public class LargestAreaInHistogram {
    public static void main(String[] args) {
        int a[]={2,1,5,6,2,3};
        //int area,left,right;

        //this is naive solution
        /*for(int i=1;i<a.length-1;i++){
            left=i;
            right=i;
            while(a[left]>=a[i])
                left--;
            while(a[right]>=a[i])
                right++;
            area=(right-left-1)*a[i];
            System.out.println("The largest area of the histogram is: "+area);
        }*/
//        System.out.println(maxAreas(a));
        System.out.println(findMaxArea(a,a.length));

    }
    /*static int maxAreas(int a[]){
        int maxAns=0;
        int ps[]=findPrevious(a);
        int ns[] = findNext(a);
        for(int i=0;i<a.length;i++){
            int curr=(ns[i]-ps[i]-1)*a[i];
            maxAns=Math.max(maxAns,curr);
        }
        return maxAns;
    }
    static int []findPrevious(int a[]){
        int ps[]= new int[a.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }
            else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }
    static int []findNext(int a[]){
        int ns[] = new int[a.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty() && ns[s.peek()]<=a[i]){
                s.pop();
            }
            if(s.isEmpty())
                ns[i]=a.length;
            else{
                ns[i]=-1;
            }
            s.push(i);
        }
        return ns;
    }*/

    static int findMaxArea(int a[],int n){
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int maxArea=a[0];
        int left_smaller[] = new int[n];
        int right_smaller[] = new int[n];
        for(int i=0;i<n;i++){
            left_smaller[i]=-1;
            right_smaller[i]=n;
        }
        int i=0;
        while(i<n){
            while(!s.isEmpty() && s.peek()!=-1 && a[i]<a[s.peek()]){
                right_smaller[s.peek()] =(int)i;
                s.pop();
            }
            if(i>0 && a[i]==a[i-1]){
                left_smaller[i] = left_smaller[(int)(i-1)];
            }
            else {
                left_smaller[i]=s.peek();
            }
            s.push(i);
            i++;
        }
        for(i=0;i<n;i++){
            int curr = (right_smaller[i]-left_smaller[i]-1)*a[i];
            maxArea=Math.max(maxArea,curr);
        }
        return maxArea;
    }
}
