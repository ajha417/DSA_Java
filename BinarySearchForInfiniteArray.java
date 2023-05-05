public class BinarySearchForInfiniteArray {
    public static void main(String[] args) {
        //here in this kind of problem we will be given infinite array
        //so, we cannot apply binary search directly otherwise it gives time complexity of O(n)
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int key = 4;
        int result = searchInfinite(a,key);
        if(result!=-1){
        System.out.println("key is found at "+result);
        }
        else{
            System.out.println("key is not found in the array") ;
        }
    }
    static int searchInfinite(int a[],int key){
        int low = 0;
        int high = 1;
        while(a[high]<key){
            low = high;
            high = 2*high;
        }
        return binarySearch(a,low,high,key);
    }
    static int binarySearch(int a[],int low,int high,int key){
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]<key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }


}
