/*
    QUESTION 9
    Wap to find diffrence between sum of all digits placed in 1st and 100 th place with 10th and 1000th place.
 */

public class question9 {
    public static void main(String[] args) {
        int num = 1234;

        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        int sum1 = d4 + d2;

        int sum2 = d3 + d1;

        int difference = sum1 - sum2;

        System.out.println("Number: " + num);
        System.out.println("Sum of digits at 1st and 100th places: " + sum1);
        System.out.println("Sum of digits at 10th and 1000th places: " + sum2);
        System.out.println("Difference: " + difference);
    }
}
