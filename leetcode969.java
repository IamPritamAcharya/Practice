import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode969 {
    static int findMaxIndex(int[] arr, int end) {
        int maxIndex = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Reverse the sub-array from start to end (inclusive).
    static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();

        for (int size = arr.length; size > 1; size--) {
            // Find the index of the maximum element in the unsorted part of the array.
            int maxIndex = findMaxIndex(arr, size - 1);

            // If the max element is already in its correct position, continue.
            if (maxIndex == size - 1) continue;

            // Flip the max element to the front if it's not already at the front.
            if (maxIndex != 0) {
                ans.add(maxIndex + 1);  // Add k for the flip.
                reverseArr(arr, 0, maxIndex);
            }

            // Now flip it to its correct position at the end of the unsorted part.
            ans.add(size);  // Add k for the flip.
            reverseArr(arr, 0, size - 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        System.out.println("Pancake sort sequence: " + pancakeSort(arr));
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
