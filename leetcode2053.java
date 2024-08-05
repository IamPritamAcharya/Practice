/*
 * 2053. Kth Distinct String in an Array
Solved
Easy
Topics
Companies
Hint
A distinct string is a string that is present only once in an array.

Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

Note that the strings are considered in the order in which they appear in the array.

 

Example 1:

Input: arr = ["d","b","c","b","c","a"], k = 2
Output: "a"
Explanation:
The only distinct strings in arr are "d" and "a".
"d" appears 1st, so it is the 1st distinct string.
"a" appears 2nd, so it is the 2nd distinct string.
Since k == 2, "a" is returned. 
Example 2:

Input: arr = ["aaa","aa","a"], k = 1
Output: "aaa"
Explanation:
All strings in arr are distinct, so the 1st string "aaa" is returned.
Example 3:

Input: arr = ["a","b","a"], k = 3
Output: ""
Explanation:
The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string "".
 

Constraints:

1 <= k <= arr.length <= 1000
1 <= arr[i].length <= 5
arr[i] consists of lowercase English letters.
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class leetcode2053 {

    public static String kthDistinct(String[] arr, int k) {
        // Use a HashMap to count occurrences of each string
        Map<String, Integer> countMap = new HashMap<>();
        for (String s : arr) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }

        // List to store distinct strings in order of appearance
        List<String> distinctStrings = new ArrayList<>();
        for (String s : arr) {
            if (countMap.get(s) == 1) {
                distinctStrings.add(s);
            }
        }

        // Return the k-th distinct string (1-based index)
        if (k <= distinctStrings.size()) {
            return distinctStrings.get(k - 1);
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        System.out.println(kthDistinct(arr, 2));
    }
}
