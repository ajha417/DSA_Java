public class CWH_array {
    public static void main(String[] args) {
        //This is the first way how we can declare array
//        int [] arr=new int[5];
//        arr[1]=4;
//        arr[0]=23;
//        arr[2]=45;
//        arr[3]=55;
//        arr[4]=100;
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        //this is the second way how we can declare array

        int [] arr2;
        arr2= new int[5];
        arr2[0]=23;
        arr2[1]=43;
        arr2[2]=53;
        arr2[3]=100;
        arr2[4]=800;
//        for(int i=0;i<5;i++){
//            System.out.println(arr2[i]);
//        }

        //displaying the array elements using for-each loop

        for(int i:arr2){
            System.out.println(i);
        }
    }
}
