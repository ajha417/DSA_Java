import java.util.Arrays;

public class LargestPerimeterInRectangle {
    public static void main(String[] args) {
        int nums[] = new int[]{2,1,2};
        int ans = largestPerimeter(nums);
        System.out.println(ans);
    }
    private static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 1; i > 1 ; --i){
            if(nums[i] < nums[i-1] + nums[i-2])
                return nums[i] + nums[i-1] + nums[i-2];
        }
        return 0;
    }
}
