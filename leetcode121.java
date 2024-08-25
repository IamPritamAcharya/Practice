public class leetcode121 {

    static int maxprice(int[] arr, int start) {
        int max = arr[start];

        for (int i = start+1; i < arr.length; i++) {
            if (arr[i] > max) {
               max = arr[i]; 
            }
        }

        return max;
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int currentprofit = maxprice(prices, i) - prices[i];
            maxProfit = Math.max(maxProfit, currentprofit);
        }

        return maxProfit;
    }

    public static int maxProfit_best(int[] prices) {
        int max = 0;
        int current = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (current < prices[i]) {
                if (max < (prices[i] - current)) {
                    max = (prices[i] - current);
                }
            } else {
                current = prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        System.out.println(maxProfit_best(arr));
    }
}
