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

public class leetcode144 {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        preorderTraversal_helper(root, output);

        return output;
    }

    public static void preorderTraversal_helper(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        ans.add(root.val);
        preorderTraversal_helper(root.left, ans);
        preorderTraversal_helper(root.right, ans);
    }
}
