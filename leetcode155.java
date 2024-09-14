import java.util.Stack;
class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;


    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if (st.empty()) {
            st.push(val);
            min.push(val);
        } else {
            st.push(val);
            min.push(Math.min(val, min.peek()));
        }
    }
    
    public void pop() {
        if (st.empty()) {
            System.out.println("Empty");
        } else {
            st.pop();
            min.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

class MinStackBetter {
    Stack<Integer> st;
    int min = Integer.MAX_VALUE;

    public MinStackBetter() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.empty()) {
            min = val;
            st.push(val);
        } else {
            if (val >= min) {
                st.push(val);
            } else {
                st.push(val);
                min = val;
            }
        }
    }

    public void pop() {
        if (st.empty()) {
            System.out.println("Empty Stack!");
        } else {
            int x = st.pop();
            if (x < min) {
                min = 2 * min - x;
            }
        }
    }

    public int top() {
        if (st.empty()) {
            System.out.println("Empty Stack!");
            return -1;
        }
        int x = st.peek();
        if (x < min) {
            return min;
        } else {
            return x;
        }
    }

    public int getMin() {
        if (st.empty()) {
            System.out.println("Empty Stack!");
            return -1;
        }
        return min;
    }
}

public class leetcode155 {


}
