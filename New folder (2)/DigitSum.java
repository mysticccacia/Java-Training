import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        int originalNum = num;

        // Calculate sum of digits
        while (num != 0) {
            int digit = num % 10;  // get last digit
            sum += digit;          // add to sum
            num /= 10;             // remove last digit
        }

        System.out.println("Sum of digits of " + originalNum + " is: " + sum);

        scanner.close();
    }
}
