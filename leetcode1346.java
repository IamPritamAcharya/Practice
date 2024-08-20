import java.util.HashMap;
import java.util.HashSet;

public class leetcode1346 {
    public static boolean checkIfExist1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i!=j) {
                    if (arr[i] == 2*arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // optimised
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : arr) {
            if (hashSet.contains(i*2) || (i%2==0 && hashSet.contains(i/2))) {
                return true;
            } else {
                hashSet.add(i);
            }
            
        }   

        return false;
    }


    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        int[] arr1 = {3,1,7,11};

        System.out.println(checkIfExist(arr));
    }
}
