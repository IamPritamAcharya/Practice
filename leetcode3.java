
import java.util.HashSet;
import java.util.Set;

public class leetcode3 {
    public static int lengthOfLongestSubstring(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        Set<Character> hashSet = new HashSet<>();
        int l = 0;

        for (int r = 0; r < str.length(); r++) {
            
            if (hashSet.contains(str.charAt(r))) {
                while (l < r && hashSet.contains(str.charAt(r))) {
                    hashSet.remove(str.charAt(l));
                    l++;
                }
            }

            hashSet.add(str.charAt(r));
            max = Math.max(max, r - l + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
