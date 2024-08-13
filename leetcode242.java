import java.util.HashMap;

public class leetcode242 {
    // 15 ms
    public static boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) {
            return false;
        }

        HashMap<Character, Integer> hashMap_s =  new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hashMap_s.put(s.charAt(i), hashMap_s.getOrDefault(s.charAt(i), 0)+1);
            hashMap_s.put(t.charAt(i), hashMap_s.getOrDefault(t.charAt(i), 0)-1);

        }
        for (int count : hashMap_s.values()) {
            if (count != 0) {
                return false;
            }
        }
       
        return true;
    }

    // 1 ms
    public static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] arr = new int[26];

        for (char i : s.toCharArray()) {
            arr[i - 'a']++;
        }
        for (char i : t.toCharArray()) {
            arr[i - 'a']--;
            if (arr[i-'a']<0) {
                return false;
            }
        }
        return true;        
    }
    public static void main(String[] args) {
        String s = "am";
        String t = "ma";
        System.out.println(isAnagram(s,t));
    }
    
}
