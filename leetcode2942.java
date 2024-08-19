import java.util.ArrayList;
import java.util.List;

public class leetcode2942 {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lst = new ArrayList<>();
        String ele = x +"";
        int index= 0;
        for (String string : words) {
            if (string.contains(ele)) {
                lst.add(index);
            }
            index++;
        }
        return lst;
    }

    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        System.out.println(findWordsContaining(words, 'a'));
    }
}
