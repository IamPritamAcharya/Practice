public class leetcode704 {
    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while (left<=right) {
            int mid = left + (right-left)/2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                right = mid-1;
            } 
            if (nums[mid] < target) {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5};
        int target = 5;

        System.out.println(search(nums, target));
    }
}
