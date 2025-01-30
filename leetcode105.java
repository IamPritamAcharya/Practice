public class leetcode105 {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, new int[]{0}, new int[]{0}, Integer.MIN_VALUE);
    }

    public static TreeNode helper(int[] preorder, int[] inorder, int[] p_index, int[] i_index, int stop) {
        if (p_index[0] >= preorder.length) {
            return null;
        }

        if (inorder[i_index[0]] == stop) {
            i_index[0]++;
            return null;
        }

        TreeNode node = new TreeNode(preorder[p_index[0]]);
        p_index[0]++;
        node.left = helper(preorder, inorder, p_index, i_index, node.val);
        node.right = helper(preorder, inorder, p_index, i_index, stop);
        return node;
    }

    public static void main(String[] args) {

    }
}
