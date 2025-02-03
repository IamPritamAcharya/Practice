import java.util.Arrays;

public class leetcode129 {
    public static int sumNumbers(TreeNode root) {
        return helper(root, 0);
        
    }

    static int helper(TreeNode root, int currSum) {
        if (root == null) {
            return 0;
        }

        currSum = currSum*10 + root.val;

        if (root.left == null && root.right == null) {
            return currSum;
        }

        return helper(root.left, currSum) + helper(root.right, currSum);
    }

    

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(5);
        node.left.right = new TreeNode(1);

        sumNumbers(node);


    }
}
