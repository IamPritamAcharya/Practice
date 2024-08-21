import java.util.Arrays;

public class leetcode2614 {
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true; 
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false; 
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false; 
            }
        }

        return true;
    }
    public static int diagonalPrime(int[][] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i][i]) && nums[i][i]> max) {
                max = nums[i][i];
            } else if (isPrime(nums[i][nums.length-i-1]) && nums[i][nums.length-i-1] > max) {
                max = nums[i][nums.length-i-1];
            }
        }
        System.out.println(max);

        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {788, 645, 309, 559},
            {624, 160, 435, 724},
            {770, 483, 95, 695},
            {510, 779, 984, 238}
        };
        
        diagonalPrime(arr);
    }
}
