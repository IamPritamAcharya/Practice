/*
    QUESTION 6
    Wap to find volume of a box
 */

public class question6 {
    public static void main(String[] args) {
        int num = 12345;

        int d1 = num / 10000;
        int d2 = (num / 1000) % 10;
        int d3 = (num / 100) % 10;
        int d4 = (num / 10) % 10;
        int d5 = num % 10;

        int sum = d1 + d2 + d3 + d4 + d5;
        System.out.println(d1 + " + " + d2 + " + " + d3 + " + " + d4 + " + " + d5 + " = " + sum);
    }
}
