import java.util.ArrayList;
import java.util.List;

public class leetcode54 {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        
        int rows = matrix.length;
        int columns = matrix[0].length;

        int row = 0;
        int column = -1;

        int direction = 1;

        while (rows > 0 && columns > 0) {
            for (int i = 0; i < columns; i++) {
                column+=direction;
                lst.add(matrix[row][column]);
            }
            rows--;

            for (int i = 0; i < rows; i++) {
                row += direction;
                lst.add(matrix[row][column]);
            }
            columns--;

            direction*=-1;
        }

        return lst;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(spiralOrder(matrix));
        
    }

}