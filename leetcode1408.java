import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode1408 {

    public static List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if ((i != j) && (words[j].length() <= words[i].length()) && (!ans.contains(words[j])) && (words[i].contains(words[j]))) {
                    ans.add(words[j]);
                    
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};

        System.out.println(stringMatching(words));
    }
}