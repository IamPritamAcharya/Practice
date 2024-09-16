import java.util.Stack;

public class leetcode844 {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st_s = new Stack<>();
        Stack<Character> st_t = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c != '#') {
                st_s.push(c);
            } else if (!st_s.isEmpty()) {
                st_s.pop();
            }
        }

        for (char c : t.toCharArray()) {
            if (c != '#') {
                st_t.push(c);
            } else if (!st_t.isEmpty()) {
                st_t.pop();
            }
        }

        return st_s.equals(st_t);
    }

    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";
        System.out.println(backspaceCompare(s, t));
    }
}
