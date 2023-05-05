public class MergeAlgorithm {
    public static void main(String[] args) {
        int a[] = new int[]{45,32,1,9,8,7,6};
//        a = {45,32,1,9,8,9};
        int n = a.length;
        int left = 0;
        int right = n-1;
        printIt(a);
        mergeSorti(a,left,right);
        printIt(a);
    }

    private static void printIt(int[] a) {
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }

    private static void mergeSorti(int[] a, int left, int right) {
        if(left < right){
            int mid = (left+right)/2;
            mergeSorti(a,left,mid);
            mergeSorti(a,mid+1,right);
            mergee(a,left,mid,right);

        }
    }

    private static void mergee(int[] a, int left, int mid, int right) {
        int b[] = new int[a.length];
        int i = left;
        int j = mid+1;
        int k = left;
        while(i <= mid && j<=right){
            if(a[i] < a[j]){
                b[k++] = a[i++];
            }
            else{
                b[k++] = a[j++];
            }
        }
        if(i > mid){
            while(j <= right){
                b[k++] = a[j++];
            }
        }
        else{
            while(i <= mid){
                b[k++] = a[i++];
            }
        }
        for(k = left; k <= right; k++){
            a[k] = b[k];
        }
    }
}
