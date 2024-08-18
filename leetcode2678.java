public class leetcode2678 {
    public static int countSeniors(String[] details) {
        int count = 0;

        for (int i = 0; i < details.length; i++) {         
            char tens = details[i].charAt(11);
            char ones = details[i].charAt(12);
            if (tens>'6' || (tens=='6' && ones > '0')) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }
}
