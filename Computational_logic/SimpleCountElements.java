public class SimpleCountElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        
        int totalElements = 0;

        for (int num : arr) {
            totalElements++;
        }

        System.out.println("The total number of elements in the array is: " + totalElements);
    }
}