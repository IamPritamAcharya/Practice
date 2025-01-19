import java.util.Arrays;

class Solution {
    public static final int MOD = 1000000007;

    public int minMaxSubarraySum(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);

        long[] fact = new long[n + 1];
        long[] invFact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        invFact[n] = modInverse(fact[n], MOD);
        for (int i = n - 1; i >= 0; i--) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;
        }

        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            long maxContribution = 0;
            for (int j = 1; j <= k; j++) {
                maxContribution = (maxContribution + comb(i, j - 1, fact, invFact)) % MOD;
            }
            totalSum = (totalSum + nums[i] * maxContribution) % MOD;
        }

        for (int i = 0; i < n; i++) {
            long minContribution = 0;
            for (int j = 1; j <= k; j++) {
                minContribution = (minContribution + comb(n - 1 - i, j - 1, fact, invFact)) % MOD;
            }
            totalSum = (totalSum + nums[i] * minContribution) % MOD;
        }

        return (int) totalSum;
    }

    private long comb(int n, int k, long[] fact, long[] invFact) {
        if (k > n)
            return 0;
        return fact[n] * invFact[k] % MOD * invFact[n - k] % MOD;
    }

    private long modInverse(long a, int m) {
        return modPow(a, m - 2, m);
    }

    private long modPow(long a, int b, int m) {
        long result = 1;
        a = a % m;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b /= 2;
        }
        return result;
    }

}
