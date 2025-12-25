package Practice;
import java.util.Arrays;

public class Array {
    
    public static void main(String[] args) {
        String s = "a good   example";
        for(String str : s.trim().split(" +")) {
            System.out.println(str);
        }
        
    }
}
