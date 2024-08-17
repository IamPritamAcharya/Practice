import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode1929 {
    public static int[] getConcatenation(int[] nums) {
        int ans[] = new int[2*nums.length];
        int k = 0;
        int p1 = 0;
        int p2 = nums.length;

        while (k!=nums.length) {
            ans[p1] = nums[k];
            ans[p2] = nums[k];
            k++;
            p1++;
            p2++;
        }
        
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        getConcatenation(arr);
    }
}
