public class leetcode230 {
    public int kthSmallest(TreeNode root, int k) {
        int[] result = new int[1];
        int[] count = new int[1];
        helper(root, k, count, result);
        return result[0];
    }

    private void helper(TreeNode root, int k, int[] count, int[] result) {
        if (root == null)
            return;

        helper(root.left, k, count, result);

        count[0]++;
        if (count[0] == k) {
            result[0] = root.val;
            return;
        }

        helper(root.right, k, count, result);
    }

}
