public class Array {
    public static void main(String[] args) {
        int a[] = {10,20,30};
        int [] b = {10,20,30};
        int c[] = new int[10];
        int []d = new int[10];
        int []e = new int[]{10,20,30};
        int p[][] = new int[3][4];
        int [][]q = {{1,2,3},{4,5,6},{7,8,9}};
        int r[][] = new int[3][];
        r[0] = new int[10];
        r[1] = new int[20];
        r[2] = new int[30]; 

        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis(); // End time
        System.out.println("Time taken: " + (end - start) + " ms");
    }
}

  