import java.util.Stack;

public class leetcode85 {

    public static int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int maxArea = 0;
        int[][] pSum = new int[n][m];

        for (int j = 0; j < m; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == '0') {
                    sum = 0; 
                } else {
                    sum += matrix[i][j] - '0'; 
                }
                pSum[i][j] = sum;
            }
        }

        for (int i = 0; i < n; i++) {
            maxArea = Math.max(maxArea, largestRectangleArea(pSum[i]));
        }

        return maxArea;
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxA = 0;
        int n = heights.length;

        for (int i = 0; i <= heights.length; i++) {
            while (!st.isEmpty() && (i == n || heights[st.peek()] >= heights[i])) {
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
        char[][] matrix = {
            {'0', '1'},
            {'1', '0'}
        };
        
        System.out.println(maximalRectangle(matrix));
    }
}
