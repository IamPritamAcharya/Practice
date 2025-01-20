import java.util.Arrays;
import java.util.HashMap;

public class leetcode2661 {

    public static int firstCompleteIndex(int[] arr, int[][] mat) {
        int rows = mat.length;
        int columns = mat[0].length;
        HashMap<Integer, int[]> hashMap = new HashMap<>();
        int[] rowCount = new int[rows];
        int[] columnCount = new int[columns];


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                hashMap.put(mat[i][j], new int[]{i, j});
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int[] pos = hashMap.get(arr[i]);
            rowCount[pos[0]]++;
            columnCount[pos[1]]++;
            if (rowCount[pos[0]] == columns || columnCount[pos[1]] == rows) {
                return i;
            }
        }
        

        return -1;
    }

    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.print("{");
            for (int element : row) {
                System.out.print(element + ",");
            }
            System.out.print("},");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2 };
        int[][] mat = { { 1, 4 }, { 2, 3 } };
        firstCompleteIndex(arr, mat);
        System.out.println(firstCompleteIndex(arr, mat));
    }
}