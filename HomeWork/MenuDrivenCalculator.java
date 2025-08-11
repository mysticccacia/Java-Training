import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Display menu
        System.out.println("\nMenu:");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");

        System.out.print("\nEnter your choice: ");
        int choice = scanner.nextInt();

        // Perform operation based on choice
        switch (choice) {
            case 1:
                System.out.println("Addition = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication = " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Division = " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
