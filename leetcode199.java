import java.util.ArrayList;
import java.util.List;

public class leetcode199 {
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightViewHelper(root, ans, 0);
        return ans;
    }

    static void rightViewHelper(TreeNode node, List<Integer> ans, int currDepth) {
        if (node == null) {
            return;
        }

        if (currDepth == ans.size()) {
            ans.add(node.val);
        }

        rightViewHelper(node.right, ans, currDepth+1);
        rightViewHelper(node.left, ans, currDepth+1);
    }
}
