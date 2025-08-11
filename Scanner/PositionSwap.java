public class PositionSwap {
    public static void main(String[] args) {
        
        // 5 4 3 2 1
        // 3 2 1 4 5
        int num = 32145;
        int count = 1;
        int digit = 0;
        while(num!=0){
            int last = num%10;
            digit = digit + count * (int)Math.pow(10,last-1) ;
            count++;
            num/=10;
        }
        System.out.println(digit);
    }
}
