import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode2161 {
    public static int[] pivotArray(int[] nums, int pivot) {
        int size = nums.length;
        int[] ans = new int[size];
        int index = 0;

        for (int i = 0; i < size; i++) {
            if (nums[i] < pivot) {
                ans[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < size; i++) {
            if (nums[i] == pivot) {
                ans[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < size; i++) {
            if (nums[i] > pivot) {
                ans[index] = nums[i];
                index++;
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(pivotArray(nums, 10)));
    }
}
