import java.util.Arrays;

public class Minimize_Height {
    public static void main(String[] args) {
        int a[] = {1,5,8,10};
        int k = 2,n = 4;
        System.out.println(minimizeHiehgt(a,a.length,k));
    }
    static int minimizeHiehgt(int a[],int n,int k){
        if(n==1){
            return 0;
        }
        Arrays.sort(a);
        int result = a[n-1]-a[0];
        int maxv,minv;
        for(int i=1;i<n;i++){
            maxv = Math.max(a[n-1]-k,a[i-1]+k);
            minv = Math.min(a[0]+k,a[i]-k);
            result = Math.min(result,maxv-minv);

        }
        return result;
    }
}
