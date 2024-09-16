import java.util.Stack;

public class leetcode682 {
    public static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for (String s : operations) {
            if (s.equals("C")) {
                st.pop();
            } else if (s.equals("D")) {
                st.push(st.peek()*2);
            } else if (s.equals("+")) {
                int num1 = st.peek();
                st.pop();
                int num2 = st.peek();
                st.push(num1);
                st.push(num1+num2);
            } else {
                st.push(Integer.parseInt(s));
            }
        }

        for (int i : st) {
            ans+=i;
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        System.out.println(calPoints(ops));


    }
}
