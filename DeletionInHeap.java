public class DeletionInHeap {
    static void heapfiy(int arr[],int n,int i){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && arr[l]>arr[largest]){
            largest = l;
        }
        //check if right child is larger than its parent node
        if(r<n && arr[r]>arr[largest]){
            largest = r;
        }
        //if largest is not root
        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapfiy(arr,n,largest);
        }


    }
    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }

    static int deleteRoot(int arr[],int n){
        arr[0]=arr[n-1];
        n=n-1;
        heapfiy(arr,n,0);
        return n;
    }
    public static void main(String[] args) {
        int arr[]={10,5,3,2,4};
        //whenever we talk about deletion in heap then basically we delete the root node
        int n = arr.length;
        n = deleteRoot(arr,n);
        printArray(arr,n);
    }
}
