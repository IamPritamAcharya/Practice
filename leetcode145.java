import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class leetcode145 {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        postorderTraversal_helper(root, output);

        return output;
    }

    public static void postorderTraversal_helper(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        postorderTraversal_helper(root.left, ans);
        postorderTraversal_helper(root.right, ans);
        ans.add(root.val);
    }
}
