import java.util.Scanner;

public class PatternF {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the pattern:");
        int n = scanner.nextInt();

         for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Spaces in between
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        
    }
}
