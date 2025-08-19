Java Basics: JVM, JDK, JRE, main() Explained

1.  Why is main() void in Java but int in C/C++?

In C/C++, main() returns int to indicate status to the Operating System. 0 means success, non-zero means error.
In Java, main() returns void because it is executed inside the JVM. To return an exit status in Java, use
System.exit(code).

2.  What happens inside the JVM?

    Steps:

    1. Java code is compiled (.java -> .class)
    2. Class Loader loads bytecode
    3. Bytecode Verifier checks security
    4. JVM searches for public static void main(String[] args)
    5. Execution Engine runs the bytecode via Interpreter or JIT Compiler
    6. JVM terminates after execution

3.  JVM Components Explained-
    Class Loader: Loads class files into memory-
    Bytecode Verifier: Verifies code safety-
    Execution Engine: Runs code using Interpreter and JIT-
    Garbage Collector: Manages memory cleanup-
    Runtime Data Areas: Stack, Heap, Method Area etc.

4.  JIT vs Interpreter

    Interpreter: Runs bytecode line by line (slower).
    JIT (Just-In-Time Compiler): Converts hot code into native machine code at runtime for faster execution.

5.  What is JRE?

    JRE (Java Runtime Environment) = JVM + standard Java libraries.
    It is used to run Java programs.

6.  What is JDK?

JDK (Java Development Kit) = JRE + tools like javac, java, javadoc, jar, jshell, debugger.
Required for developing and compiling Java code.

7.  Why public class name must match the file name?

If a class is public, its name must match the file name because the compiler uses the file name to locate the public class.
Mismatch leads to a compilation error.

8.  Can main() have different signatures?

JVM only calls: public static void main(String[] args)
Other overloaded main methods can exist but must be called manually.
Java Basics: JVM, JDK, JRE, main() Explained
Example: main(), main(int), main(String) are valid but not entry points.

9.  Example: Overloaded main() methods
    public class DemoMainOverload {
    public static void main(String[] args) {
    System.out.println("Default main called");
    main();
    main("Abhishek");
    main(7);
    }
    public static void main() { System.out.println("No-arg main"); }
    public static void main(String name) { System.out.println("Hello " + name); }
    public static void main(int num) { System.out.println("Number is " + num); }
    }


//Sum of digit
//find out no. is prime or not
//find out no. is armstrong or not
//count no. of zeroes in number
//convert binary to decimal
//sum of n natural number
//find out number is strong number or not
//count even and odd digit in a number
//print power of a number

//number of string conversion
eg. num = 123
print one two three


permutation of a string
subset sum problem 
eg. [10,15,20]
sum = 25
output = 1;
Tower of Hanoi
second largest
third largest
max consecutive Bit
rotate array
best time to buy and sell stock



Arrays Algorithm's

Pointer Approach --> 2 pointer ,3 pointer, Sliding Window, Binary Search
Precomputation Approach -->
Hashing


3Sum
3Sum closest
4Sum
missing number
contains duplicate
Is Subsequence
Single Number

Sliding Window
