import java.util.*;

public class Swapping {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        
        // a = a + b;
        // b = a - b;
        // a = a-b;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }
    
}