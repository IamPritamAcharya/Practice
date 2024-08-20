
public class leetcode2433 {
    public static int[] findArray(int[] pref) {
        int[] ans = new int[pref.length];

        ans[0] = pref[0];

        for (int i = 1; i < pref.length; i++) {
            ans[i] = pref[i] ^ pref[i-1];
        }   

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,0,3,1};
        System.out.println("a^b = " + (2^2));

        findArray(arr);
    }
}
