public class DicePath {

    static void printPos(int start,int end,String result){
        if(start==end){
            System.out.print(result + " ");
            return;
        }
        if(start>end){
            return;
        }
        for(int dice = 1;dice<=6;dice++){
            printPos(start+dice, end, result+dice);
        }
    }

    static int NoOfWay(int curr,int end,String res){
        if(curr ==end){
            System.out.println(res+" ");
            return 1;
        }
        if(curr>end){
            return 0;
        }
        return NoOfWay(curr+1, end,res+1) + NoOfWay(curr+2, end,res+2) + NoOfWay(curr+3, end,res+3) + NoOfWay(curr+4, end,res+4) + NoOfWay(curr+5, end,res+5) + NoOfWay(curr+6, end,res+6);
    }
    public static void main(String[] args) {
        // printPos(0, 3, "");
        int res = NoOfWay(0, 6, "");
        System.out.println("Total no. of possibilities: "+ res);
    }
}
