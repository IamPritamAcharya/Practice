import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                nums1[k] = nums2[j];
                i++;
                j++;
                k++;
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
}
