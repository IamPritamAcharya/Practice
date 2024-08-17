import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode1470 {
    public static int[] shuffle(int[] arr, int n) {
        int[] ans =  new int[arr.length];
        int p1 = 0;
        int p2 = n;
        int k = 0;

        while (k!=arr.length) {
            if (k%2==0) {
                ans[k] = arr[p1];
                p1++;
            } else if (k%2!=0) {
                ans[k] = arr[p2];
                p2++;
            }
            k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        shuffle(arr, 3);
    }
}
