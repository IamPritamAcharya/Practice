import java.util.Arrays;

public class leetcode66 {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        // 8,9,9,9 & 9,8,9\
        int[] digits2 = {8,9,9,9};
        int[] digits = {9,8,9};
        int[] digits3 = {1,2,3};
        int[] digits4 = {9,8,9,9};

        System.out.println(Arrays.toString(plusOne(digits2)));
        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(Arrays.toString(plusOne(digits3)));
        System.out.println(Arrays.toString(plusOne(digits4)));
    }
}
