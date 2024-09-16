import java.util.Arrays;
import java.util.List;

public class leetcode539 {
    public static int findMinDifference(List<String> timePoints) {
        int[] minutes_arr = new int[timePoints.size()];

        for (int i = 0; i < minutes_arr.length; i++) {
            int hour = Integer.parseInt(timePoints.get(i).substring(0,2));
            int minutes = Integer.parseInt(timePoints.get(i).substring(3,5));

            int temp = 60*hour + minutes;
            minutes_arr[i] = temp;
        }

        Arrays.sort(minutes_arr);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < minutes_arr.length-1; i++) {
            int temp2 = minutes_arr[i+1]-minutes_arr[i];
            min = Math.min(min, temp2);
        }

        int first_last_diff = minutes_arr[minutes_arr.length-1]-minutes_arr[0];
        min = Math.min(min, 60*24-first_last_diff);


        return min;
    }

    public static void main(String[] args) {
        List<String> timePoints1 = Arrays.asList("23:59", "00:00");
        List<String> timePoints2 = Arrays.asList("23:00", "03:00","02:00");

        System.out.println(findMinDifference(timePoints1));
    }
}
