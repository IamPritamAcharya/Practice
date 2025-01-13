import java.util.Arrays;

public class leetcode3223 {
    public static int minimumLength(String s) {
        int[] hash = new int[26];

        for (char c : s.toCharArray()) {
            hash[c - 'a']++;
        }

        int count = 0;

        for (int freq : hash) {
            if (freq == 0) continue; 

            if (freq % 2 == 0) {
                count += 2; 
            } else {
                count += 1; 
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "ucvbutgkohgbcobqeyqwppbxqoynxeuuzouyvmydfhrprdbuzwqebwuiejoxsxdhbmuaiscalnteocghnlisxxawxgcjloevrdcj";
        // ans = 38 
        // but it shows 44
        System.out.println(minimumLength(str));
    }
}
