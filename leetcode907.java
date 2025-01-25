import java.util.Stack;

public class leetcode907 {
    public static int sumSubarrayMins(int[] arr) {
        int total = 0;
        int mod = (int) (1e9 + 7);
        int[] nse = FindNse(arr);
        int[] pse = FindPse(arr);

        for (int i = 0; i < arr.length; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            total = (total + (int) (((long) right * left % mod * arr[i]) % mod)) % mod;
        }

        return total;
    }

    static int[] FindNse(int[] arr) {
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }

        return nse;
    }

    static int[] FindPse(int[] arr) {
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            ;
            st.push(i);
        }

        return pse;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        System.out.println(sumSubarrayMins(arr));
    }
}
