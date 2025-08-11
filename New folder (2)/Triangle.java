
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the side b: ");
        int b = scanner.nextInt();
        System.out.print("Enter the side c: ");
        int c = scanner.nextInt();
        if(a + b > c && b+ c > a && a + c > b){
            if(a==b && b==c && a==c){
                System.out.println("Equalateral Triangel");
            }
            else if(a==b || b==c || a==c){
                System.out.println("Isosceles Triangle");
            }
            else{
                System.out.println("Scalene Triangle");
            }
        }
        else{
            System.out.println("Does not form a Triangle");
        }
        scanner.close();
    }
}
