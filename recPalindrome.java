public class recPalindrome {
    static boolean isPalindrome(String str, int left) {
        int right = str.length() - left - 1;

        if (left>=right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindrome(str, left+1);
    }
    public static void main(String[] args) {
        String str = "12344321";
        
        System.out.println(isPalindrome(str, 0));
    }
}
