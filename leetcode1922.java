public class leetcode1922 {
    public static int countGoodNumbers(long n) {
        final long MOD = 1_000_000_007;

        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        long evenPow = modularPow(5, evenCount, MOD);
        long oddPow = modularPow(4, oddCount, MOD);

        long result = (evenPow * oddPow) % MOD;

        return (int) result;
    }

    private static long modularPow(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        long n = 400; // Test case
        System.out.println(countGoodNumbers(n)); // Output: 564908303
    }
}
