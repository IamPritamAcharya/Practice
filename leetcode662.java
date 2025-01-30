import java.util.*;

class Pair {
    TreeNode node;
    int idx;

    Pair(TreeNode node, int idx) {
        this.node = node;
        this.idx = idx;
    }
}

public class leetcode662 {
    public static int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            int mmin = q.peek().idx;
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                int curr_index = q.peek().idx - mmin;
                TreeNode node = q.poll().node;

                if (i == 0) {
                    first = curr_index;
                }
                if (i == size - 1) {
                    last = curr_index;
                }

                if (node.left != null) {
                    q.add(new Pair(node.left, 2 * curr_index + 1));
                }
                if (node.right != null) {
                    q.add(new Pair(node.right, 2 * curr_index + 2));
                }

            }
            ans = Math.max(ans, last - first + 1);
        }

        return ans;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);

        root.right.right = new TreeNode(9);

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);

        root1.left.left = new TreeNode(5);
        root1.right.right = new TreeNode(9);

        root1.left.left.left = new TreeNode(6);
        root1.right.right.left = new TreeNode(7);

        System.out.println(widthOfBinaryTree(root));

    }
}
