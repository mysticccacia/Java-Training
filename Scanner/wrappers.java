public class wrappers {
    public static void main(String[] args) {
        int x = 20;
        byte b = (byte)x;
        int a = b;
        Integer h = 2000;
        byte g = h.byteValue(); //h.byteValue() converts Integer to byte
        String  s = "1234";
        int i = Integer.parseInt(s); //String to int conversion
    }
}
