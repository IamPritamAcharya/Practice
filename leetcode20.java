import java.util.Stack;

public class leetcode20 {
    public static boolean isValid(String s) {
        if (s.length()%2 != 0) {
            return false;
        }
        
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else return false;
                }
                else if (c == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else return false;
                }
                else if (c == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else return false;
                }
            }

        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String str = "([)]";
        String str1 = "()[][]";
        String str3 = "]";
        String str4 = "{";
        System.out.println(isValid(str));
        System.out.println(isValid(str1));
        System.out.println(isValid(str3));
        System.out.println(isValid(str4));
    }
    
}