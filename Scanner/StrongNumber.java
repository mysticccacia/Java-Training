public class StrongNumber {
    public static int factorial(int fact){
        if(fact==1 || fact==0){
            return 1;
        }
        else{
            return fact * factorial(fact-1);
        }
    }
    public static void main(String[] args) {
        int num = 165;
        int sum = 0;
        int numcopy = num;
        while(num!=0){
            int digit = num%10;
            int fact = factorial(digit);
            sum+=fact;
            num/=10;
        }

        if(sum==numcopy){
            System.out.println(numcopy +" is a Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
        
    }
}
