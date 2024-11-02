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

public class leetcode110 {
    public static int height_bt(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = height_bt(root.left);
        int rh = height_bt(root.right);
        
        if (lh == -1 || rh == -1) {
            return -1;
        }

        if (Math.abs(lh - rh) > 1) {
            return -1;
        }

        return Math.max(lh, rh) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        return height_bt(root) != -1;
    }
}
