import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        int size = q.size();
        q.add(x);
        for (int i = 0; i < size; i++) {
            q.add(q.peek());
            q.remove();
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */