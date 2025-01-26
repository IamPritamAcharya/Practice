public class gfg1 {
    static int findFloor(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        int floor = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] < k) {
                floor = mid;
                left = mid + 1;
            }
            if (arr[mid] > k) {
                right = mid - 1;
            }
        }

        return floor;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};
        int k = 5;
        System.out.println(findFloor(arr, k));
    }
}
