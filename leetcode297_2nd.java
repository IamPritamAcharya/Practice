import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class leetcode297_2nd {

    public static String serialize(TreeNode root) {
        if (root == null) {
            return "null";
        }

        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    public static TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return helperDeserialize(queue);
    }

    public static TreeNode helperDeserialize(Queue<String> queue) {
        String str = queue.poll();
        if (str.equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(str));
        root.left = helperDeserialize(queue);
        root.right = helperDeserialize(queue);

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
