import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] sourceArray = {5, 12, 4, 21, 8};

        int[] destinationArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        System.out.println("Source Array:      " + Arrays.toString(sourceArray));
        System.out.println("Destination Array: " + Arrays.toString(destinationArray));
    }
}