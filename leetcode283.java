import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode283 {
    public static void moveZeroes(int[] nums) {
        int pointer = 0;

        for (int i: nums) {
            if (i != 0) {
                nums[pointer] = i;
                pointer++;
            }
        }

        for (int i = pointer; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
}
