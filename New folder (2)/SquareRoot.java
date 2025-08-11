import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        
        if (num < 0) {
            System.out.println("Square root of negative number is imaginary.");
        } else {
            double sqrt = Math.sqrt(num);
            System.out.println("Square root of " + num + " is: " + sqrt);
        }

        scanner.close();
    }
}
