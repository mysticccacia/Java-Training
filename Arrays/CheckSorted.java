public class CheckSorted {
    static boolean IsSorted(int[] arr,int index){
        if(index ==arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        return IsSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5};
        System.out.println(IsSorted(arr, 0));
    }
}
