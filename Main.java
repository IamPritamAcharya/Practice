/*
 * fibonacci
 */

import java.util.*;


public class Main {

    static int getNthFibo(int n) {
        int first = 1;
        int second = 1;
        int next = 2;
        if (n == 1 || n == 2) {
            return 1;
        }
        for (int i = 0; i < n-2; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return next;
    }


   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getNthFibo(num));
    }
}


