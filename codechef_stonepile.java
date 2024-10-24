import java.util.*;

public class codechef_stonepile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                q.add(sc.nextInt());
            }
            while (q.size() > 1) {
                // AMAN
                q.add(q.remove());
                q.remove();
                if (q.size() == 1) {
                    System.out.println(1 +" "+ q.peek());
                }
                // Akshat
                q.add(q.remove());
                q.add(q.remove());
                q.remove();
                if (q.size() == 1) {
                    System.out.println(0 +" "+ q.peek());
                }
            }
            

        }

        sc.close();
    }
}
