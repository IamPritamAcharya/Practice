import java.util.Arrays;

public class quickSort {
    static void sort(int[] nums, int low, int high){
        if (low >= high) {
            return;
        }

        int s = low; // start
        int e = high; // end
        int mid = (e+s)/2;
        int pivot = nums[mid];
        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }

            // now pivot is at correct index, please sort two halves now

            sort(nums, low, e);
            sort(nums, s, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
