import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class leetcode80 {

    public static int removeDuplicates(int[] nums) {
        int p1 = 0; 
        
        for (int i = 0; i < nums.length; i++) {
            if (p1 < 2 || nums[i] != nums[p1 - 2]) {
                nums[p1] = nums[i];
                p1++;
            }
        }

        return p1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        removeDuplicates(arr);
    }
}
