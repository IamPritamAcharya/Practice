import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode103 {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.add(root);

        boolean leftToRight = true;
        while (!nodesQueue.isEmpty()) {

            int size = nodesQueue.size();

            List<Integer> row = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = nodesQueue.poll();


                if (leftToRight) {
                    row.add(node.val); 
                } else {
                    row.add(0, node.val); 
                }

                if (node.left != null) {
                    nodesQueue.add(node.left);
                }
                if (node.right != null) {
                    nodesQueue.add(node.right);
                }
            }

            leftToRight = !leftToRight;

            result.add(row);
        }

        return result;
    }

    public static TreeNode arrayToTree(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            if (arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        Integer[] tree = { 3, 9, 20, null, null, 15, 7 };
        TreeNode root = arrayToTree(tree);

        System.out.println(zigzagLevelOrder(root));
    }
}
