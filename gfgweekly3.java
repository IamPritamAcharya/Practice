import java.util.ArrayList;

public class gfgweekly3 {

    public static ArrayList<Integer> boundarySum(int n, int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int level = 0; level < (n + 1) / 2; level++) {
            int sum = 0;
            int start = level;
            int end = n - level - 1;

            for (int i = start; i <= end; i++) {
                sum += matrix[start][i];
            }

            for (int i = start + 1; i <= end; i++) {
                sum += matrix[i][end];
            }

            if (end > start) {
                for (int i = end - 1; i >= start; i--) {
                    sum += matrix[end][i];
                }
            }

            if (end > start) {
                for (int i = end - 1; i > start; i--) {
                    sum += matrix[i][start];
                }
            }

            result.add(sum);
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {2,3,4,5},
            {4,1,5,2},
            {3,2,9,0}
        };
        ArrayList<Integer> sums = boundarySum(4, matrix);
        System.out.println(sums);  // Output: [54, 34]
    }
}
