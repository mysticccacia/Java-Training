import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        int sum = 0;

        // Sum from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Print result
        System.out.println("Sum of 1 + 2 + ... + " + n + " = " + sum);

        scanner.close();
    }
}
