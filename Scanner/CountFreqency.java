public class CountFreqency {
    public static void main(String[] args) {
        int[] freq = new int[10]; 
        
        long num = 2344563335L;
        while(num!=0){
            int lastDigit = (int)(num % 10);
            freq[lastDigit]++;
            num/=10;
        } 
        for(int i=0;i<10;i++){
            System.out.println( i+ " : " + freq[i]);
        }
        
    }
}
