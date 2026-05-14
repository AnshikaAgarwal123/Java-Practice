import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your exam score (0-100): ");
        int score = scanner.nextInt();

        // Logic to decide the outcome
        if (score >= 60) {
            System.out.println("Congratulations! You passed.");
        } else if (score >= 50) {
            System.out.println("So close! You qualify for a retake.");
        } else {
            System.out.println("Better luck next time. Keep practicing!");
        }

    }
}