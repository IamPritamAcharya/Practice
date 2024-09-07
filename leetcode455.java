import java.util.Arrays;

public class leetcode455 {
    public static int findContentChildren(int[] g, int[] s) {

        int s_size = s.length;
        int g_size = g.length;

        int l = 0; // size array
        int r = 0; // greed array

        Arrays.sort(g);
        Arrays.sort(s);

        while (l < s_size && r < g_size) {
            if (g[r] <= s[l]) {
                r++;
            }
            l++;
        }

        return r;
    }

    

    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};

        System.out.println(findContentChildren(g,s));
    }
}
