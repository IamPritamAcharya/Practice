
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class leetcode349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> ansSet = new HashSet<>(); 


        if (nums1.length > nums2.length) {
            for (int num : nums2) {
                set.add(num);
            }

            for (int i : nums1) {
                if (set.contains(i)) {
                    ansSet.add(i);
                }
            }
        } else {
            for (int num : nums1) {
                set.add(num);
            }
            for (int i : nums2) {
                if (set.contains(i)) {
                    ansSet.add(i);
                }
            }
        }

        int ansArr[] = new int[ansSet.size()];
        int index = 0;
        for (int num : ansSet) {
            ansArr[index++] = num;
        }

        return ansArr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        intersection(nums1, nums2);
    }
}
