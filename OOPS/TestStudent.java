package OOPS;

// import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        // Bank b1 = new Bank("Abhishek",1101123);
        // b1.ShowCustomerDetails();
        // b1.checkBalance();
        // b1.deposit(25);
        // b1.checkBalance();
        // int withdraw = b1.withdraw(5);
        // System.out.println("Withdrawl amount:" +withdraw);
        // b1.checkBalance();
        // b1.changeDetails("Harsh");
        // b1.ShowCustomerDetails();
        
        College ims = new College();
        // ims.StudentDetail();
        ims.SetStudentPersonalDetails("Abhishek", "Greater Noida");
        ims.setStudentCollegeDetails(05, "B-Tech", "CSE");
        ims.StudentDetail();
       

    }
}
