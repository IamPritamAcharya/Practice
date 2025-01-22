/*
    QUESTION 2
    Wap to convert temperature.
*/

public class question2 {
    public static void main(String[] args) {

        // celsius ---> fahrenheit

        double celsius1 = 38.9;
        double fahrenheit1 = (celsius1 * 1.8) + 32;

        System.out.println(celsius1 + " *c = " + fahrenheit1 + " f");

        // fahrenheit ---> celsius

        double fahrenheit2 = 102.02;
        double celsius2 = (fahrenheit2 - 32) / 1.8;

        System.out.println( + fahrenheit2 + " f = " + celsius2 + " *c");

    }
}
