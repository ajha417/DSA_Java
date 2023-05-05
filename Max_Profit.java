public class Max_Profit {
    public static void main(String[] args) {
        int a[]={3,1,4,8,7,2,5};
        int result = find_maxProfit(a);
        System.out.println("The maximum profit will be:"+result);
    }
   public static int find_maxProfit(int a[]){
        int minSoFar=a[0];
        int maxProfit=0;
        for(int i=0;i<a.length;i++){
           minSoFar= Math.min(minSoFar,a[i]);
           int profit = a[i]-minSoFar;
           maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
