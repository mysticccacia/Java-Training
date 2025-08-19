class ArrayOperations{
    int arr[];
    int size;
    ArrayOperations(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    void insert(int index,int value){
        if(index>size){
            System.out.println("Not possible");
            return;
        }
        else{
            if(arr[index]>0){
                arr[index+1] = arr[index];
                return;
            }
            else{
                arr[index] = value;
                return;
            }
        }
    }
    void remove(int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                arr[i] = 0;
                return;
            }
        }

    }
    int search(int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value)
                return i;   
        }
    }

    void update(int oldval,int newval){
        
    }
    void print(){

    }
}

public class CrudOperation {
    public static void main(String[] args) {
        
    }
}

// dontpad.com/ims-b1-code