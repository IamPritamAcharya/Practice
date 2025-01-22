/*
    QUESTION 1
    Wap to find simple interest.
*/

public class question1 {
    public static void main(String[] args) {
        double principal = 1057;
        double rate = 7;
        double time = 11;

        double si = (principal * rate * time) / 100;

        System.out.println("For principal: " + principal + ", rate: " + rate + ", time: " + time + "\nSimple Interest = " + si);
    }
}
