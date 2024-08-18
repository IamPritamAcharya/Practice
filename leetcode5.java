public class leetcode5 {
    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }

        return true;
        
    }
    public static String longestPalindrome(String str) {
        String res = "";
        int len=str.length();
        while(len>0){
            for (int i = 0; i <= str.length() - len; i++) {
                if (isPalindrome(str.substring(i, i + len))) {
                    return str.substring(i, i + len);
                }
            }
            len--;
            }
            return res;
    } 


    // -------------------- best approach
    public String longestPalindrome_best(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int odd = expandAroundCenter(s, i, i);
            int even = expandAroundCenter(s, i, i + 1);
            int max_len = Math.max(odd, even);

            if (max_len > end - start) {
                start = i - (max_len - 1) / 2;
                end = i + max_len / 2;
            }
        }

        return s.substring(start, end + 1);        
    }

    int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }    

    public static void main(String[] args) {
        String str = "aba";
        System.out.println(longestPalindrome(str));
    }
}
