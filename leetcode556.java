import java.util.Arrays;

public class leetcode556 {
    public static int nextGreaterElement(int n) {

        String st = Integer.toString(n);
        char[] str = st.toCharArray();

        int i;
        for (i = str.length - 1; i > 0; i--) {
            if (str[i] > str[i - 1]) {
                break;
            }
        }

        if (i == 0) {
            return -1;
        } else {

            int smallestIndex = i;
            for (int j = i + 1; j < str.length; j++) {
                if (str[j] > str[i - 1] && str[j] < str[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            char temp = str[i - 1];
            str[i - 1] = str[smallestIndex];
            str[smallestIndex] = temp;

            Arrays.sort(str, i, str.length);

            long result = Long.parseLong(new String(str));

            if (result > Integer.MAX_VALUE) {
                return -1;
            } else {
                return (int) result;
            }
        }
    }

    public static void main(String[] args) {
        int n = 2147483486;

        System.out.println(nextGreaterElement(n)); // Output should be -1 due to overflow
    }
}
