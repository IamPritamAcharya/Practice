import java.util.Arrays;
import java.util.HashMap;

public class largestelement2ndArr {
    // better
    public static int print2largest(int[] arr) {
        int _2ndlargest = -1;
        int largest = largest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>_2ndlargest && arr[i] != largest) {
                _2ndlargest = arr[i];
            }
        }

        System.out.println(_2ndlargest);
        return _2ndlargest;
    }
    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    // optimal
    public static int print2ndlargest(int[] arr) {
        int largest = arr[0];
        int sec_largest = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>largest) {
                sec_largest = largest;
                largest = arr[i];
            }
            else if (arr[i]< largest && arr[i]>sec_largest) {
                sec_largest = arr[i];
            }
        }
        System.out.println(sec_largest);
        return sec_largest;
    }

    public static void main(String[] args) {
        int arr[] = {28004 ,23544 ,32504 ,29493 ,17013 ,17850 ,18952 ,12089 ,5126 ,10353};

        print2ndlargest(arr);
    }
}
