import java.util.Arrays;

public class leetcode1422 {
    public static int maxScore(String s) {
        int maxScore = 0;
        char[] str = s.toCharArray();
        int zeros = 0;
        int ones = count1(str); 
        for (int i = 0; i < str.length-1; i++) {
            if (str[i] == '0') {
                zeros++;
            } else {
                ones--;
            }
            maxScore = Math.max(maxScore, zeros+ones);
        }

        return maxScore;
    }

    static int count1(char[] str){
        int one = 0;

        for (char c : str) {
            if (c == '1') {
                one++;
            }
        }

        return one;
    }

    public static void main(String[] args) {
        String str = "011101";

        System.out.println(maxScore(str));
    }
}
