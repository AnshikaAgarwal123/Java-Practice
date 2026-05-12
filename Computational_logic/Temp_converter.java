import java.util.Scanner;

public class Temp_converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.printf("%.1f°C is equal to %.1f°F\n", celsius, fahrenheit);
        
    }
}