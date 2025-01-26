public class lcc1 {
    public static int countPartitions(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int totalSum = 0;
        int count = 0;

        for (int i : nums) {
            totalSum += i;
        }

        int currSum = 0;

        for (int j = 0; j < nums.length - 1; j++) {
            currSum += nums[j];
            if ((currSum-(totalSum - currSum)) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(countPartitions(nums));
    }
}
