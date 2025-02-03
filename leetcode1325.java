import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode1325 {
    public static TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        }

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if (root.val == target && root.left == null && root.right == null) {
            return null;
        }
        
        return root;
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(2);
        node.right.right = new TreeNode(4);

        System.out.println(AAhelper.levelOrder(removeLeafNodes(node, 2)));

    }
}
