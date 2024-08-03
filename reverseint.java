/*
 * 7. Reverse Integer
Solved
Medium
Topics
Companies
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1
 */

import java.util.Scanner;

public class reverseint {
    public static int reverse(int x) {
        int sum = 0;
        
        while (x != 0) {
            int r = x % 10;
            
            // Check for overflow before updating `sum`
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && r > 7)) {
                return 0; // Overflow occurred
            }
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && r < -8)) {
                return 0; // Underflow occurred
            }
            
            sum = 10 * sum + r;
            x /= 10;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to reverse:");
        int input = sc.nextInt();
        System.out.println(reverse(input));
        sc.close();
    }
}
