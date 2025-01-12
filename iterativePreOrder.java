import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativePreOrder {

    static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();

        if (root == null) {
            return preorder;
        }

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            root = st.pop();

            preorder.add(root.val);

            if (root.right != null) {
                st.add(root.right);
            } if (root.left != null) {
                st.add(root.left);
            }
        }

        return preorder;
    }

    public static void main(String[] args) {
        
    }
}