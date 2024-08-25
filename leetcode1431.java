import java.util.ArrayList;
import java.util.List;

public class leetcode1431 {
    public static int maxArr(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i>max) {
                max = i;
            }
        }

        return max;
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> boolarr = new ArrayList<>();
        int max = maxArr(candies);

        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= max) {
                boolarr.add(true);
            } else boolarr.add(false);
        }
        return boolarr;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};

        System.out.println(kidsWithCandies(arr, 3));
    }
}
