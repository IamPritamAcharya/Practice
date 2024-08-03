/*
 * 125. Valid Palindrome
Easy
Topics
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */

import java.util.Scanner;

public class stringpalindrome {
    public static boolean isPalindrome(String s) {
        return checkPalindrome(removeNonAlphanumeric(s.toLowerCase()), 0);
    }
    public static boolean checkPalindrome(String s, int i) {
        int lengh = s.length();

        if (i>=lengh/2) return true;
        if (s.charAt(i) != s.charAt(lengh-i-1)) {
            return false;
        }
        return checkPalindrome(s, i+1);
    }

    public static String removeNonAlphanumeric(String input) {
        if (input == null) {
            return null;
        }
        // Regular expression to match non-alphanumeric characters
        return input.replaceAll("[^a-zA-Z0-9]", "");
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = "A man, a plan, a canal: Panama".toLowerCase();
        System.out.println(isPalindrome(str));
    }
}
