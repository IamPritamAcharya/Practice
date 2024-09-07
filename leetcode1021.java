import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class leetcode1021 {
    public static String removeOuterParentheses(String s) {
        int count = 0;

        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count!=0) {
                    ans.append(c);
                }
                count++;
            }
            else {
                if (count > 1) {
                    ans.append(c);
                }
                count--;
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "(()())(())";

        System.out.println(removeOuterParentheses(str));
    }
}
