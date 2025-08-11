public class EvenOddCounter {
    public static void main(String[] args) {
        int evenCount = 0, oddCount = 0;

        System.out.println("Even Numbers between 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                evenCount++;
            }
        }

        System.out.println("\nTotal Even Numbers: " + evenCount);

        System.out.println("\nOdd Numbers between 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                oddCount++;
            }
        }

        System.out.println("\nTotal Odd Numbers: " + oddCount);
    }
}

