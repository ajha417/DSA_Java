public class BooksAllocaition {
    public static void main(String[] args) {
        int a[]={12,34,67,90};
        int noOfStudents = 2;
        int mPages =  minPages(a,noOfStudents);
        System.out.println(mPages);

    }
    static int minPages(int a[],int k){
        int n = a.length;
        if(k>n)
            return -1;
        int min=a[0];
        int max=0;
        int res=0;
        for(int i=0;i<n;i++){
            if(a[i]>min){
                min=a[i];
            }
            max=max+a[i];
        }
        while(min<=max){
            int mid = (min+max)/2;
            if(isFeasible(a,mid,k)){
                res=mid;
                max = mid-1;
            }
            else{
                min = mid+1;
            }

        }
        return res;
    }
    static boolean isFeasible(int a[],int res,int k){
        int student=1,sum=0;
        for(int i=0;i<a.length;i++){
            if(sum+a[i]>res){
                student++;
                sum=a[i];
            }
            else{
                sum=sum+a[i];
            }
        }
        return student<=k;

    }
}
