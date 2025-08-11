public class SearchAndReplace {

    static String searchReplace(String str, char search,char replace){
            if(str.length()==0){
                return "";
            }
            char firstChar = str.charAt(0);
            if(firstChar==search){
                firstChar = replace;
            }
            return firstChar + searchReplace(str.substring(1), search, replace);

    }
    public static void main(String[] args) {
        System.out.println( searchReplace("World", 'i', 'e'))
       ;
    }
}
