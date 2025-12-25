package Interview;


public class FirstUnique {
    public static char firistNonRepeating(String s){
        int[] count = new int[256];

        for( char c : s.toCharArray()){
            count[c]++;
        }

        for( char c : s.toCharArray()){
            if(count[c] == 1){
                return c;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("First Unique Character in a String");
    }
}
