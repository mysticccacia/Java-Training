import java.util.Scanner;

public class NetSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Fixed allowances and deductions
        double hra = 0.30 * basicSalary;  // HRA = 30%
        double da = 0.20 * basicSalary;   // DA = 20%
        double ta = 0.10 * basicSalary;   // TA = 10%
        double pf = 1400;                 // Fixed PF

        // Net Salary = Basic + HRA + DA + TA - PF
        double netSalary = basicSalary + hra + da + ta - pf;

       
        System.out.println("\n--- Salary Breakdown ---");
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("HRA (30%): ₹" + hra);
        System.out.println("DA (20%): ₹" + da);
        System.out.println("TA (10%): ₹" + ta);
        System.out.println("PF Deduction: ₹" + pf);
        System.out.println("Net Salary: ₹" + netSalary);

        scanner.close();
    }
}
