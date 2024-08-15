import java.sql.Array;
import java.util.Arrays;

public class leetcode189 {
    public static void rotate(int[] arr, int k) {
        k = k % arr.length;

        int[] temp1 = new int[arr.length];
        int index = 0;

        for (int i = arr.length - k; i < arr.length; i++) {
            temp1[index] = arr[i];
            index++;
        }

        for (int i = 0; i < arr.length - k; i++) {
            temp1[index] = arr[i];
            index++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp1[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {-1};
        rotate(arr, 2);
    }
}
