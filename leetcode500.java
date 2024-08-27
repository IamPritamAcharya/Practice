import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class leetcode500 {
    public static boolean checkFirstRow(String str) {
        String firstRow = "qwertyuiop";

        for (int i = 0; i < str.length(); i++) {
            if (!firstRow.contains(str.charAt(i)+"")) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkSecondRow(String str) {
        String firstRow = "asdfghjkl";

        for (int i = 0; i < str.length(); i++) {
            if (!firstRow.contains(str.charAt(i)+"")) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkThirdRow(String str) {
        String firstRow = "zxcvbnm";

        for (int i = 0; i < str.length(); i++) {
            if (!firstRow.contains(str.charAt(i)+"")) {
                return false;
            }
        }

        return true;
    }

    public static String[] findWords_method1(String[] words) {
        String[] arr = new String[words.length];
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

        int k = 0;
        for (int i = 0; i < words.length; i++) {
            if (checkSecondRow(words[i].toLowerCase()) || checkFirstRow(words[i].toLowerCase()) || checkThirdRow(words[i].toLowerCase())) {
                words[k] = words[i];
                k++;
            }
        }

        return Arrays.copyOfRange(words, 0, k);
    }


    public static String[] findWords(String[] words) {
        Set<Character> firstRow = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> secondRow = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> thirdRow = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

        int k = 0;
        for (String str : words) {
            if (canBeTypedWithOneRow(str.toLowerCase(), firstRow) || 
                canBeTypedWithOneRow(str.toLowerCase(), secondRow) || 
                canBeTypedWithOneRow(str.toLowerCase(), thirdRow)) {
                words[k] = str;
                k++;
            }
        }

        return Arrays.copyOfRange(words, 0, k);
    }

    public static boolean canBeTypedWithOneRow(String word, Set<Character> row) {
        for (char c : word.toCharArray()) {
            if (!row.contains(c)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        

        System.out.println(Arrays.toString(findWords(words)));
    }
    
}