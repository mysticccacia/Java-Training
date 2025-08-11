import java.util.Scanner;

public class SelectionSortExample {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Move boundary of unsorted array
        for (int i = 0; i < n - 1; i++) {
            // Find the index of minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

        System.out.println("Sorted array using Selection Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
