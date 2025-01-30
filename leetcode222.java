public class leetcode222 {
    public static int countNodes(TreeNode root) {
        int[] count = new int[1];
        inOrder(root, count);
        return count[0];
    }

    private static void inOrder(TreeNode root, int[] count) {
        if (root == null) {
            return;
        }

        inOrder(root.left, count);
        count[0]++;
        inOrder(root.right, count);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();


        System.out.println(countNodes(root));
    }
}
