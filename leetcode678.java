public class leetcode678 {
    public static boolean checkValidString(String s) {
        int min = 0;
        int max = 0;

        for (char i : s.toCharArray()) {
            if (i == '(') {
                min++;
                max++;
            } else if (i == ')') {
                min--;
                max--;
            } else if (i == '*') {
                min--;
                max++;
            }

            if (min < 0) {
                min = 0;
            }
            if (max < 0) {
                return false;
            }
        }

        return (min == 0);


    }

    public static void main(String[] args) {
        String str = "(*)";
        System.out.println(checkValidString(str));
    }
}
