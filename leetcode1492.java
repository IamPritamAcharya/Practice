public class leetcode1492 {

    public static int kthFactor(int n, int k) {
        

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
            }

            if (k == 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 4;

        System.out.println(kthFactor(n, k));
    }
}
