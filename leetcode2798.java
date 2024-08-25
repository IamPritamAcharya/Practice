public class leetcode2798 {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int i : hours) {
            if (i >= target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
    }
}
