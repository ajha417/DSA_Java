import java.util.HashMap;

public class Moore_Algorithm {
    public static void main(String[] args) {
        int a[]={1,2,5,1,1,1,2};

        /*int index = 0;
        int count = 1;
        for(int i=0;i<a.length;i++){
            if(a[i]==a[index]){
                count++;

            }
            else{
                count--;

            }
            if(count==0){
                index=i;
                count=1;
            }

        }
        if(count>a.length/2){
            System.out.println("Element is "+a[index]);
        }*/
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int flag=1;
        for(int i=0;i<a.length;i++) {
            if (map.containsKey(a[i])) {
                int count = map.get(a[i]) + 1;
                if (count > a.length / 2) {
                    System.out.println("Element is " + a[i]);
                    flag=0;

                } else {
                    map.put(a[i], count);
                }

            } else {
                map.put(a[i], 1);
            }
        }
        if(flag==1) {
            System.out.println("No majority found");
        }
    }
}
