public class LeastCommonFactor {
    public static void main(String[] args) {
        int n = 7,m=5;
        int mini = Math.min(m,n);
        for(int i=mini;i <=n*m;i++){
            if(i%n==0 && i%m==0){
                System.out.println(i);
                break;
            }
        }
    }
}
