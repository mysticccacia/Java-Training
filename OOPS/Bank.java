package OOPS;

public class Bank {
    private int balance;
    private String customerName;
    private int AccountNo;
    Bank(String customerName,int AccountNo){
       this.balance = 0;
       this.customerName = customerName;
       this.AccountNo = AccountNo;
    }
    void changeDetails(String customerName){
        this.customerName = customerName;
    }
    void deposit(int amount){
        if(amount < 0 ){
            System.out.println("Enter a valid amount");
            return;
        }
        else{
            balance+=amount;
        }
    }
    public int withdraw(int amount){
        if(amount<0){
            System.out.println("Enter a valid amount");
            return 0;
        }
        else if(amount < balance){
            balance-=amount;
            return amount;
        }
        else{
            System.out.println("Not enough balance");
            return 0;
        }
    }
    public void checkBalance(){
        System.out.println("Balance:" + balance);
    }
    public void ShowCustomerDetails(){
        System.out.println("Name:" + customerName);
        System.out.println("Account No:" + AccountNo);
    }
}
