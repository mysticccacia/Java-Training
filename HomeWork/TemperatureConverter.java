import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Fahrenheit = " + fahrenheit);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5/9;
                System.out.println("Celsius = " + celsius);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
