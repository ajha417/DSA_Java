import java.util.Stack;
//time complexity is O(n)
//space complexity is also O(n)
public class PreviousSmallerElement {
    public static void main(String[] args) {
        int a[]={4,10,5,8,20,15,3,12};
        previousSmallerElement(a);
        /*int temp[]=new int[a.length];
        int smallest=-1;
        temp[0]=smallest;
        for(int i=1;i<a.length;i++){
            System.out.print(a[i]+" ");
            System.out.println(a[i-1]);
            if(a[i-1]<a[i]){
                smallest=a[i-1];
            }

            temp[i]=smallest;
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(" "+temp[i]);
        }*/

    }
    static void previousSmallerElement(int a[]){
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && s.peek()>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(s.peek()+" ");
            }
            s.push(a[i]);
        }
    }
}
