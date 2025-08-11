import java.net.Socket;

public class SearchElement {

    static int Search(int arr[],int index,int target){
        if(index==arr.length){
            return -1;
        }
        
        if(target==arr[index]){
            return index;
        }
        return Search(arr,index+1,target);
    }
    
    static void Search2(int arr[],int index,int target){
        if(index==arr.length){
            System.out.println("not found");
            return;
        }
        
        if(target==arr[index]){
            System.out.println("Element found at:" + index);
            return;
        }
        Search(arr,index+1,target);
    }

   

    public static void main(String[] args) {
        int arr[] = {10,23,45,78,90,22};
        int pos = Search(arr, 0, 90);
        System.out.println(pos);
    }
}
