public class rotate {
    public static void main(String[] args) {
        int num = 72456;
        int k = 8;
        int numcopy = num;
        int count = 0;
        while(numcopy!=0){
            numcopy/=10;
            count++;
        }
        k = k % count;
        int divisor = (int)Math.pow(10,k);
        int lastDigit = num%divisor; //45673 % 1000 = 673
        int firstDigit = num/divisor; //45673 /1000 = 45 
       
        int div = (int)Math.pow(10,count-k);
        int result = lastDigit * div + firstDigit;
        System.out.println(result); 
    }
}
