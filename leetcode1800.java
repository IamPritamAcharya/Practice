public class leetcode1800 {
    public static int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                sum += nums[i + 1];
            } else {
                sum = nums[i + 1];
            }

            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { 100, 10, 1 };

        System.out.println(maxAscendingSum(nums));
    }
}
