public class SelectionSort {
    public static void main(String[] args) {
        int []a={5,3,1,8,10,7,9};
        //at first the array is unsorted
        //only first element is regarded as sorted
        //the lowest value is found from the unsorted sub-array and it is swapped with the element

        int n = a.length;
        System.out.println("Before sorting");
        printSolution(a);
        selectSort(a,n);
        System.out.println();
        System.out.println("After sorting");
        printSolution(a);

    }
    static void printSolution(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }
    static void selectSort(int a[],int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            if(min!=i){
                swap(a,min,i);
            }
        }
    }
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
