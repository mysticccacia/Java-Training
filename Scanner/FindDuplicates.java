
import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1,5, 3,4, 5, 4,5, 6 };
       Set<Integer> seen = new HashSet<>();
       Set<Integer> duplicates = new HashSet<>();
       for(int num : arr){
              if(seen.contains(num)) {
                duplicates.add(num);
              } else {
                seen.add(num);
              }
       }
        System.out.println("Merged Array: " + Arrays.toString(duplicates.toArray()));
    }
}