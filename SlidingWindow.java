public class SlidingWindow {
    public static void main(String[] args) {
        int a[]={1,4,45,6,10,19};
        int n=a.length;
        int target = 51;
        int minLength=smallestSubarrayWithSum(a,target);
        if(minLength==n+1){
            System.out.println("No such sub-array exists");
        }
        else{
            System.out.println("Minimum length is "+minLength);
        }
    }
    public static int smallestSubarrayWithSum(int []a,int target){
        int n=a.length;
        int minLength = n+1;
        int sum=0;
        int start=0,end=0;
        while(end<n){
            while(sum<=target && end<n){
                sum=sum+a[end++];
            }
            while(sum>target && start<n){
                    if(end-start<minLength){
                        minLength = end-start;
                    }
                sum=sum-a[start++];
            }


        }
        return minLength;
    }
}
