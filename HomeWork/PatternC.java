import java.util.Scanner;

public class PatternC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the pattern:");
        int n = scanner.nextInt();

        for(int i=0; i < n; i++){
            for(int j = i;j < n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
    
}
