public class leetcode2239 {
    public static int findClosestNumber(int[] nums) {
        int ans = nums[0];

        for (int i : nums) {
            if (Math.abs(ans) > Math.abs(i)) {
                ans = i;
            } else if (Math.abs(ans) == Math.abs(i)) {
                ans = Math.max(ans, i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,-1,1};
        System.out.println(findClosestNumber(nums));
    }
}
