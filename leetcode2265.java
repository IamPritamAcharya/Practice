public class leetcode2265 {
    public static int averageOfSubtree(TreeNode root) {
        int[] ans = new int[1];

        helper(root, ans);
        return ans[0];
    }

    public static int[] helper(TreeNode root, int[] count) {
        if (root == null) {
            return new int[]{0,0};
        }

        int[] left = helper(root.left, count);
        int[] right = helper(root.right, count);

        int sum = left[0] + right[0] + root.val;
        int total = left[1] + right[1] + 1;

        int avg= sum/total;

        if (avg == root.val) {
            count[0]++;
        }

        return new int[]{sum, total};
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(8);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(6);

        System.out.println(averageOfSubtree(root));
    }
}
