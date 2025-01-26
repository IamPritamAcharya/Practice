import java.util.Arrays;

public class gfg2 {
    public static int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;
        int floor = -1;
        int ceil = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return new int[]{arr[mid], arr[mid]};
            }
            if (arr[mid] < x) {
                floor = arr[mid];
                left = mid + 1;
            }
            if (arr[mid] > x) {
                ceil = arr[mid];
                right = mid - 1;
            }
        }

        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};
        int k = 6;
        System.out.println(Arrays.toString(getFloorAndCeil(k, arr)));
    }
}
