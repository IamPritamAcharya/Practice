public class leetcode2683 {
    public static boolean doesValidArrayExist(int[] derived) {
        int sum = 0;

        for (int i : derived) {
            sum ^= i;
        }

        if (sum != 0) {
            return false;
        } else {
            return true;
        }

    }

    public static void main(String[] args) {
        int[] derived = {1,0};
        System.out.println(doesValidArrayExist(derived));
    }
}
