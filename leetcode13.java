import java.util.HashMap;
import java.util.Map;

public class leetcode13 {
    public static int romanToInt(String s) {
        Map<Character, Integer> hashMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int sum = 0;

        for (int i = s.length() - 1; i >=0 ; i--) {
            int curr = hashMap.get(s.charAt(i));

            if (i < s.length() - 1 && curr < hashMap.get(s.charAt(i+1))) {
                sum-= curr;
            } else {
                sum+=curr;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(romanToInt(str));
    }
}
