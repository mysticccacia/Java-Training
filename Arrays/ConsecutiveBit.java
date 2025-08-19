public class ConsecutiveBit {

    static int countMaxBit(int arr[]){
        int count0 = 0;
        int count1 = 0;

        int max0 = 0;
        int max1 = 0;
        int n = arr.length;
        for(int i= 0 ;i<n;i++){
            if(arr[i]==1){
                count1++;
                max1 = Math.max(max1,count1);
                count0 = 0;
            }
            else{
                count0++;
                max0 =Math.max(max0,count0);
                count1 = 0;
            }    
        }
        return Math.max(max0,max1);
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,1,1,1};
        // int arr[] = {0,0,1,0,1,0};
        int maxi = countMaxBit(arr);
        System.out.println(maxi);
    }
}