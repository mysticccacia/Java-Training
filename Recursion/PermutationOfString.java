public class PermutationOfString {

    static void permute(String ans,String res){
        if(ans.isEmpty()){
            System.out.println(res);
            return;
        }
        for(int i=0;i<ans.length();i++){
            char ch = ans.charAt(i);
            String remaining = ans.substring(0,i) + ans.substring(i+1);
            permute(remaining, res+ch);
        }
    }
    public static void main(String[] args) {
        // permute("ABC", "");

    }
}