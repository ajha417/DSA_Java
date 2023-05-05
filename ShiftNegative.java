public class ShiftNegative {
    public static void main(String[] args) {
        int a[] = {3,2,9,-1,5,3,-2,-3,2,0};
        int left = 0;
        int high = a.length-1;
        while(left<=high){
            if(a[left]<0 && a[high]<0){ //here both negative
                left++;
            } else if(a[left]<0 && a[high]>0) {
                left++;
                high--;
            }
            else if(a[left]>0 && a[high]<=0){
                int temp=a[left];
                a[left]=a[high];
                a[high] = temp;
                left++;
                high--;
            }
            else{
                high--;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
    }
}
