import java.util.Arrays;

public class revArrRecu {
    static void reverseArr(int[] arr, int left) {
        int right = arr.length - left - 1;
        if (left >= right) {
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArr(arr, left + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverseArr(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
