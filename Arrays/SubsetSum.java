public class SubsetSum {
    static int subsetsum(int arr[],int target){
        int count =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i+1;j<n;j++){
                sum+=arr[i]+ arr[j];
                if(sum==target){
                    count++;
                }
            }
        }
        return count;

    }

    static int subsetSum(int arr[],int target){
        int count = 0;
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum==target){
                count++;
                sum=0;
            }
            if(sum > target){
                sum=0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // int arr[] = {10,5,7,8,100};
        int arr[] = {10,15,20};
        // int ways = subsetsum(arr,15 );
        int ways = subsetSum(arr,25 );
        System.out.println(ways);
    }
}
