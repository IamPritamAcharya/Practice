

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

 

public class leetcode884 {
    public static String[] uncommonFromSentences1(String s1, String s2) {
        String[] words1 = s1.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String word: words1){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        String[] words2 = s2.split(" ");
        for(String word: words2){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        ArrayList<String> ans = new ArrayList<>();
        for(Map.Entry<String,Integer> mp: map.entrySet()){
            if(mp.getValue()==1){
                ans.add(mp.getKey());
            }
        }
        return ans.toArray(new String[0]);
        
    }

    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        String[] ans = uncommonFromSentences1(s1, s2);
        System.out.println(Arrays.toString(ans));
        
    }
}
