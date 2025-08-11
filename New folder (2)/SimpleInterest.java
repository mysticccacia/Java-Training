import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  Principal amount (initial sum of money):");
        double principle = sc.nextDouble();
        System.out.print("Enter the  Rate of interest per annum (in %):");
        double rate = sc.nextDouble();
        System.out.print("Enter the Time (in years):");
        double time = sc.nextDouble();

        double simpleInterest = (principle * rate * time)/100;
        System.out.println("Simple Interest " + simpleInterest);

        sc.close();

    }
}
