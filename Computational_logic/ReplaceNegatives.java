import java.util.Arrays;

public class ReplaceNegatives {
    public static void main(String[] args) {
        int[] arr = {12, -5, 8, -19, 0, 4};

        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}