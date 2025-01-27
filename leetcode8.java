public class leetcode8 {
    public static int myAtoi(String s) {
        int i = 0;

        boolean negative = false;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i == s.length()) {
            return 0;
        }

        if (s.charAt(i) == '-') {
            negative = true;
            i++;
        }

        else if (s.charAt(i) == '+') {
            i++;
        }

        int ans = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (ans > Integer.MAX_VALUE / 10 ||
                    (ans == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + digit;
            i++;
        }
        return negative ? -ans : ans;
    }

    public static void main(String[] args) {
        String str = "2147483648";
        System.out.println(myAtoi(str));
    }
}
