public class leetcode35 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        if (target > nums[nums.length-1]) {
            return nums.length;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                index = mid;
                right = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
}
