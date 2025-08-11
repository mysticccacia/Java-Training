import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class Stringpool {
    public static void main(String[] args) {
        ///string pool
        /// new string
        //! reference comparision
        /// string comparision
        
        /// intern()
        // *god class
        // ? equals came from Object class 
        Integer h1= 100;
        Integer h2= 200;
        String s1 = "hello";
        String s2 = "Hello";
        String s3 = new String("hello").intern(); //intern() returns a canonical representation for the string object
        // System.out.println(s1==s3); //true, both refer to the same string in the string pool
        // System.out.println(s1.equals(s3)); //true, content is the same
        // System.out.println(h1==h2);
        // System.out.println(h1.equals(h2));
        
        //(length>capacity)?old+old*2+2:capacity
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());

        //StringBuilder is not synchronized, hence faster than StringBuffer


        //format date
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);
      
        System.out.println(date);


        //format price
        double price = 65635.67;
        NumberFormat n = NumberFormat.getCurrencyInstance();
        System.out.println(n.format(price));
        

    }
    
}
