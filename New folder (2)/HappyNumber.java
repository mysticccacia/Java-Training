import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        boolean visited[] = new boolean[1000];
        while(num!=1 && !visited[num]){
            visited[num] = true;
            int sum = 0;
            int temp=num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
            num = sum;
        }
        if(num==1){
            System.out.println("It is happy number");
        }
        else{
            System.out.println("Not a happy number");
        }
        sc.close();
    }
}