import java.util.Arrays;

public class DistinctInWindow {
    static int distinctWindowCount(int[] a, int k){
        int count=0;
            for(int i=0;i<k;i++){
                int j;
                for(j=0;j<i;j++){
                    if(a[i]==a[j]){
                        break;
                    }

                }
                if(j==i){
                    count++;
                }
            }
        return count;
    }
    static void distinctCount(int a[],int n,int k){
        for(int i=0;i<=n-k;i++){
            System.out.println(distinctWindowCount(Arrays.copyOfRange(a,i,a.length),k));
        }

    }
    public static void main(String[] args) {
        //naive solution
        int a[]={1,2,2,1,3,1,1,3};
        int k = 4;
        int n=a.length;
        distinctCount(a,n,k);
    }
}
