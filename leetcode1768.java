public class leetcode1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int j = 0;
        int k = 0;

        while (j!=word1.length() || k!= word2.length()) {
            if (j!=word1.length()) {
                str.append(word1.charAt(j));
                j++;
            }
            if (k!=word2.length()) {
                str.append(word2.charAt(k));
                k++;
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrst";
        System.out.println(mergeAlternately(word1, word2));
    }
}
