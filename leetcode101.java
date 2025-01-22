public class leetcode101 {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetricHelper(root.left, root.right);
    }

    static boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }

        return (left.val == right.val)
                && isSymmetricHelper(left.left, right.right)
                && isSymmetricHelper(left.right, right.left);
    }
}
