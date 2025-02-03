public class leetcode3105 {
    public static int longestMonotonicSubarray(int[] nums) {
        int maxi = 1;
        int maxd = 1;
        int ans = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                maxd++;
                maxi = 1;
            } else if (nums[i] < nums[i + 1]) {
                maxi++;
                maxd = 1;
            } else {
                maxd = 1;
                maxi = 1;
            }

            ans = Math.max(ans, Math.max(maxi, maxd));
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestMonotonicSubarray(new int[] { 1, 9, 7, 1 })); // 3
        System.out.println(longestMonotonicSubarray(new int[] { 1, 4, 3, 3, 2 })); // 2
        System.out.println(longestMonotonicSubarray(new int[] { 3, 3, 3, 3 })); // 1
        System.out.println(longestMonotonicSubarray(new int[] { 3, 2, 1 })); // 3
        System.out.println(longestMonotonicSubarray(new int[] { 1, 5, 2, 7 })); // 2
    }
}
