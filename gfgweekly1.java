public class gfgweekly1 {
    public static long maximumProduct(int n, int[] arr, int l, int r) {
        long maxInRange = Long.MIN_VALUE;
        long minInRange = Long.MAX_VALUE;
        long maxOutOfRange = Long.MIN_VALUE;
        long minOutOfRange = Long.MAX_VALUE;
    
        for (int i = 0; i < n; i++) {
            if (i >= l - 1 && i < r) {  
                maxInRange = Math.max(maxInRange, arr[i]);
                minInRange = Math.min(minInRange, arr[i]);
            } else { 
                maxOutOfRange = Math.max(maxOutOfRange, arr[i]);
                minOutOfRange = Math.min(minOutOfRange, arr[i]);
            }
        }

        long product1 = maxInRange * maxOutOfRange;
        long product2 = maxInRange * minOutOfRange;
        long product3 = minInRange * maxOutOfRange;
        long product4 = minInRange * minOutOfRange;

        return Math.max(Math.max(product1, product2), Math.max(product3, product4));
    }
    

    public static void main(String[] args) {
        int n = 6;
        int[] arr = {8,9,2,-1,-2,-9};
        int l = 4;
        int r = 6; 

        System.out.println(maximumProduct(n, arr, l, r));  // Output: 21
    }
}
