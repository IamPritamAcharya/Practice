
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class leetcode124 {
    public static int maxPathSum(TreeNode root) {
        int[] max = {Integer.MIN_VALUE};
        maxPathSum_helper(root, max);
        return max[0];
    } 

    public static int maxPathSum_helper(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }

        int left_sum = Math.max(0, maxPathSum_helper(root.left, max));
        int right_sum = Math.max(0, maxPathSum_helper(root.right, max));

        max[0] = Math.max(max[0], root.val + left_sum + right_sum);

        return root.val + Math.max(left_sum, right_sum);
    }
}
