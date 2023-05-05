public class LinearSearch {
    public static void main(String[] args) {
        int key = 6;
        int arr[] = {4,1,10,20,6,12,5};
        int n = arr.length;
//        implementing linear search
        int flag = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                System.out.println("Element found at index:"+i);
                flag = 1;
                break;
            }
        }
        if(flag==0){

            System.out.println("Element not found");
        }

    }
}
