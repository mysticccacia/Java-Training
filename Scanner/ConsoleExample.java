import java.io.Console;


public class ConsoleExample {
    public static void main(String[] args) {
         Console con = System.console();

         if(con == null){
            System.out.println("console not available");
            return;
         }

         String name = con.readLine("Enter your name:");
         System.out.println("Hello" + name);

         char[] password = con.readPassword("Enter your password");
         System.out.println("Password entered:"  + new String(password));
    }
}
