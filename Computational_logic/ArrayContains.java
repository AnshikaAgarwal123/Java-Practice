public class ArrayContains {
    public static void main(String[] args) {
        int[] arr = {14, 25, 33, 42, 51};
        int target = 33;
        
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break; 
            }
        }

        if (found) {
            System.out.println("The array contains the number " + target);
        } else {
            System.out.println("The array does not contain the number " + target);
        }
    }
}