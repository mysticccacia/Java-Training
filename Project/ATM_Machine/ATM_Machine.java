package Project.ATM_Machine;

import java.util.Scanner;

class ATM{
    private float balance;
    private int pin = 3456;

    public void verifyPin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PIN: ");
        int enteredPin = sc.nextInt();
        if(enteredPin == pin){
            System.out.println("PIN verified successfully.");
            menu();
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
    }

    public void checkBalance(){
        System.out.println("Your current balance is: $" + balance);
        menu();
    }

    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to deposit:");
        float amount = sc.nextFloat();
        if(amount > 0){
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
            menu();
        }
        else{
            System.out.println("Invalid amount. Please try again.");
        }
    }

    public void withdraw(){
        System.out.println("Enter the amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
            menu();
        }
        else{
            System.out.println("Invalid amount or insufficient balance. Please try again.");
        }
    }

    public void menu(){
        System.out.println("Welcome to the ATM Machine");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        Scanner sc= new Scanner(System.in);
        System.out.println("Choose an option: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1: checkBalance();
                    break;
            case 2: deposit();
                    break;
            case 3: withdraw();
                    break;
            case 4: System.out.println("Thank you for using the ATM.");
                    break;
            default: System.out.println("Invalid option. Please try again.");
                    menu();
                     break;
        }
    }
}

public class ATM_Machine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.verifyPin();
    }

}
