public class SubSequence {

    static void SubSequenceString(String str,String result){
        if(str.length() == 0){
            System.out.println(result);
            return;
        }
        SubSequenceString(str.substring(1),result + str.charAt(0));
        SubSequenceString(str.substring(1),result);
    }

    static int SubSequenceStr(String str,String result){
        if(str.length() == 0){
            System.out.println(result);
            return 1;
        }
        return SubSequenceStr(str.substring(1),result + str.charAt(0)) + SubSequenceStr(str.substring(1), result);

    }
    public static void main(String[] args) {
        String str = "Hello";
        // SubSequenceString(str, "");
        int result =SubSequenceStr(str, "");
        System.out.println(result);
        

    }
}
