public class leetcode3097 {
    public static int minimumSubarrayLength(int[] nums, int k) {
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ans = ans | nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(minimumSubarrayLength(arr, 2));
    }
}
