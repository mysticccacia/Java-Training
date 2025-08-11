public class EvenOddPlaceSum {
    public static void main(String[] args) {
        int num = 8765;
        int count = 1;
        int evenSum = 0;
        int oddSum = 0;
        while(num!=0){
            int digit = num%10;
            if(count%2==0){
                evenSum+=digit;
            }
            else{
                oddSum+=digit;
            }
            count++;
            num/=10;
        }
        System.out.println("odd Sum:" + oddSum);
        System.out.println("even Sum:" + evenSum);
    }
}
