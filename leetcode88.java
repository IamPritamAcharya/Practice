import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n==0) {
            return;
        }
        int p1 = m-1;
        int p2 = n-1;
        int p = m+n -1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums2[p2]>nums1[p1]) {
                nums1[p] = nums2[p2];
                p2--;
            } else {
                nums1[p] = nums1[p1];
                p1--;
            }
            p--;
        }

        while (p2>=0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
        System.out.println(Arrays.toString(nums1));
    }


    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int m = 3;
        int[] nums2 = {1,2,3};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
