import java.util.*;

public class leetcode946 {
    
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length) {
            return false;
        }

        Stack<Integer> st = new Stack<>();
        int j = 0;
        
        for (int num : pushed) {
            st.push(num);

            while (!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }
        return st.isEmpty();

    }

    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};

        System.out.println(validateStackSequences(pushed, popped));
    }

}
