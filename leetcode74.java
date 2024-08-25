public class leetcode74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int size = matrix.length * matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            if (binarySearch(matrix[i], target)) {
                return true;
            }
        }

        return false;
    }

    static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start+ (end-start)/2;

            if (arr[mid] == target) {
                return true;
            } if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }


    public static boolean searchMatrix_better(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        
        int start = 0;
        int end = row*column-1;

        while (start<=end) {
            int mid = start+ (end-start)/2;
            int midValue  = matrix[mid/column][mid%column];

            if (midValue == target) {
                return true;
            } if (midValue > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        

        System.out.println(searchMatrix_better(matrix, 13));
    }
}
