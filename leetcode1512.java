import java.util.HashMap;

public class leetcode1512 {
    public static int numIdenticalPairs(int[] nums) {
        int no_of_good_pairs = 0;
        int[] hash = new int[101];

        for (int i : nums) {
            no_of_good_pairs += hash[i];
            hash[i]++;
        }

        /*
         * As you traverse the array, every time you encounter an element x, 
         * the number of good pairs it can form with previously seen elements 
         * of the same value x is exactly the number of times x has appeared
         *  before in the array. This is because each occurrence of x can 
         * pair with all previous occurrences of x.
         */

        return no_of_good_pairs;
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
}
