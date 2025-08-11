public class TreeRecursion {

    static void show(int n){
        if(n<=0){
            return;
        }
        System.out.print(n+" ");
        show(n-1);
        System.out.print(n+" ");
        show(n-2);
        System.out.print(n+" ");
        show(n-3);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        show(5);
    }
}
