public class PatternRecursion {

    // *
    // **
    // ***
    // ****
    // *****

    static void startPattern(int col){
        if(col==0){
            return;
        }
        System.out.print("*");
        startPattern(col-1);
    }
    static void pattern(int row){
        if(row==0){
            return;
        }
        pattern(row-1);
        startPattern(row);
        System.out.println();

    }
    public static void main(String[] args) {
        pattern(5);

    }
}
