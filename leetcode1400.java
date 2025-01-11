public class leetcode1400 {
    public static boolean canConstruct(String s, int k) {
        if (s.length() < k) {
            return false;
        }

        int[] hashString = new int[26];

        for (char c : s.toCharArray()) {
            hashString[c - 'a']++;
        }

        int count_odd = 0;

        for (int i : hashString) {
            if (i%2 != 0) {
                count_odd++;
            }
        }

        if (count_odd>k) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String str = "leetcode";
        int k = 3;

        System.out.println(canConstruct(str, k));
    }
}
