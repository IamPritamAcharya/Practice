import java.util.*;

public class leetcode84 {

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxA = 0;
        int n = heights.length;

        for (int i = 0; i <= heights.length; i++) {
            while (!st.isEmpty() && (i==n || heights[st.peek()] >= heights[i])) {
                int height = heights[st.peek()];
                st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                int breath = nse - pse - 1;
                maxA = Math.max(maxA, height * breath);
            }
            st.push(i);
        }

        return maxA;
    }

    public static void main(String[] args) {
        int[] heights = { 2, 1, 5, 6, 2, 3 };
        System.out.println(largestRectangleArea(heights));
    }
}
