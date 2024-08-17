public class leetcode896 {

    public static boolean monotoneInc(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]<arr[i+1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean monotoneDec(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isMonotonic(int[] arr) {
        if (monotoneDec(arr) == true) {
            return true;
        } else if (monotoneInc(arr) == true) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        System.out.println(isMonotonic1(arr));
    }
}
