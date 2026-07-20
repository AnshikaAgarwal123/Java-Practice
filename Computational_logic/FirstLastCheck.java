public class FirstLastCheck {
    public static void main(String[] args) {
        int[] arr = {7, 12, 45, 89, 7};

        boolean isEqual = (arr[0] == arr[arr.length - 1]);

        if (isEqual) {
            System.out.println("The first and last elements are equal.");
        } else {
            System.out.println("The first and last elements are different.");
        }
    }
}