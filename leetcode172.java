public class leetcode172 {

    public static int trailingZeroes(int n) {
        int count = 0;
        for (int power = 5; n / power > 0; power *= 5) {
            count += n / power;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 15;

        System.out.println(trailingZeroes(n));
    }
}
