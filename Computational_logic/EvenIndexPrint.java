public class EvenIndexPrint {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50, 65, 70};

        System.out.print("Elements at even indexes (0, 2, 4...): ");

        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // New line at the end
    }
}