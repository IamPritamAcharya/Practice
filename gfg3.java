public class gfg3 {
    static int binarySearch(int[] arr, int target, boolean findFirst) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (arr[mid] < target) {
                left = mid + 1;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            }
        }

        return result;

    }

    static int countFreq(int[] arr, int target) {
        int first = binarySearch(arr, target, true);
        if (first == -1) {
            return 0;
        }
        int last = binarySearch(arr, target, false);
        return last - first + 1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 2, 3 };
        int target = 2;
        System.out.println(countFreq(arr, target));
    }
}
