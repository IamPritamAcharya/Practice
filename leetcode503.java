import java.util.Arrays;
import java.util.Stack;

public class leetcode503 {
    public static int[] nextGreaterElements(int[] nums) {
        int[] nge = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        int n = nums.length;

        for (int i = 2*n - 1; i >= 0; i--) {
            while (!st.empty() && st.peek()<=nums[i%n]) {
                st.pop();
            }
            if (i<n) {
                nge[i] = st.empty() ? -1 : st.peek();
            }
            st.push(nums[i%n]);
        }

        return nge;
    }

    public static int[] nextGreaterElements2(int[] nums) {
        int[] nge = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        
        for (int i = nums.length-1; i >=0; i--) {
            st.push(nums[i]);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.empty() && st.peek()<=nums[i]) {
                st.pop();
            }
            if (st.empty()) {
                nge[i] = -1;

            } else {
                nge[i] = st.peek();
            }
            st.push(nums[i]);
        }

        return nge;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};
        int[] ans = nextGreaterElements(nums);
        System.out.println(Arrays.toString(ans));
    }
}
