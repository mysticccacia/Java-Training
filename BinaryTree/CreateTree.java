
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryTreeNode{
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int data){
        this.data = data;
        left = right = null;
    }
}



public class CreateTree {
    static void TraverseTree(BinaryTreeNode root){
    if(root==null)
    return;
    
    System.out.print(root.data + " ");
    TraverseTree(root.left);
    TraverseTree(root.right);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root data:");
        int rootData = sc.nextInt();
        
        BinaryTreeNode root = new BinaryTreeNode(rootData);
        
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            if(queue.peek().data>=1){
                System.out.println("Enter the left child of the :"+ queue.peek().data + ":" );
                int x = sc.nextInt();
                if(x>=1){
                    BinaryTreeNode temp = new BinaryTreeNode(x);
                    queue.peek().left = temp;
                    queue.add(temp);
                }
                  
            }
            if(queue.peek().data>=1){
                 System.out.println("Enter the right child of the :"+ queue.peek().data + ":");
                int x = sc.nextInt();
                if(x>=1){
                    BinaryTreeNode temp = new BinaryTreeNode(x);
                    queue.peek().right = temp;
                    queue.add(temp);
                }
                
            }
            queue.remove();
        }
        TraverseTree(root);

    }
}
