
import java.util.HashSet;

public class leetcode217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : nums) {
            hashSet.add(i);
        }
        if (hashSet.size()== nums.length) {
            return false;
        }


        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println(containsDuplicate(arr));
    }
}
