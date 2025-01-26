import java.util.List;

public class gfg4 {
    public int findKRotation(List<Integer> arr) {
        int left = 0;
        int right = arr.size() - 1;
        int min = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr.get(left) <= arr.get(mid)) { 

                if (arr.get(min) >= arr.get(left)) {
                    min = left;
                }
                left = mid + 1;
            } else if (arr.get(mid) <= arr.get(right)) {

                if (arr.get(min) >= arr.get(mid)) {
                    min = mid;
                }
                right = mid - 1;
            }

        }

        return min;
    }


}
