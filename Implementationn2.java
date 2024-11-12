import java.util.Scanner;

public class Implementationn2 {
    class Node{
        int val;
        Node left;
        Node right;
       public Node(int val) {
           this.val = val;
           this.left = this.right = null;
       }
    }

    public Node BinaryTree(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == -1) return null;

        Node temp = new Node(x);
        //left side nodes
        System.out.print("Enter the left child node of " +x+" :");
        temp.left = BinaryTree();

        //right side node
        System.out.print("Enter the right child node of " +x+" :");
        temp.right = BinaryTree();

        return temp;
    }

    public static void main(String[] args) {

        Implementationn2 tree = new Implementationn2();

        System.out.print("Enter the root node : ");
        Node root = tree.BinaryTree();
        tree.preordertraversal(root);
        System.out.println();
        tree.inordertraversal(root);
        System.out.println();
        tree.postordertraversal(root);
    }


    //this is for pre order traversal
    private void preordertraversal(Node root) {
        if(root == null) return;

        System.out.print(root.val +" ");
        preordertraversal(root.left);
        preordertraversal(root.right);

    }

    //this is for in order traversal
    private void inordertraversal(Node root) {
        if(root == null) return;

        inordertraversal(root.left);
        System.out.print(root.val +" ");
        inordertraversal(root.right);

    }


    //this is for post order traversal
    private void postordertraversal(Node root) {
        if(root == null) return;

        postordertraversal(root.left);

        postordertraversal(root.right);
        System.out.print(root.val +" ");

    }
}
