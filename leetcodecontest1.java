public class leetcodecontest1 {

    public static int subarraySum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            if (start<0) start = 0;
            
            for (int j = start; j <= i; j++) {
                sum+=nums[j];
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,1,2};
        System.out.println(subarraySum(nums));
    }
}
