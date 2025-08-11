import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input percentage
        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        // Determine grade
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 70 && percentage <= 89) {
            System.out.println("Grade: B");
        } else if (percentage >= 50 && percentage <= 69) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        scanner.close();
    }
}
