public class leetcode1672 {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (max < sum(accounts[i])) {
                max = sum(accounts[i]);
                
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));
    }
}
