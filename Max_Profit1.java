public class Max_Profit1 {
    public static void main(String[] args) {
        int a[]={5,2,6,1,4,7,3,6};
        int result = find_profit(a);
        System.out.println(result);

    }
    public static int find_profit(int a[]){
        int profit = 0;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){  //here we are checking if the current element is greater than previous element or not
                //if it is greater than only we will buy the stock at previous point and sell it on this point
                profit = profit + (a[i]-a[i-1]);
            }
        }
        return profit;
    }
}
