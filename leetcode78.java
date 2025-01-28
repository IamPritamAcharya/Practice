import java.util.ArrayList;
import java.util.List;

public class leetcode78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subsetsHelper(0, temp, nums, ans);
        return ans;
    }

    static void subsetsHelper(int index, List<Integer> lst, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(lst));
            return;
        }

        lst.add(nums[index]);
        subsetsHelper(index + 1, lst, nums, ans);
        lst.remove(lst.size() - 1);
        subsetsHelper(index + 1, lst, nums, ans);

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(subsets(nums));
    }
}