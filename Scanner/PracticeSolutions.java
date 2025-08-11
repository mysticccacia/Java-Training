// Java Solutions for Array and ArrayList Practice Questions

import java.util.*;

public class PracticeSolutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1: Sum of Array Elements
        int[] arr1 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : arr1) sum += num;
        System.out.println("Sum: " + sum);

        // Q2: Max and Min
        int max = arr1[0], min = arr1[0];
        for (int num : arr1) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max + ", Min: " + min);

        // Q3: Count Even and Odd
        int even = 0, odd = 0;
        for (int num : arr1) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);

        // Q4: Reverse Array
        System.out.print("Reversed: ");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Q5: Palindrome Array
        boolean isPalindrome = true;
        for (int i = 0; i < arr1.length / 2; i++) {
            if (arr1[i] != arr1[arr1.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome: " + isPalindrome);

        // Q6: Second Largest
        int[] arr2 = {12, 35, 1, 10, 34, 1};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr2) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("Second Largest: " + second);

        // Q7: Remove Duplicates
        int[] arr3 = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : arr3) set.add(n);
        System.out.println("After removing duplicates: " + set);

        // Q8: Sort without Arrays.sort()
        int[] unsorted = {5, 2, 8, 1, 3};
        for (int i = 0; i < unsorted.length - 1; i++) {
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[i] > unsorted[j]) {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(unsorted));

        // Q9: Merge Two Arrays
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        int[] merged = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, merged, 0, a1.length);
        System.arraycopy(a2, 0, merged, a1.length, a2.length);
        System.out.println("Merged: " + Arrays.toString(merged));

        // Q10: Find Duplicates
        int[] arr4 = {2, 4, 7, 2, 4};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int n : arr4) {
            if (!seen.add(n)) duplicates.add(n);
        }
        System.out.println("Duplicates: " + duplicates);

        // --- ArrayList Questions ---

        // Q1: Add 5 numbers
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) list1.add(sc.nextInt());
        System.out.println("List: " + list1);

        // Q2: Names starting with A
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) names.add(sc.next());
        for (String name : names) {
            if (name.startsWith("A")) System.out.println(name);
        }

        // Q3: Check if number exists
        System.out.print("Enter number to check: ");
        int check = sc.nextInt();
        System.out.println("Exists: " + list1.contains(check));

        // Q4: Frequency
        System.out.print("Enter number to count: ");
        int target = sc.nextInt();
        int freq = 0;
        for (int n : list1) if (n == target) freq++;
        System.out.println("Frequency: " + freq);

        // Q5: Remove odd numbers
        list1.removeIf(n -> n % 2 != 0);
        System.out.println("Even numbers only: " + list1);

        // Q6: Sort List
        Collections.sort(list1);
        System.out.println("Sorted Asc: " + list1);
        list1.sort(Collections.reverseOrder());
        System.out.println("Sorted Desc: " + list1);

        // Q7: Frequency of all elements
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : list1) freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        System.out.println("Frequency map: " + freqMap);

        // Q8: Reverse without Collections.reverse()
        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = list1.size() - 1; i >= 0; i--) reversed.add(list1.get(i));
        System.out.println("Reversed: " + reversed);

        // Q9: Remove duplicates
        ArrayList<Integer> uniqueList = new ArrayList<>(new LinkedHashSet<>(list1));
        System.out.println("No duplicates: " + uniqueList);

        // Q10: Merge two lists and remove duplicates
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6));
        list1.addAll(list2);
        ArrayList<Integer> mergedList = new ArrayList<>(new LinkedHashSet<>(list1));
        System.out.println("Merged no duplicates: " + mergedList);

        sc.close();
    }
}

