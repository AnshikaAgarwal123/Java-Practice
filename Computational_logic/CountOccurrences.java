public class CountOccurrences {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 5, 8, 5, 20, 3};
        int target = 5;

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }

        System.out.println("The number " + target + " appears " + count + " times in the array.");
    }
}