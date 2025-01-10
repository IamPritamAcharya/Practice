import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode916 {
    
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) { 
                System.out.print(array[i][j] + " "); 
            }
            System.out.println(); 
        }
    }



    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();

        int[] maxFreq_word2 = new int[26];
        for (String word : words2) {
            int[] temp = new int[26];
            for (char ch : word.toCharArray()) {
                temp[ch - 'a']++;
                maxFreq_word2[ch - 'a'] = Math.max(maxFreq_word2[ch - 'a'], temp[ch - 'a']);
            }
        }
        for (String word : words1) {
            int[] temp = new int[26];
            for (char chr : word.toCharArray()) {
                temp[chr - 'a']++;
            }

            if (checkSubset(temp, maxFreq_word2)) {
                ans.add(word);
            }
        }

        return ans;
    }

    static boolean checkSubset(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]<arr2[i]) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String[] word1 = {"amazon","apple","facebook","google","leetcode"};
        String[] word2 = {"lo","eo"};

        System.out.println(wordSubsets(word1, word2));
    }
}

