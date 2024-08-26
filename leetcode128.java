import java.util.Arrays;

public class leetcode128 {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums); 
        System.out.println(Arrays.toString(nums));  
    
        int count = 1;
        int max = 1; 
    
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {  
                count++;
            } else if (nums[i] != nums[i + 1]) {  
                count = 1;
            }
            max = Math.max(max, count); 
        }
    
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int[] nums1 = {100,4,200,1,3,2};
        int[] nums2 = {1,2,0,1};

        System.out.println(longestConsecutive(nums2));
    }
}
