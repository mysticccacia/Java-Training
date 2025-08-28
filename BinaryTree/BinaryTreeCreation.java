package BinaryTree;

import java.util.Scanner;

class BinaryTree{
    int data;
    BinaryTree left;
    BinaryTree right;
    BinaryTree(int data){
        this.data = data;
        left =right = null;
    }

}

 class BinaryTreeOperation {
    static Scanner scanner = new Scanner(System.in);
    static BinaryTree TreeCreation(){   
        System.out.println("Enter the data of the parent node or -1:");
        int data = scanner.nextInt();
        if(data==-1){
            return null;
        }
        BinaryTree root = new BinaryTree(data);
        System.out.println("Enter the data of the left node:");
        root.left = TreeCreation();
        System.out.println("Enter the data of the right child:");
        root.right = TreeCreation();
        return root;
    }

    static void TraverseTree(BinaryTree root){
        if(root==null) return;
        
        System.out.print(root.data + " ");
        TraverseTree(root.left);
        TraverseTree(root.right);
    }  
}

public class BinaryTreeCreation {
    public static void main(String[] args) {
        BinaryTree root = BinaryTreeOperation.TreeCreation();
        BinaryTreeOperation.TraverseTree(root);
    }
}
