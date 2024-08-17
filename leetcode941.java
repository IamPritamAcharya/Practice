public class leetcode941 {

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int top=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[top]) {
                top = i;
            }
        }
    if (top == 0 || top == arr.length-1) {
            return false;
        }
        for (int i = 0; i < top-1; i++) {
            if (arr[i]>=arr[i+1]) {
                return false;
            }
        }
        for (int i = top; i < arr.length-1; i++) {
            if (arr[i]<=arr[i+1]) {
                return false;
            } 
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(validMountainArray(arr));
    }
}
