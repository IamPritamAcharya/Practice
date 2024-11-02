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

public class leetcode543 {

    public int FindMax(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }

        int lh = FindMax(root.left, max);
        int rh = FindMax(root.right, max);

        max[0] = Math.max(max[0], lh+rh);

        return 1 + Math.max(lh, rh);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] diamter = new int[1];
        FindMax(root, diamter);
        return diamter[0];
    }
}
