public class leetcode3151 {
    public static boolean isArraySpecial(int[] nums) {
        if (nums.length == 1) {
            return false;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] % 2 == nums[i+1]%2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
    int[] arr = {1};
        System.out.println(isArraySpecial(arr));
    }
}