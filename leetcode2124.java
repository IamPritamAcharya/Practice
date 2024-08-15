import java.util.ArrayList;
import java.util.HashMap;

public class leetcode2124 {

    public static boolean checkString(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)=='b' && s.charAt(i+1)=='a') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "bbb";
        System.out.println(checkString(str));
    }
}
