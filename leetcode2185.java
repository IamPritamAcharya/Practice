public class leetcode2185 {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;

        for (String str : words) {
            if (str.startsWith(pref)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }
}
