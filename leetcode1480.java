import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode1480 {
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < ans.length; i++) {
            sum+=nums[i];
            ans[i] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        runningSum(arr);
    }
}
