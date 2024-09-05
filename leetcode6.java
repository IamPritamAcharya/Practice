import java.util.ArrayList;

public class leetcode6 {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s; 

        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }

        int dir = 1;
        int index = 0;
        
        for (char c : s.toCharArray()) {
            rows[index].append(c);

            if (index == 0) {
                dir = 1;
            } else if (index == numRows - 1) {
                dir = -1;
            }

            index += dir;
        }


        StringBuilder ans = new StringBuilder();
        for (StringBuilder row : rows) {
            ans.append(row);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        convert(str, 3);
    }
}
