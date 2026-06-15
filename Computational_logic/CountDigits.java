public class CountDigits {
    public static void main(String[] args) {
        int number = 54321;
        int originalNumber = number; 
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {

            while (number > 0) {
                number = number / 10; 
                count++;              
            }
        }

        System.out.println("The number " + originalNumber + " has " + count + " digits.");
    }
}