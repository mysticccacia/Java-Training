public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int n = 12,m = 18;
        int mini = Math.min(m,n);
        int max = 0;

        for(int i=1;i <= mini ; i++){
            if(m%i==0 && n%i==0){
                max = i;
            }
        }
        System.out.println(max);
    }
}
