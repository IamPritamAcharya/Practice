import java.util.Arrays;
import java.util.HashMap;

public class leetcode27 {

    public static int removeElement1(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] !=  val) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(j);
        System.out.println(Arrays.toString(nums));
        

        return j;
    }

    public static int removeElement(int[] nums, int val) {
        int j = 1;
        int i = 0;
        int count = 0;
        while (i!=j) {
            if (nums[i] ==  val) {
                if (nums[nums.length-j] == val) {
                    j++;
                }
                int temp = nums[nums.length-j];
                nums[nums.length-j] = nums[i];
                nums[i] = temp;
                j++;
                count++;
            } 
            i++;
        }
        System.out.println(j);
        System.out.println(Arrays.toString(nums));
        

        return j;
    }


    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        removeElement(arr, 2);
    }
}
