public class PrimeCounter {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Prime numbers between 1 to 100:");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println("\n\nTotal Prime Numbers between 1 to 100: " + count);
    }
}
