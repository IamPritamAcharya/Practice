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

public class leetcode94 {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        inorderTraversal_helper(root, output);

        return output;
    }

    public static void inorderTraversal_helper(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        inorderTraversal_helper(root.left, ans);
        ans.add(root.val);
        inorderTraversal_helper(root.right, ans);
        
    }
}
