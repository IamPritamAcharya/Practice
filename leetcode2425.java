public class leetcode2425 {
    public static int xorAllNums(int[] nums1, int[] nums2) {
        int ans = 0;

        if (nums1.length % 2 != 0 && nums2.length % 2 != 0) {
            for (int i : nums1) {
                ans = ans ^ i;
            }

            for (int i : nums2) {
                ans = ans ^ i;
            }
        }

        else if (nums1.length % 2 != 0 && nums2.length % 2 == 0) {
            for (int i : nums2) {
                ans = ans ^ i;
            }
        }

        else if (nums1.length % 2 == 0 && nums2.length % 2 != 0) {
            for (int i : nums1) {
                ans = ans ^ i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] num1 = {2,1,3,4};
        int[] num2 = {10,2,5,0};
        System.out.println(xorAllNums(num1, num2));

    }
}