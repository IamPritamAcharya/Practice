/*
 * 9. Palindrome Number
Easy
Topics
Companies
Hint
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?
 */

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int x) {
        int sum = 0;
        int num = x;
        boolean bool = false;
        
        while (x != 0) {
            int r = x % 10;
            sum = 10 * sum + r;
            x /= 10;
        }
        bool = (num == sum && num>=0) ? true: false;

        return bool;
               
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPalindrome(-121));
    }
}
