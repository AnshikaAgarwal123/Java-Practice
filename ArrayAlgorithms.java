import java.util.Arrays;

/**
 * Collection of essential Array algorithms and utility functions in Java.
 */
public class ArrayAlgorithms {

    /**
     * Reverses an array in-place using the two-pointer technique.
     * Time Complexity: O(n) | Space Complexity: O(1)
     */
    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Finds the maximum and minimum elements in a single pass.
     * Time Complexity: O(n) | Space Complexity: O(1)
     */
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) return new int[]{};
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    /**
     * Transposes an n x n 2D matrix in-place.
     * Time Complexity: O(n^2) | Space Complexity: O(1)
     */
    public static void transposeMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {12, 5, 8, 19, 1, 33, 7};
        System.out.println("Original: " + Arrays.toString(nums));
        
        reverseArray(nums);
        System.out.println("Reversed: " + Arrays.toString(nums));

        int[] minMax = findMinMax(nums);
        System.out.println("Min: " + minMax[0] + ", Max: " + minMax[1]);

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        transposeMatrix(matrix);
        System.out.println("Transposed Matrix Row 0: " + Arrays.toString(matrix[0]));
    }
}
