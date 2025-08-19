public class HanoiTower {

    static void tower(int n, char from, char to,char aux ){
        if(n==1){
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        tower(n-1,from,aux,to);
        System.out.println("Move disk" + n + " from " + from + " to " + to);
        tower(n-1, aux, to, from);
    }
    public static void main(String[] args) {
        tower(3,'A','C','B');
    }
}
