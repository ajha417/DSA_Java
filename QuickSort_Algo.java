public class QuickSort_Algo {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1,9,8,7};
        int n=a.length;
        System.out.println("Before sorting");
        printSolution(a);
        quickSort(a,0,n-1);
        System.out.println();
        System.out.println("After sorting");
        printSolution(a);

    }
    static void quickSort(int a[],int low,int high){
        if(low<high){
            int pivot = partition(a,low,high);
            quickSort(a,low,pivot-1);
            quickSort(a,pivot+1,high);
        }
    }
    static void quicksorting(int a[],int low,int high){
        if(low < high){
            int pivot = partitionIt(a,low,high);
            quicksorting(a,low,pivot-1);
            quicksorting(a,pivot+1,high);
        }
    }
    static int partitionIt(int a[],int low,int high){
        int pivot = a[high];
        int i = low-1;
        for(int j = low; j <= high-1; j++){
            if(a[j] < pivot){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,high);
        return i+1;
    }

    static int partition(int a[],int low,int high){
        int pivot = a[high];
        int i = low-1;
        for(int j=low;j<=high-1;j++){
            if(a[j]<pivot){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,high);
        return i+1;

    }
    static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void printSolution(int a[]){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(" "+a[i]);
        }
    }
}
