import java.lang.reflect.Array;
import java.util.*;

public class leetcode2415 {
    public static TreeNode reverseOddLevels(TreeNode root) {
        helperReverse(root.left, root.right, 1);
        return root;
    }

    public static void helperReverse(TreeNode left, TreeNode right, int level) {
        if (left == null || right == null) {
            return;
        }

        if (level % 2 != 0) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }

        helperReverse(left.left, right.right, level++);
        helperReverse(left.right, right.left, level++);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(13);
        root.right.left = new TreeNode(21);
        root.right.right = new TreeNode(34);

        System.out.println(reverseOddLevels(root));
    }
}