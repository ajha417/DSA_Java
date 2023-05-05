public class OnlyRepeatingElement {
    public static void main(String[] args) {
        int a[]={5,4,4,4,3,2,2,2,3,3,5,5};
        //here we have to find only non-repeating element from the array where all elements repeat k times
        int k=3;
        int result=findNonRepeatingElements(a,k);
        System.out.println(result);

    }
    static int findNonRepeatingElements(int a[],int k){
        int INT_SIZE=32;
        int count[]=new int[INT_SIZE];

        for(int i=0;i<INT_SIZE;i++){
            for(int j=0;j<a.length;j++){
                if((a[j]&(1<<i))!=0){
                    count[i]+=1;
                }
            }
        }
        int res=0;
        for(int i=0;i<INT_SIZE;i++){
            res+=(count[i]%k)*(1<<i);
        }
        res=res/(a.length%k);

        return res;
    }
}
