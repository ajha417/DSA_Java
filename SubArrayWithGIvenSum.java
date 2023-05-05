public class SubArrayWithGIvenSum {
    /*public static void main(String[] args) {
        int a[]= {10,5,-5,15,-10,5};
        //here in this problem we have to find the sub-array which should be equal to given sum
        int sum =5;
        int start =0;
        int end =0;
        int n = a.length;

        int currSum;
        for(int i=0;i<n;i++){
            currSum=a[i];
            for(int j=i+1;j<=n;j++){
                if(currSum==sum){
                    int p=j-1;
                    System.out.println("sum found between "+i+" and "+p);
                    break;
                }
                if(currSum>sum || j==n){

                    break;
                }
                currSum=currSum+a[j];
            }
        }

*/
       /* for(int i=start;i<end;i++){
            System.out.print(" "+a[i]);
        }*/

    int subArraySum(int arr[], int n, int sum)
    {
        int curr_sum, i, j;

        // Pick a starting point
        for (i = 0; i < n; i++) {
            curr_sum = arr[i];

            // try all subarrays starting with 'i'
            for (j = i + 1; j <= n; j++) {
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.println(
                            "Sum found between indexes " + i
                                    + " and " + p);
                    return 1;
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }

        System.out.println("No subarray found");
        return 0;
    }

    public static void main(String[] args)
    {
        SubArrayWithGIvenSum arraysum = new SubArrayWithGIvenSum();
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        arraysum.subArraySum(arr, n, sum);
    }
}
