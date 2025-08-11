public class DemoMainOverload {

    // This is the REAL entry point. JVM calls this one.
    public static void main(String[] args) {
        System.out.println("Default main(String[] args) called");

        // Calling overloaded main methods manually
        main();
        main("Abhishek");
        main(7);
    }

    // Overloaded main with no arguments
    public static void main() {
        System.out.println("Overloaded main() without parameters called");
    }

    // Overloaded main with one String
    public static void main(String name) {
        System.out.println("Overloaded main(String name) called. Hello " + name + "!");
    }

    // Overloaded main with one int
    public static void main(int num) {
        System.out.println("Overloaded main(int num) called. Number is " + num);
    }
}
