import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode59 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int rows = n;
        int columns = n;

        int row = 0;
        int column = -1;

        int direction = 1;

        int val = 1;
        while (rows > 0 && columns > 0) {
            for (int i = 0; i < columns; i++) {
                column+=direction;
                matrix[row][column] = val;
                val++;
            }
            rows--;

            for (int i = 0; i < rows; i++) {
                row += direction;
                matrix[row][column] = val;
                val++;
            }
            columns--;

            direction*=-1;
        }
        return matrix;
    }

    static void printarr_2d(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;

        printarr_2d(generateMatrix(n));
    }
}
