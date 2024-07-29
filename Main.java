/*
Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.

Examples
squarePatch(3) ➞ [
  [3, 3, 3],
  [3, 3, 3],
  [3, 3, 3]
]

squarePatch(5) ➞ [
  [5, 5, 5, 5, 5],
  [5, 5, 5, 5, 5],
  [5, 5, 5, 5, 5],
  [5, 5, 5, 5, 5],
  [5, 5, 5, 5, 5]
]

squarePatch(1) ➞ [
  [1]
]

squarePatch(0) ➞ []
*/

import java.util.*;

public class Main {

	public static int[][] squarePatch(int n) {
        int[][] ans = new int[n][n];
		for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                ans[i][j] = n;
            }
        }
        return ans;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;

        int[][] ans = squarePatch(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + ", ");
            }
            System.out.println();
        }

    }
}


