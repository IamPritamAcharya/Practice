import java.util.Arrays;

public class gfgweekly2 {
    public static long maximizeHealth(int n, int[] A, int[] B, int x, int y) {

        long[][] dpA = new long[n + 1][x + 1]; 
        long[][] dpB = new long[n + 1][y + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dpA[i], Long.MIN_VALUE);
            Arrays.fill(dpB[i], Long.MIN_VALUE);
        }

        dpA[0][0] = 0;
        dpB[0][0] = 0;


        for (int i = 0; i < n; i++) {
            for (int a = 0; a <= x; a++) {

                if (a < x && dpA[i][a] != Long.MIN_VALUE) {
                    dpA[i + 1][a + 1] = Math.max(dpA[i + 1][a + 1], dpA[i][a] + A[i]);
                }

                if (dpA[i][a] != Long.MIN_VALUE) {
                    dpA[i + 1][a] = Math.max(dpA[i + 1][a], dpA[i][a]);
                }
            }

            for (int b = 0; b <= y; b++) {

                if (b == 0 && dpA[i][x] != Long.MIN_VALUE) {
                    dpB[i + 1][b + 1] = Math.max(dpB[i + 1][b + 1], dpA[i][x] + B[i]);
                }
                if (b < y && dpB[i][b] != Long.MIN_VALUE) {
                    dpB[i + 1][b + 1] = Math.max(dpB[i + 1][b + 1], dpB[i][b] + B[i]);
                }

                if (dpB[i][b] != Long.MIN_VALUE) {
                    dpB[i + 1][b] = Math.max(dpB[i + 1][b], dpB[i][b]);
                }
            }
        }

        long maxHealth = Long.MIN_VALUE;
        for (int a = 0; a <= x; a++) {
            maxHealth = Math.max(maxHealth, dpA[n][a]);
        }
        for (int b = 0; b <= y; b++) {
            maxHealth = Math.max(maxHealth, dpB[n][b]);
        }

        return maxHealth;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] A = {6,5,4,3,2,1};
        int[] B = {1,2,3,4,5,6};
        int x = 3;
        int y = 3;
        System.out.println(maximizeHealth(n, A, B, x, y));  // Output should be 14
    }
}
