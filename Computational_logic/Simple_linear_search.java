public class Simple_linear_search {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 23, 56, 89};
        int target = 23;
        
        int index = -1; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i; 
                break;     
            }
        }

        
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
