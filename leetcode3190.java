public class leetcode3190 {
    public static int minimumOperations(int[] nums) {
        int no_of_operations = 0;

        for (int i : nums) {
            int temp = i%3;
            if (temp ==2) {
                temp=1;
            }
            no_of_operations+= temp;
        }

        return no_of_operations;
    }

    public static void main(String[] args) {
        int[] nums = {3,6,9};
        System.out.println(minimumOperations(nums));
    }
}
