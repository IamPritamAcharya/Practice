import java.util.ArrayList;
import java.util.List;

public class leetcode119 {
    public static long nCr(int n, int r) {
        long res = 1;

        r = Math.min(r, n - r);

        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }

    public static List<Long> getRow(int rowIndex) {
        List<Long> ans = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            ans.add(nCr(rowIndex, i));
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(getRow(3));
    }
}
