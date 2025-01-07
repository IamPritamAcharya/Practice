public class leetcode485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int prev_count = 0;

        for (int i : nums) {
            if (i == 1) {
                count++;
            }
            if (i == 0) {
                prev_count = Math.max(count, prev_count);
                count = 0;
            }
        }

        return Math.max(count, prev_count);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
