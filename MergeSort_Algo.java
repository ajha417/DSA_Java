public class MergeSort_Algo {
    public static void main(String[] args) {
        int a[]={5,2,1,7,6,3,0};
        int n = a.length;
        int left = 0;
        int right = n-1;
        mergeSort(a,left,right);
        printSolution(a);
    }
    static void mergeSort(int a[],int left,int right){
     if(left < right){
         int mid = (left + right)/2;
         mergeSort(a,left,mid);
         mergeSort(a,mid + 1,right);
         merge(a,left,mid,right) ;
     }
    }
    static void merge(int a[],int left,int mid,int right){
        int n = a.length;
        int b[] = new int[n];
        int i = left;
        int j = mid+1;
        int k = left;
        while(i <= mid && j <= right){
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
        for(k = left;k <= right;k++){
            a[k] = b[k];
        }

    }
   static void printSolution(int a[]){
        for(int i = 0;i < a.length;i++){
            System.out.print(" "+a[i]);
        }

    }
}
