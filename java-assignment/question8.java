/*
    QUESTION 8
    Wap to find average of all digits of any 4 digit number
 */

public class question8 {
    public static void main(String[] args) {
        int num = 1234;

        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        double avg = (d1 + d2 + d3 + d4) / 4.0;
        System.out.println("( " + d1 + " + " + d2 + " + " + d3 + " + " + d4 + " ) / 4 = " + avg);
    }
}
