/*
 You are given an array of non-negative integers representing height of walls at index i as Ai and the width of each block is 1. Compute how much air can be encapsulated between the walls of chamber.

 

Input Description:
Each line contains an integer ‘N’ denoting the size of the array Next line contains N space separated numbers to be stored in array.

Output Description:
Output the total unit of Air encapsulated between the walls of chamber.
 */

import java.util.*;
import java.util.Scanner;

public class Main {

    static int air_bet_3(int x,int y, int z) {
        int min = (x < z) ? x : z;

        if (min > y) {
            return min - y;
        }

        return 0;
    }

    static void totalAirEnc(int[] arr) {
        int ans = 0;

        for (int i = 0; i < arr.length-2; i++) {
            ans += air_bet_3(arr[i], arr[i+1], arr[i+2]);          
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        totalAirEnc(arr);
    }
}

