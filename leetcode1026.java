public class leetcode1026 {
    public static int maxAncestorDiff(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
    
        return helper(root, max, min);
    }

    private static int helper(TreeNode root, int max, int min) {
        if (root == null) {
            return max - min;
        }

        if (root.val < min) {
            min = root.val;
        } 
        if (root.val > max) {
            max = root.val;
        }

        int leftDiff = helper(root.left, max, min);
        int rightDiff = helper(root.right, max, min);

        return Math.max(leftDiff, rightDiff);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(13);

        System.out.println(maxAncestorDiff(root));

    }
}
