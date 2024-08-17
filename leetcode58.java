public class leetcode58 {
    public static int lengthOfLastWord(String s) {
        s = s.strip();
        int i = s.length()-1;
        while ((i>=0) && (s.charAt(i) != ' ')) {
            i--;
        }

        return s.length() - i - 1;
    }
    public static void main(String[] args) {
        String str = "ab";
        System.out.println(lengthOfLastWord(str));
    }
}
