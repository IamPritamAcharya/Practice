/*
    QUESTION 9
    Wap to find diffrence between avg of all digits placed in 1000th and 10 th place with that of 100th and 1st place
 */

public class question10 {
    public static void main(String[] args) {
        int num = 6370;

        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        double avg1 = (d1 + d3) / 2.0;

        double avg2 = (d2 + d4) / 2.0;

        double difference = avg1 - avg2;

        System.out.println("Number: " + num);
        System.out.println("Average of digits at 1000th and 10th places: " + avg1);
        System.out.println("Average of digits at 100th and 1st places: " + avg2);
        System.out.println("Difference: " + difference);
    }
}
