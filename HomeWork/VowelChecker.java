import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a single character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase to simplify check
        ch = Character.toLowerCase(ch);

        // Check if vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is a vowel.");
        } else {
            System.out.println("It is not a vowel.");
        }

        scanner.close();
    }
}
