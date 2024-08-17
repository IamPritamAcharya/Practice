import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode905 {
    public static int countEven(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i%2==0) {
                count++;
            }
        }

        return count;
    }

    public static int[] sortArrayByParity(int[] nums) {
        int no_of_even = countEven(nums);
        int ans[] = new int[nums.length];
        int index = 0;
        int indexodd = no_of_even;
        for (int i=0; i<nums.length;i++) {
            if (nums[i]%2==0) {
                ans[index]=nums[i];
                index++;
            } else {
                ans[indexodd] = nums[i];
                indexodd++;
            }
        }

        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        sortArrayByParity(arr);

    }
}
