/*
    QUESTION 7
    WAP to find face value and position value of all digits of any 5-digit number.
 */

 public class question7 {
    public static void main(String[] args) {
        int num = 12345;

        // Face Values
        int d1 = num / 10000;        
        int d2 = (num / 1000) % 10;  
        int d3 = (num / 100) % 10;   
        int d4 = (num / 10) % 10;   
        int d5 = num % 10;          

        // Postion Values
        int p1 = d1 * 10000;
        int p2 = d2 * 1000;
        int p3 = d3 * 100;
        int p4 = d4 * 10;
        int p5 = d5;

        System.out.println("Number: " + num);
        System.out.println("Face Values: " + d1 + ", " + d2 + ", " + d3 + ", " + d4 + ", " + d5);
        System.out.println("Position Values: " + p1 + ", " + p2 + ", " + p3 + ", " + p4 + ", " + p5);
    }
}
