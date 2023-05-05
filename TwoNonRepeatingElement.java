public class TwoNonRepeatingElement {
    public static void main(String[] args) {
        int a[]={1,2,2,1,3,5,5,4};
        //here all the elements are repeating twice
        //we have to find two non-repeating elements from this array
        int res=0;
        for(int i=0;i<a.length;i++){
            res=res^a[i];
        }
        res=res&-res;  //this line is for making two groups of the elements
        int res1=0,res2=0;
        for(int i=0;i<a.length;i++){
            if((a[i]&res)>0){
                res1=a[i]^res1;
            }
            else{
                res2=a[i]^res2;
            }
        }
        System.out.println("the non-repeating elements are: "+res1+" and "+res2);
    }
}
