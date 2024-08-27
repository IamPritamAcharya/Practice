import java.util.Arrays;

public class leetcode151 {


    public static String reverseWords_mine(String s) {
        StringBuilder ans = new StringBuilder();
        s = s.strip();
        String[] lst = s.split("\\s+");
        for (int i = lst.length - 1; i >= 0; i--) {
            ans.append(lst[i]);
            if (i>0) {
                ans.append(" ");
            }

        }

        return ans.toString();
    }    
    
    public static String reverseWords(String s) {
        String ans = "";
        String[] lst = s.strip().split("\\s+");

        for (int i = lst.length - 1; i >= 0; i--) {
            ans = ans + lst[i] + " ";
        }

        return ans.stripTrailing();
    }

    public static void main(String[] args) {
        String str = "a good   example";
        String str1 = "the sky is blue";
        String str2 = "  hello world  ";

        System.out.println(reverseWords(str2));
    }
}
