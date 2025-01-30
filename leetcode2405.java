import java.util.*;

public class leetcode2405 {
    public static int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int count = 1;

        for (char chr : s.toCharArray()) {
            if (set.contains(chr)) {
                count++;
                set.clear();
            }
            set.add(chr);
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abacaba";
        String str2 = "ssssssa";
        System.out.println(partitionString(str));
        System.out.println(partitionString(str2));
    }
}
