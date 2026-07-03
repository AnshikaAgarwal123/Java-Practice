public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 5, 8, 5, 9, 1};
        int target = 5; 
        
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++; 
            }
        }

        System.out.println("The element " + target + " appears " + count + " times in the array.");
    }
}