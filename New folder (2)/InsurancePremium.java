import java.util.Scanner;

public class InsurancePremium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details
        System.out.print("Enter Person Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Gender (Male/Female): ");
        String gender = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter City Type (Metro/Non-Metro): ");
        String city = scanner.nextLine().trim().toLowerCase();

        // Conditions check
        if (gender.equals("male")) {
            if (age >= 25 && age <= 35 && city.equals("metro")) {
                System.out.println("Premium is 6%");
            } else if (age >= 25 && age <= 40 && city.equals("non-metro")) {
                System.out.println("Premium is 4%");
            } else {
                System.out.println("Not Insured");
            }
        } else if (gender.equals("female")) {
            if (age >= 25 && age <= 42 && city.equals("metro")) {
                System.out.println("Premium is 3%");
            } else if (age >= 25 && age <= 45 && city.equals("non-metro")) {
                System.out.println("Premium is 2%");
            } else {
                System.out.println("Not Insured");
            }
        } else {
            System.out.println("Invalid gender entered.");
        }

        scanner.close();
    }
}
