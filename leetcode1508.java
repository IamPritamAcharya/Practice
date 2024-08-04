import java.util.ArrayList;
import java.util.Arrays;

public class leetcode1508 {

    private static int[] subArrSum2(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> subSums = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                subSums.add(sum);
            }
        }
        
        return subSums.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    // Function to calculate the range sum of sorted subarray sums
    public static int rangeSum2(int[] nums, int n, int left, int right) {
        int[] sortedSubSums = subArrSum2(nums);
        int sum = 0;
        
        for (int i = left - 1; i < right; i++) {
            sum += sortedSubSums[i];
        }
        
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(rangeSum2(arr,4,1,5));
    }
}
