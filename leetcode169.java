import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class leetcode169 {
    public static int majorityElement_notsogood(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0)+1);
        }
        System.out.println(hashMap);

        int maxKey = 0;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        
        return maxKey;
    }


/*
 * Here’s how the Boyer-Moore Voting Algorithm works:

1. Initialization: Start with a candidate element and a count initialized to zero.

2. Iterate Through the Array:
    If the count is zero, set the current element as the candidate.
    If the current element is the candidate, increase the count.
    If the current element is different from the candidate, decrease the count.

3. The Candidate: After the loop, the candidate will be the majority element.
 */

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];

        for (int i : nums) {
            if (count == 0) {
                candidate = i;
            }
            if (candidate == i) {
                count++;
            } else {
                count--;
            }
        }


        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
