public class Majority_Element {
    public static void main(String[] args) {
        int a[]= {1,2,4,4,1,1,1};
        int maxCount= 0;
        int index = -1;
        for (int i = 0; i <a.length ; i++) {
            int count = 0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                 count++;
                }
            }
            if(count>maxCount){
                maxCount = count;
                index=i;
            }
        }
        if(maxCount>a.length/2){
            System.out.println("The element is "+a[index]);
        }
        else{
            System.out.println("No Majority element found");
        }
    }
}
