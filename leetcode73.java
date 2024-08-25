import java.util.ArrayList;

public class leetcode73 {
    public static void print2DArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[] setRowZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        return arr;
    }
    static int[][] setColumnZero(int[][] arr, int column) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][column] = 0;
        }

        return arr;
    }

    
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];
    
        // First pass: mark the rows and columns that need to be zeroed
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
    
        // Second pass: set the marked rows to zero
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {
                setRowZero(matrix[i]);
            }
        }
    
        // Third pass: set the marked columns to zero
        for (int j = 0; j < cols; j++) {
            if (zeroCols[j]) {
                setColumnZero(matrix, j);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        int[][] matrix1 = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };
        

        setZeroes(matrix1);
        print2DArray(matrix1);
        
    }
}
