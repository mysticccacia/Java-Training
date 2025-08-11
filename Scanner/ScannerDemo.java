import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = scanner.nextInt();
        int num  = number;
        int divisor = 1;

        while(num!=0){
            num = num/10;
            divisor = divisor * 10;
        }
        divisor/=10;
        
        // Extract the first digit
        int firstDigit = number / divisor;

        // Extract the last digit
        int lastDigit = number % 10;

        // Remove first and last digits to get the middle part
        int middlePart = (number % divisor) / 10;

        // Form the number: lastDigit + middlePart + firstDigit
        int result = (lastDigit * divisor) + (middlePart * 10) + firstDigit;

        System.out.println("Modified number: " + result);
        scanner.close();
    }
}

    // int num = 12345;
    //     int div = 10000;
    //     int last = num%10;
    //     int first = num/div;
    //     int mid = num%div;
    //     int midagain = mid/10;
    //     int sum = midagain * 10;
    //     sum = sum + first;
    //     last = last * div;
    //     sum = last + sum;
    //     System.out.println(sum);
    
