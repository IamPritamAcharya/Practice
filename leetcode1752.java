import java.util.Arrays;

public class leetcode1752 {

    public static boolean check(int[] nums) {
        int n = nums.length;
        int countInversions = 0;
        
        // Count the number of inversions in the array
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                countInversions++;
            }
        }

        // The array is a rotation of a sorted array if there is at most 1 inversion
        return countInversions <= 1;
    }

    public static void main(String[] args) {
        // 1,3,9,6,10,5,3,8,9,1
        // 3,4,5,1,2
        // 6,10,6
        int arr[] = {6,10,6};
        System.out.println(check(arr));
    }
}
