public class leetcode268 {
    int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }

        return sum;
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        return ((n*(n+1))/2)-sum(nums);
    }
}
