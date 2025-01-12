import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativeInOrder {
    static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        while (true) {
            if (root != null) {
                st.push(root);
                root = root.left;
            } else {
                if (st.isEmpty()) {
                    break;
                }
                root = st.pop();
                inorder.add(root.val);
                root = root.right;
            }
        }

        return inorder;
    }
}
