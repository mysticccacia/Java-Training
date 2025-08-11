import java.util.Scanner;

public class CaseChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string in any case:");
        String input = scanner.nextLine().trim();
        
        StringBuilder result = new StringBuilder();

        for(char ch : input.toCharArray()){
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            }
            else if (Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }
            else{
                result.append(ch);
            }
        }
        System.out.println("Converted String " + result);
}
}