import java.util.Scanner;

public class PatternE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the pattern:");
        int n = scanner.nextInt();

        for(int i=1; i <= n; i++){
            for(int j = 1;j <= 2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
    
}



