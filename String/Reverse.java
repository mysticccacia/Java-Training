public class Reverse {

    static String reverse(String str){
        if(str.length()==0){
            return "";
        }

        String newStr = reverse(str.substring(1));
        newStr+=str.charAt(0);
        return newStr;
    }
    public static void main(String[] args) {
        
        System.out.println(reverse("naman"));
    }
}
