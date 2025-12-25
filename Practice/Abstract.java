abstract class BankAccount{
    abstract int calculateInterest(int amount);

    void displayBalance(int amount){
        System.out.println("Balance Amount: " + amount);
    }
}

public class Abstract {
    public static void main(String[] args) {
        System.out.println("This is an example of an abstract class.");
    }
}
