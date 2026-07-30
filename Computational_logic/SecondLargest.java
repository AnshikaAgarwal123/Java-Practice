public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest; 
                largest = numbers[i];    
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i]; 
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}