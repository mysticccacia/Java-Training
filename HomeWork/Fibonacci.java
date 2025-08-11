import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();       
        int first = 0;
        int second  = 1;
        for(int i = 1 ;i <= n;i++){
            System.out.print(first +" ");
            int next = first + second;
            first = second;
            second = next;
        }
        scanner.close();
    }
}
