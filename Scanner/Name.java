import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        //input - System.in 
        //Scanner - buffer - Input value store in this buffer.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim(); //takes input from user until Enter is pressed.
        scanner.close(); //Close the scanner to free resources.
        String arr[] = name.split("\\s+");
        String fullName = "" ;
        for (String str : arr) {  //Enhanced for loop (java 5+).
            char FirstChar = str.charAt(0);
            String FirstCharCap = String.valueOf(FirstChar).toUpperCase();
            String remainingChars = str.substring(1).toLowerCase();
            String tempName = FirstCharCap + remainingChars;
            fullName += tempName + " ";
        }
        System.out.println(fullName); 
    }
}
