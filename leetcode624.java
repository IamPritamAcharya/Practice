import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 2 -1
// -2 & -3,-2,1
public class leetcode624 {
    // TIME LIMIT EXCEEDED
    public static int maxDistance_bruteforce(List<List<Integer>> arrays) {
        int distance = 0;

        for (int i = 0; i < arrays.size(); i++) {
            for (int j = 0; j < arrays.size(); j++) {
                if (i != j) {
                    int temp_dist = Math.abs(arrays.get(i).get(0) - arrays.get(j).get(arrays.get(j).size() - 1));
                    if (temp_dist > distance) {
                        distance =  temp_dist;
                    }                   
                }
            }
        }

        System.out.println(distance);
        return distance;
    }

    public static int maxDistance(List<List<Integer>> arrays) {
        int siz = arrays.size();
        int min_0 = arrays.get(0).get(0);
        int max_0 = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        for (int i = 1; i < siz; i++) {
            List<Integer> arr = arrays.get(i);
            int currentMin = arr.get(0);
            int currentMax = arr.get(arr.size() - 1);
            
            maxDistance = Math.max(maxDistance, Math.abs(max_0 - currentMin));
            maxDistance = Math.max(maxDistance, Math.abs(currentMax - min_0));


            min_0 = Math.min(min_0, currentMin);
            max_0 = Math.max(max_0, currentMax);
        }

        return maxDistance;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
            Arrays.asList(-8,-7,-7,-5,1,1,3,4),
            Arrays.asList(-2),
            Arrays.asList(-10,-10,-7,0,1,3),
            Arrays.asList(2)
        );

        System.out.println(arr);
        System.out.println(maxDistance(arr));
    }
}
