public class Sorting_0s1s {
    public static  void sorting(int []arr,int n){
        int low=0;
        int high=n-1;
        int mid=0,temp=0;
        while (mid<=high){
            switch (arr[mid]){
                case 0:
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;

                case 2:
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
            }
        }
    }
    public static  void display(int []arr,int n){
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int a[]={0,2,1,0,1,2};
        System.out.println("elements before sorting");
        display(a,a.length);
        sorting(a,a.length);
        System.out.println("elements after sorting");
        display(a,a.length);
    }
}
