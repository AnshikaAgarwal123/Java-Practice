public class EvenOddCounter {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 12, 15, 20, 23};
        
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++;  
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}