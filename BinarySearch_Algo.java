public class BinarySearch_Algo {
    public static void main(String[] args) {
        int a[]={-3,-2,1,3,4,5,7,9};
        int key = 7;
        int result = findIndex(a,0,a.length-1,key);
        if(result!=-1){
            System.out.println(key+" is found at position "+result);
        }
        else{
            System.out.println(key+ " is not fount in array");
        }

    }
    static int findIndex(int a[],int low,int high,int key){
        //this is iterative way to solve the problem
        /*while(low<=high){
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
        return -1;*/
        //now let's do it by recursively
        if(low>high)return -1;
        int mid = (low+high)/2;
        if(a[mid]==key)return mid;
        if(a[mid]<key){
            return findIndex(a,mid+1,high,key);
        }
        return findIndex(a,low,mid-1,key);
    }
}
