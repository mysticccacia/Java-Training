import java.util.Scanner;

public class PatternG {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the pattern:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in between
            for (int j = 0; j < (2 * (n - i - 1) + 1); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
