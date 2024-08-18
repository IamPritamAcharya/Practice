import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode3046 {
    public static boolean isPossibleToSplit(int[] nums) {

        if (nums.length == 2) {
            return true;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0)+1);
            if (hashMap.get(nums[i]) > 2) {
                return false;
            }
        }
        int count = 0;

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
            }

        }

        if (count % 2 == 0) {
            return true;
        }


        return false;
    }

    public static boolean isPossibleToSplit1(int[] nums) {

        int[] hash = new int[101];

        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]+=1;
            if (hash[nums[i]] > 2) {
                return false;
            }
        }
        int count = 0;
        for (int i : hash) {
            if (i == 1) {
                count++;
            }
        }

        if (count%2==0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4};

        System.out.println(isPossibleToSplit1(arr));
    }
}
