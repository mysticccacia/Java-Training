public class CountVowel {
    public static void main(String[] args) {
        //0 1 2 3 4
        //a e i o u
        int[] arr = new int[5];
        char[] vowel = {'a','e','i','o','u'};
        String str = "Hello how are you?";
        str = str.toLowerCase();
        System.out.println(str);

        for(int i=0 ;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch =='a'){
                arr[0]++;
            }
            if(ch =='e'){
                arr[1]++;
            }
            if(ch =='i'){
                arr[2]++;
            }
            if(ch =='o'){
                arr[3]++;
            }
            if(ch =='u'){
                arr[4]++;
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(vowel[i] + ": " + arr[i]);
        }

    }
}
