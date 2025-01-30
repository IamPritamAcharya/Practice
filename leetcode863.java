import java.util.*;

public class leetcode863 {
    public static void buildParent(TreeNode root, HashMap<TreeNode, TreeNode> map) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.left != null) {
                q.add(curr.left);
                map.put(curr.left, curr);
            }
            if (curr.right != null) {
                q.add(curr.right);
                map.put(curr.right, curr);
            }
        }
    }

    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
        buildParent(root, parentMap);

        Queue<TreeNode> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(target);
        visited.add(target.val);
        int currDistance = 0;

        while (!queue.isEmpty()) {
            if (currDistance == k) {
                break;
            }

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null && !visited.contains(node.left.val)) {
                    queue.add(node.left);
                    visited.add(node.left.val);
                }

                if (node.right != null && !visited.contains(node.right.val)) {
                    queue.add(node.right);
                    visited.add(node.right.val);
                }

                if (parentMap.get(node) != null && !visited.contains(parentMap.get(node).val)) {
                    queue.add(parentMap.get(node));
                    visited.add(parentMap.get(node).val);
                }
            }

            currDistance++;
        }

        while (!queue.isEmpty()) {
            ans.add(queue.poll().val);
        }

        return ans;

    }

    public static void main(String[] args) {

    }
}
