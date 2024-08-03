/*
Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.
 

Examples :

Input: n = 12
Output: 2
Explanation: 1, 2 when both divide 12 leaves remainder 0.
Input: n = 2446
Output: 1
Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.
 */

import java.util.*;


public class Main {

    static int evenlyDivides(int n){
        
        int count = 0;
        int num = n;
        while (n>0) {
            int r = n % 10;
            if ((r>=1) && (num%r == 0)) {
                count++;
            }
            n/=10;
        }
        return count;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(evenlyDivides(num));
    }
}


