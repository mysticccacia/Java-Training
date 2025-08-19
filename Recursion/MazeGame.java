public class MazeGame {

    static int findPath(int startRow, int startCol, int endRow,int endCol,String result){
        if(startRow == endRow && startCol==endCol){
            System.out.println(result);
            return 1;
        }
        if(startRow > endCol || startCol > endCol){
            return 0;
        }
        return findPath(startRow, startCol+1, endRow, endCol,result + "col->") + findPath(startRow+1, startCol, endRow, endCol,result + "row->");
    }
    public static void main(String[] args) {
       int result =  findPath(0, 0, 1, 1, "");
       System.out.println("Total path:" + result);
    }
}
