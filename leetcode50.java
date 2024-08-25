public class leetcode50 {
    public static double myPow(double x, int n) {
        double ans = 1;

        if (n <= Integer.MIN_VALUE && x!= 1) {
            return 0;
        }
        if (x >= 1 && (n>= Integer.MAX_VALUE || n<= Integer.MIN_VALUE)) {
            return 1;
        } 
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                ans*= x;
            }
        } else if (n < 0) {
            for (int i = 0; i < -n; i++) {
                ans *= (1/x);
            }
        }


        return ans;
    }
    public static double myPow_better(double x, int n) {
        if (n == 0) return 1; // x^0 is 1
        if (x == 0) return 0; // 0^n is 0 for n > 0

        double ans = 1;
        long absN = Math.abs((long)n); // Use long to handle edge cases like Integer.MIN_VALUE
        
        while (absN > 0) {
            if ((absN & 1) == 1) {
                ans *= x;
            }
            x *= x;
            absN >>= 1; // Divide n by 2
        }
        
        return n < 0 ? 1 / ans : ans;
    }

    
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2));
        System.out.println(myPow(2.00000, -2147483648));
        System.out.println(myPow(0.00001, 2147483647));
        System.out.println(myPow(1, -2147483648));
    }
}
