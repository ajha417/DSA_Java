public class Prefix_Sum {
    static void fillPrefixSum(int a[],int n,int prefixSum[]){
        prefixSum[0]=a[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+a[i];
        }
    }
    public static void main(String[] args) {
        int arr[]={10,4,16,20};
        int n = arr.length;
        int prefixSum[] = new int[n];
        fillPrefixSum(arr,n,prefixSum);
        for(int i=0;i<n;i++){
            System.out.print(" "+prefixSum[i]);
        }
    }
}
