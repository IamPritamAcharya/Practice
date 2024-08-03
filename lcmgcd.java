import java.util.Arrays;

public class lcmgcd {
    static Long[] lcmAndGcd(int j , int k) {
        long gcd = 1;
        for (Long i = (long) ((j<k)?j:k); i >=2; i--) {
            if ((j%i==0)&&(k%i==0)) {
                gcd = i;
                break;
            }
        }

        long lcm = (int) ((j*k)/gcd);
        Long[] arr = {lcm, gcd};
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(lcmAndGcd(5, 10)));
    }
}
