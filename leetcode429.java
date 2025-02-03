import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
        children = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children != null ? _children : new ArrayList<>();
    }
}

public class leetcode429 {
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                temp.add(curr.val);

                if (curr.children != null) {
                    queue.addAll(curr.children);
                }
            }

            ans.add(temp);
        }

        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node child1 = new Node(3);
        Node child2 = new Node(2);
        Node child3 = new Node(4);
        Node child4 = new Node(5);
        Node child5 = new Node(6);

        root.children = new ArrayList<>();
        child1.children = new ArrayList<>();

        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        child1.children.add(child4);
        child1.children.add(child5);

        List<List<Integer>> result = levelOrder(root);

        System.out.println(result);
    }
}
