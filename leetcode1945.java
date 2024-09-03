class Solution {
    public static int getLucky(String s, int k) {

        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - 'a' + 1;
            while (digit > 0) {
                sum += digit % 10;  // Add each digit individually
                digit /= 10;
            }
        }


        for (int i = 1; i < k; i++) {
            sum = sumOfDigits(sum);
        }

        return (int) sum;
    }

    private static long sumOfDigits(long num) {
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


}