import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferAndScanner {
     public static void main(String[] args) throws IOException {
        
        // 🔹 1. Using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Using Scanner ===");
        System.out.print("Enter your name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter your age: ");
        int age1 = sc.nextInt();

        System.out.println("Hello " + name1 + ", you are " + age1 + " years old.");

        // 🔹 2. Using BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n=== Using BufferedReader ===");
        System.out.print("Enter your name: ");
        String name2 = br.readLine(); // Always String

        System.out.print("Enter your age: ");
        int age2 = Integer.parseInt(br.readLine()); // Convert to int

        System.out.println("Hello " + name2 + ", you are " + age2 + " years old.");
        
        // Close resources
        sc.close();
        br.close();
    }
}
