package Interview;

public class SecondLargest {
    public static void main(String[] args) {
         int max = Integer.MIN_VALUE;
         int secondMax = Integer.MIN_VALUE;

         int arr[] ={ 2,3,4,5,6,7,2,1};

         for(int i=0;i< arr.length;i++){
             if(arr[i] > max){
                max = arr[i];
             }
         }
         for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }
         }

         System.out.println("Second Largest Element is: " + secondMax);
    }
}
