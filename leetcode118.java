import java.util.ArrayList;
import java.util.List;

public class leetcode118 {

    public static int nCr(int n, int r) {
        int res = 1;

        r = Math.min(r, n - r);

        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(nCr(i, j));
            }
            ans.add(row);
        }

        return ans;
    }
    public static void main(String[] args) {
        int num = 6;
        System.out.println((int)Math.pow(11, num));
        System.out.println(generate(num));
    }
}
