public class ConvertToSumOfNonZero {
    public static void main(String[] args) {
        int n = 2;
        int[] ans = getNoZeroIntegers(n);
        System.out.println(ans);
    }
    private static boolean containsNonZero(int n) {
        String s = String.valueOf(n);
        return !s.contains("0");
    }
    private static int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for(int i = n - 1; i >=1 ; i--) {
            if(i % 10 != 0 && (n - i) % 10 != 0) {
                ans[0] = i;
                ans[1] = n - i;
                break;
            }
        }
        return ans;
    }
}
