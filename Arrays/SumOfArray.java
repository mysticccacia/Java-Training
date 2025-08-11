public class SumOfArray {

    static int doSum(int arr[],int index){
        if(index==arr.length){
            return 0;
        }
        int sum = doSum(arr, index+1);
        sum+=arr[index];
        return sum;
    }

    static void doSum(int arr[],int index , int sum){
        if(index==arr.length){
            System.out.println("Sum is :"+ sum);
            return;
        }
        sum+=arr[index];
        doSum(arr, index+1,sum);
    }

    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        // int sum = doSum(arr, 0);
        doSum(arr, 0,0);
        // System.out.println(sum);
         double end = System.currentTimeMillis(); // End time
        System.out.println("Time taken: " + (end - start) + " ms");
    }
}
