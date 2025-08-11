import java.util.Scanner;

public class condtionalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        int b = scanner.nextInt();
       
        int c = scanner.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is greater " + a);
            }
            else{
                System.out.println("c is greater" + c);
            }
        }
        else{
            if(b>c){
                System.out.println("b is greater" + b);
            }
            else{
                System.out.println("c is greater" + c);
            }
        }
        scanner.close();
    }
}
