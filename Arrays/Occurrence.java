import java.util.Arrays;

public class Occurrence {

    static int searchCount(int arr[],int index,int target){
        if(index==arr.length){
            return 0;
        }
        int count = searchCount(arr, index+1, target);
        if(target==arr[index]){
            count++;
        }
        return count;
    }

    //helper function to returnIndex
    static int[] helper(int arr[],int index,int target,int count){
        //base count
        if(arr.length ==index){
            int res[] = new int[count];
            return res;
        }
        if(target == arr[index]){
            count++;
        }
        int[] res = helper(arr, index+1, target, count);
        //backtracking
        if(arr[index]==target){
            res[count-1] = index;
        }
        return res;
    }

     static int[] returnIndex(int arr[],int index,int target){
        return helper(arr, index, target,0);
       
    }
    public static void main(String[] args) {
        int arr[] = {90,65,34,65,24,65,65,89};
        int count[] = returnIndex(arr, 0, 65);    
        System.out.println(Arrays.toString(count));

    }
}
