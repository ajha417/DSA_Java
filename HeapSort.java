public class HeapSort {
    public static void main(String[] args) {
        int a[]  = {40,10,30,50,60,15};
        int n = a.length;
        heapSort(a,n);
        printHeap(a,n);
    }
   static void printHeap(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
    }
   static void buildHeap(int a[],int n){
        int startIdx = (n/2)-1;
        for(int i=startIdx;i>=0;i--){
            heapify(a,n,i);
        }
    }
    static void heapify(int a[],int n,int i){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && a[l]>a[largest])
            largest = l;
        if(r<n && a[r]>a[largest])
            largest = r;
        if(largest!=i){
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a,n,largest);
        }
    }
    static void heapSort(int a[],int n){
        buildHeap(a,n);
        for(int i=n-1;i>=1;i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a,i,0);
        }
    }

}
