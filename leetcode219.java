import java.util.ArrayList;
import java.util.HashMap;

public class leetcode219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];

            if (hashMap.containsKey(currentNum)) {
                if (i-hashMap.get(currentNum) <= k) {
                    return true;
                }
            }
            hashMap.put(currentNum, i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,3,1,5};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
