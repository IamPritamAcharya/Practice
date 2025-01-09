public class leetcode1909 {
    public static boolean canBeIncreasing(int[] nums) {
        int removalCount = 0;
    
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) { // If the sequence is not increasing
                removalCount++; 
                if (removalCount > 1) return false; // Can't remove more than one element
                
                // Check if removing nums[i-1] or nums[i] fixes the issue
                if (i > 1 && nums[i] <= nums[i - 2] && i + 1 < nums.length && nums[i + 1] <= nums[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    

    public static void main(String[] args) {
        int[] arr = {100,21,100};

        System.out.println(canBeIncreasing(arr));
    }
}
