import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class leetcode599 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        int minSum = Integer.MAX_VALUE;
        int k = 0;
        String[] result = new String[Math.min(list1.length, list2.length)];

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int sum = i + j;
                    if (sum < minSum) {
                        minSum = sum;
                        k = 0;
                        result[k++] = list1[i];
                    } else if (sum == minSum) {
                        result[k++] = list1[i];
                    }
                }
            }
        }

        return Arrays.copyOfRange(result, 0, k);
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }
}
// changed