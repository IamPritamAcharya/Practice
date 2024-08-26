import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode229 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0)+1);
        }

        int n = nums.length;
        n = n / 3;
        for (HashMap.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > n) {
                ans.add(entry.getKey());
            }
        }

        return ans;
    }

    public static List<Integer> majorityElement_boyerMoore(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        if (nums.length == 0) return ans;

        int candidate1 = 0;
        int candidate2 = 1; 

        int count1 = 0;
        int count2 = 0;

        for (int i : nums) {
            if (candidate1 == i) {
                count1++;
            } else if (candidate2 == i) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = i;
                count1++;
            } else if (count2 == 0) {
                candidate2 = i;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
    
        for (int i : nums) {
            if (i == candidate1) {
                count1++;
            } else if (i == candidate2) {
                count2++;
            }
        }
    

        int n = nums.length / 3;

        if (count1 > n) ans.add(candidate1);
        if (count2 > n && candidate2 != candidate1) ans.add(candidate2);
    
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,3,1,4,5,6};
        System.out.println(majorityElement_boyerMoore(nums));
    }
}
