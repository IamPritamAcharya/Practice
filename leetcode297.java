import java.util.LinkedList;
import java.util.Queue;

public class leetcode297 {
    public static String serialize(TreeNode root) {
        if (root == null) {
            return " ";
        }

        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder str = new StringBuilder();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            if (curr == null) {
                str.append("n, ");
                continue;
            }

            str.append(curr.val + ", ");
            queue.add(curr.left);
            queue.add(curr.right);
        }

        return str.toString();
    }

    public static TreeNode deserialize(String data) {
        if (data == " ") {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        String[] tree = data.split(", ");

        TreeNode root = new TreeNode(Integer.parseInt(tree[0]));
        queue.add(root);

        for (int i = 1; i < tree.length; i++) {
            TreeNode parent = queue.poll();

            if (!tree[i].equals("n")) {
                TreeNode left = new TreeNode(Integer.parseInt(tree[i]));
                parent.left = left;
                queue.add(left);
            }

            if (!tree[++i].equals("n")) {
                TreeNode right = new TreeNode(Integer.parseInt(tree[i]));
                parent.right = right;
                queue.add(right);
            }

        }

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        String serialized_Node = serialize(root);
        System.out.println(serialized_Node);

        System.out.println(deserialize(serialized_Node));
    }
}
