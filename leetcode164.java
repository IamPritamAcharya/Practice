import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode164 {
    public static int maximumGap(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        Arrays.sort(nums);
        int ans = nums[0] - nums[1];


        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] - nums[i] > ans) {
                ans = nums[i+1] - nums[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,6,9,1};
        System.out.println(maximumGap(nums));
    }
}
