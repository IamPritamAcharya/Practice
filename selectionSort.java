import java.util.Arrays;

public class selectionSort {

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {5,1,9,24,8};
        selectionSort(arr);
    }
}
