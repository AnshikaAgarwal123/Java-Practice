public class ArrayProduct {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};

        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i]; 
        }

        System.out.println("The product of all elements in the array is: " + product);
    }
}