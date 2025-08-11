public class TraverseArray {
    static void printArray(int[] arr,int index){
         if(index ==arr.length){
            return;
         }
         System.out.print(arr[index] + " ");
         printArray(arr, ++index);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        printArray(arr, 0);
    }
}
