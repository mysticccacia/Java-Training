public class MaxElement {
    static int max(int arr[],int index){
        if(index==arr.length){
            return Integer.MIN_VALUE;
        }
        int maxy = max(arr,index+1);
        if(arr[index]>maxy) maxy = arr[index];
        return maxy; 
    }

    static void max(int arr[],int index,int maxx){
        if(index == arr.length){
            System.out.println(maxx);
            return;
        }
        if(arr[index] > maxx) maxx = arr[index];
        max(arr,++index,maxx);
    }
    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        int arr[] ={1,2,3,4,5};
        int maxi = max(arr,0);
    
        System.out.println(maxi);
        double end = System.currentTimeMillis(); // End time
        System.out.println("Time taken: " + (end - start) + " ms");
        

    }
}
