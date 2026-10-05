public class Solution {
    public static int getGCD(int a, int b) {
        // Handle negative inputs
        a = Math.abs(a);
        b = Math.abs(b);

        // Euclidean Algorithm
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        
        int result = getGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }
}
