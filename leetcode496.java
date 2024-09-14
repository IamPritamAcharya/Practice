import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class leetcode496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> ngeMap = new HashMap<>();
        Stack<Integer> st = new Stack<>();


        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            ngeMap.put(nums2[i], st.isEmpty() ? -1 : st.peek());

            st.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = ngeMap.get(nums1[i]);
        }

        return ans;
    }

    
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        nextGreaterElement(nums1, nums2);

    }
}
