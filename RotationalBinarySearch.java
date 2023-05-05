public class RotationalBinarySearch {
    public static void main(String[] args) {
        int a[]={20,30,40,50,60,5,10};
        int key = 10;
        int n = a.length;
        int position=binarySearch(a,key,0,n-1);
        System.out.println(position);

    }
    static int binarySearch(int a[], int key,int low,int high){


        if(low>high)return -1;
            int mid=(low+high)/2;
            if(a[mid]==key)
                return mid;
            if(a[low]<=a[mid]){
                if(key>=a[low] && key<a[mid]){
                    return binarySearch(a,key,low,mid-1);
                }
                else{
                    return binarySearch(a,key,mid+1,high);
                }
            }
            if(key>=a[mid] && key<=a[high])
                return binarySearch(a,key,mid+1,high);
            return binarySearch(a,key,low,mid-1);



    }
}
