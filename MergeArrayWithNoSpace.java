public class MergeArrayWithNoSpace {

    //here we have to merge array without using extra space
    public static void main(String[] args) {
        int arr1[] = {1,5,9,10,15,20};
        int arr2[] = {2,3,8,13};
        int m = arr1.length;
        int n = arr2.length;
        merge(arr1,arr2,m,n);
        System.out.println("After  merging first array ");
        for(int i=0;i<m;i++){
            System.out.print(" "+arr1[i]);
        }
        System.out.println();
        System.out.println("After merging second array");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr2[i]);
        }


    }
    static void merge(int arr1[],int arr2[],int m,int n){

        for(int i= n-1;i>=0;i--){
            int j,last = arr1[m-1];
            for(j=m-2;j>=0 && arr1[j]>arr2[i];j--){
                arr1[j+1]=arr1[j];
            }
            //if there was greater element
            if(j!=m-2 || last>arr2[i]){
                arr1[j+1] = arr2[i];
                arr2[i] = last;
            }
        }
    }

}
