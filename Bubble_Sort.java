public class Bubble_Sort {
    public static void main(String[] args) {
        int a[]={2,1,5,3,9,4,6};
        System.out.println("Before sorting");
        printSolution(a);
        int n = a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }
        System.out.println();
        System.out.println("After sorting");
        printSolution(a);
    }
    public static  void swap(int a[],int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void printSolution(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]+" ");
        }
    }
}
