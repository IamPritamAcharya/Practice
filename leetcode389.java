import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode389 {
    public static char findTheDifference(String s, String t) {
        int sum_s = 0;
        int sum_t = 0;

        for (char s1 : s.toCharArray()) {
            sum_s += s1;
        }
        for (char s2 : t.toCharArray()) {
            sum_t += s2;
        }

        char ans = (char) (sum_t - sum_s);

        return ans;
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "aa";

        findTheDifference(s, t);
    }
}
