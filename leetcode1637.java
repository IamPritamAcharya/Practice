
import java.lang.reflect.Array;
import java.util.Arrays;


public class leetcode1637 {
    public static void print2DArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int maxWidthOfVerticalArea(int[][] points) {
        int maxWidth = 0;
        int[] row = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            row[i] = points[i][0];
        }

        Arrays.sort(row);

        for (int i = 0; i < row.length-1; i++) {
            maxWidth = Math.max(maxWidth, row[i+1]-row[i]);
        }
        return maxWidth;
    }
    public static void main(String[] args) {
        int[][] array = {
            {8, 7},
            {9, 9},
            {7, 4},
            {9, 7}
        };
        
        System.out.println(maxWidthOfVerticalArea(array));
    }
}
