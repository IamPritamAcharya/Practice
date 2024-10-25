import java.util.Scanner;
import java.util.Stack;

public class codechef_mountainpeak {
    public static int[] nextHigherPeak(int[] heights) {
        
        int[] ans = new int[heights.length];
        Stack<Integer> st = new Stack<>();

        for (int j = heights.length - 1; j >= 0; j--) {
            
            while(!st.isEmpty() && st.peek() <= heights[j]){
                st.pop();
            }

            ans[j] = st.isEmpty() ? -1 : st.peek();
            st.push(heights[j]);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; ++i) {
            heights[i] = sc.nextInt();
        }

        int[] result = nextHigherPeak(heights);

        for (int height : result) {
            System.out.print(height + " ");
        }
        System.out.println();
    }
}
