import java.util.ArrayList;
import java.util.HashMap;

public class leetcode860 {
    public static boolean lemonadeChange(int[] bills) {

        int five_count = 0;
        int ten_count = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five_count++;
            } else if (bills[i] == 10) {
                if (five_count>0) {
                    five_count--;
                    ten_count++;
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (five_count > 0 && ten_count > 0) {
                    five_count--;
                    ten_count--;
                } else if (five_count>=3) {
                    five_count -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] bills = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        System.out.println(lemonadeChange(bills));
    }
}
