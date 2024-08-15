public class removeduplicates {
    //from sorted array
    static void removeduplicatesUnique(int[] arr) {
        int p1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[p1]) {
                arr[p1+1] = arr[i];
                p1++;
            }
        }
        System.out.println(p1+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        removeduplicatesUnique(arr);
    }
}
//leetcode 26