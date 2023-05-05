import java.util.Arrays;

public class Majority_Element1 {
    public static void main(String[] args) {
        int a[]={1,2,1,3,4,1,1,1,4,4,4,4,4,4,4,4,4,4,4 };
        Arrays.sort(a);
        int n = a.length;
        int temp=a[0];
        int max_ele=-1;
        int count=1;
        int ele=0;
        for(int i=0;i<n;i++){
            if(temp==a[i]){
                count++;
            }
            else{
                count = 1;
                temp = a[i];
            }
            if(max_ele<count){
                max_ele=count;
                ele=a[i];
                if(max_ele>n/2){
                    break;
                }
            }

        }
        System.out.println("The element is "+ele);

    }
}
