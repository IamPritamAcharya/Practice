/*
 * Frequencies of Limited Range Array Elements
Difficulty: EasyAccuracy: 27.64%Submissions: 278K+Points: 2
You are given an array arr[] containing n positive integers. These integers can be from 1 to p, and some numbers may be repeated or absent. Your task is to count the frequency of all numbers that lie in the range 1 to n.
Do modify the array in-place changes in arr[], such that arr[i] = frequency(i) and assume 1-based indexing.

Note: The elements greater than n in the array can be ignored for counting. Read the explanation of examples for better clarification.

Examples

Input: n = 5 arr[] = {2, 3, 2, 3, 5} p = 5
Output: 0 2 2 0 1
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 2 times. 3 occurring 2 times. 4 occurring 0 times. 5 occurring 1 time.
Input: n = 4  arr[] = {3,3,3,3} p = 3
Output: 0 0 4 0
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 0 times. 3 occurring 4 times. 4 occurring 0 times.
Input: n = 2 arr[] = {8,9} p = 9
Output: 0 0
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 0 times. Since here P=9, but there are no 9th Index present so can't count the value.
 */

import java.util.Arrays;

public class hasharray {
    public static void frequencyCount(int arr[], int n, int p) {
        // code here
        int hash[] = new int[p+1];

        for (int i = 0; i < n; i++) {
            if (arr[i] <= p && arr[i] > 0) {
                hash[arr[i]] += 1;
            }
        }

        int result[] = new int[p];
        for (int i = 1; i <= p; i++) {
            result[i-1] = hash[i];
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        frequencyCount(arr, 5, 5);
    }
}
