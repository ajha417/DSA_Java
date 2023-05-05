import java.util.Scanner;

public class HeapDataStructure {
    public static void main(String[] args) {
        //basically, only complete binary tree can be heap data structure
        //we have properties of heap
        //there is max heap and min heap
        Scanner sc = new Scanner(System.in);
        int a[] = new int[1000];

        a[0]=50;
        a[1]=30;
        a[2]=40;
        a[3]=10;
        a[4]=5;
        a[5]=20;
        a[6]=30;
        int n=7;
       int x= insert(a,n,60);
//        delete(a,n);
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }

    }
    /*static  void delete(int a[],int n){
        a[0]=a[n-1];
        n=n-1;
        int i=0;
        int left;
        int right,larger;
        while(i<n){
            if(a[2*i]!=0 && a[2*i+1]!=0){
                left = a[2*i];
                right = a[2*i+1];
                 larger = left>right?2*i:2*i+1;
            }
            if(a[2*i]==0){
                left = 0;
                right = a[2*i+1];
                 larger = 2*i+1;
            }
            if(a[2*i+1]==0){
                left = 2*i;
                right = 0;
               larger = 2*i;
            }
            if(a[i]<a[larger]){

            }
        }

    }*/
    static void heapify(int a[],int n,int i){
        //this is for insertion
        int parent = (i-1)/2;
        if(a[parent]>0){
            if(a[i]>a[parent]){
                swap(a,i,parent);
                heapify(a,n,parent);
            }
        }
    }
    static  int insert(int a[],int n,int value){
        n=n+1;
        a[n-1]=value;

        heapify(a,n,n-1);
        return n;
    }
    static  void swap(int a[],int i,int j){
        int temp =a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}
