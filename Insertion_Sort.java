public class Insertion_Sort {
    public static void main(String[] args) {
//        here we will be coding for insertion sort
//        In Insertion sort we have two sub-arrays one is sorted and other is unsorted
//        we basically compare the element of unsorted sub-array with the element of sorted sub-array
//        and, then we determine the position of that element
        int a[]={8,4,1,5,9,2};
        System.out.println("before sorting");
        printSolution(a);
//        int n=a.length;
//        for(int i=1;i<n;i++){
//            int temp = a[i];
//            int j=i-1;
//            while(j>=0 && a[j]>temp){
//                a[j+1]=a[j];
//                j--;
//            }
//            a[j+1]=temp;
//        }
        int n = a.length;
        for(int i = 1; i < n; i++){
            int temp = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        System.out.println();
        System.out.println("After sorting");
        printSolution(a);
    }
    public static void printSolution(int a[]){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(" "+a[i]);
        }
    }
}
